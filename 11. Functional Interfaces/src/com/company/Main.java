package com.company;

import java.util.function.*;

public class Main {

    /*These are some of the Functional Interfaces that was added in Java 8*/

    public static void main(String[] args) {
        //Predicate takes 1 argument and evaluate depends on your overriding using the 'test' method. It will return a boolean
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("Apple") + " - Apples is less than 10");          //true

        //Consumer interface takes 1 argument and is used by calling 'accept'. This one returns nothing
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("HKJJHGJHGJHGgkjgfkdshfFDAF");

        //Function interface takes 2 args, first one is the in-value, second is the return value. Use 'apply' as the method
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("Here is an Integer converted to String and then call the String length method: " + converter.apply(26).length());

        //Supplier takes no argument, then it returns a String
        Supplier<String> s = () -> "Java is fun(?)";
        System.out.println(s.get());

        //Just see this and understand urself, it returns the type you want. Since it's a BinaryOp, it takes 2 operands
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("69 + 420 = " + add.apply(69, 420));

        BinaryOperator<String> bruh = (a,b) -> a.concat(b);
        System.out.println(bruh.apply("bruh ", "moment"));

        //UnaryOperator takes 1 operand, works almost like BO
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("rise up bruhda and sista"));
    }
}
