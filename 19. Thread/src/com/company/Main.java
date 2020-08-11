package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(Thread.activeCount());       counts number of threads are running right now

        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My first thread");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My second thread");
        thread2.start();

        /*Output:
        1 My second thread
        1 My first thread
        2 My second thread
        2 My first thread
        3 My second thread
        3 My first thread
        4 My second thread
        4 My first thread
        ...*/
    }
}
