package com.company;

import java.util.ArrayList;

public class Main {

    /*Using Stream to iterate over a collection is easier than using nested loops
    * The filter method is a lazy method, it just iterates through the collection and collects the author that starts with J and put them in the stream
    * The forEach is the eager method, it then prints out what ever is in the stream*/

    public static void main(String[] args) {
        System.out.println("Authors' names start with J: ");

        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> book.getAuthor().startsWith("J"))
                .forEach(System.out::println);


        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println();


        System.out.println("Authors' names starts with J and books' names start with E");
        books.stream().filter(book -> book.getAuthor().startsWith("J")).filter(book -> book.getTitle().startsWith("E"))
                .forEach(System.out::println);

        /*Output:
        Authors' names starts with J with books' names start with E
        Author: John Steinbeck. Title: East of Eden
        Author: Jane Austen. Title: Emma*/
    }

    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));
        return books;
    }
}
