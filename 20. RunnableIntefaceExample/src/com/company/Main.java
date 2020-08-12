package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableExample());     //There's a Thread constructor that takes Runnable as argument
        thread1.start();

        //create a second thread inside Main since the implementation of the first thread was kinda short.
        Thread thread2 = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        thread2.start();
    }
}
