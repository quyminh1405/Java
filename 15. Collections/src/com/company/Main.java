package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Paul", "Jane", "Michaela", "Sam");

        System.out.println(names);      //[Paul, Jane, Michaela, Sam]  (before sorting)

        //way to sort prior to Java 8 lambdas
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(names);      //[Sam, Paul, Michaela, Jane]  (after sorting)


        //eliminate all the redundant with lambdas
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Book book1 = new Book("Miss Peregrine's Home for Peculiar Children",
                "Ranson", "Riggs", 382);
        Book book2 = new Book("Harry Potter and The Sorcerers Stone",
                "JK", "Rowling", 411);
        Book book3 = new Book("The Cat in the Hat",
                "Dr", "Seuss", 45);


        List<Book> books = Arrays.asList(book1, book2, book3);
        int totalPage = books.stream().collect(Collectors.summingInt(Book::getPages));
        System.out.println(totalPage);


        //using .collect to aggregate author last names into a list
        //and .map to get the last name of the author
        List<String> list = books.stream().map(Book::getAuthorLName).collect(Collectors.toList());
        System.out.println(list);


        //remove duplicates using a Set
        List<Book> dupBooks = Arrays.asList(book1, book2, book3, book1, book2);
        System.out.println(dupBooks.toString());
        Collection<Book> noDups = new HashSet<>(dupBooks);          //Set interface automatically remove duplicates (we can use Set instead of Collection, too)
        System.out.println(noDups.toString());


        //Set remove and also sort automatically
        Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 3, 3, 2, 1, 1, 1));
        System.out.println(numbers);
    }
}
