package com.company;

public class Main {

    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        account.topUp(100);

        /*The scenario here is theres a bank card that 2 people using at a time
        * sometimes this will work fine because the first thread already finish the method
        * but sometimes also, the second thread enter the method when the first one is still processing
        * therefore, we'll have this output
        * $100 successfully withdrawn
          $100 successfully withdrawn
          Current balance: -100
          Current balance: -100*/

        /*So if we put in the "synchronized" keyword in the ATM's withdraw method, each thread will enter it one at a time*/
        Thread thread1 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread thread2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        thread1.start();
        thread2.start();
    }

}
