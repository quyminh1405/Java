package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //.stream() create a stream of those string, then sort the array alphabetically with .sorted(), find the first element and if presents, print it
        Arrays.asList("red", "green", "blue").stream().sorted().findFirst().ifPresent(System.out::println);

        Stream.of("Apple", " Pineapple", "Banana", "Apricot").filter(string -> string.startsWith("A"))
                .forEach(string -> System.out.println("Fruits start with A: " + string));

        //first mapping the strings to uppercase, .collect() then retain all the values that come out of .map() and store them in the List collected
        List<String> collected = Stream.of("bruh", "moment").map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collected);
    }
}
