package com.company;

import java.math.BigInteger;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        //Normal Lambda Expression
        IntFunction<String> intToString = (num) -> Integer.toString(num);
        System.out.println("Turn a num into a String, expected length value is 3 with the number 420: " + intToString.apply(420).length());

        //Apply the method reference for the method above
        IntFunction<String> intToString2 = Integer::toString;
        System.out.println("Turn a num into a String, expected length value is 3 with the number 420: " + intToString2.apply(420).length());

        //Normal Lambda Expression with constructor
        Function<String, BigInteger> bigInt = (string) -> new BigInteger(string);
        System.out.println("Turn a String into a big integer: " + bigInt.apply("564564654564"));

        //Apply the method reference
        Function<String, BigInteger> bigInt2 = BigInteger::new;
        System.out.println("Turn a String into a big integer: " + bigInt.apply("564564654564"));

        //Normal Lambda expression
        UnaryOperator<String> makeGreet = (string1) -> "Hello".concat(string1);
        System.out.println(makeGreet.apply(" my bruhda"));

        //method reference for the method above
        UnaryOperator<String> makeGreet2 = "Hello"::concat;
        System.out.println(makeGreet2.apply(" my sistuh"));

        //Consumer consume data but does not return anything. Here it takes in a String
        Consumer<String> consumer = System.out::println;
        consumer.accept("Bruh what is this shit");

        //Last test on BinaryOperator, takes 2 String values
        BinaryOperator<String> bruh = String::concat;
        System.out.println(bruh.apply("2 strings ", "are now 1, bitch"));

    }
}
