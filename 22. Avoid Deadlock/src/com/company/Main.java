package com.company;

public class Main {

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) {
	    Thread cook1 = new Thread(() -> {
	        synchronized (spoon) {
	            System.out.println("Cook1 is holding the spoon");
	            System.out.println("Cook1 is waiting for the bowl");

	            synchronized (bowl) {
	                System.out.println("Cook1 is holding the spoon and the bowl");
	                System.out.println("Cook1 put down the spoon and the bowl");
                }
            }
        });

        Thread cook2 = new Thread(() -> {
            synchronized (spoon) {
                System.out.println("Cook2 is holding the spoon");
                System.out.println("Cook2 is waiting for the bowl");

                synchronized (bowl) {
                    System.out.println("Cook2 is holding the spoon and the bowl");
                    System.out.println("Cook2 put down the spoon and the bowl");
                }
            }
        });

        /*If we tell the cook2 to hold the bowl first, both of these threads will end up waiting for each other forever since there's only
        * one bowl and spoon (cook1 is holding the spoon and cook2 is holding the bowl
        * So in this problem, to avoid deadlock, we should let them hold the same object and wait for the same one too.*/


        cook1.start();
        cook2.start();
    }
}
