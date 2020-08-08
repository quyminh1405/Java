package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator addResult = Integer::sum;    //Calculator addResult = (a, b) -> a + b;
        System.out.println(addResult.calc(69, 420));

        Calculator maxResult = Integer::max;
        System.out.println(maxResult.calc(69,420));

        Calculator divideResult = (a,b) -> (b != 0 ? a/b :0);
        System.out.println(divideResult.calc(10,5));
    }
}
