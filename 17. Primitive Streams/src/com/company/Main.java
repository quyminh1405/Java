package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IntStream.range(1, 4).forEach(System.out::println);         //1, 2, 3 (not inclusive 4)

        //find the average of the numbers squared
        //square each value in the array and then store them back with .map()
        Arrays.stream(new int[]{1, 2, 3, 4}).map(n -> n*n).average().ifPresent(System.out::println);

        //map double to int
        Stream.of(1.5, 3.5, 6.7, 9.8).mapToInt(Double::intValue).forEach(System.out::println);
    }
}
