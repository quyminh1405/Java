package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        var file = new File("C:\\Users\\Admin\\Java\\3. Try Catch\\src\\hello.txt");
        System.out.println("File exists: " + file.exists());

        try (FileReader reader = new FileReader(file);
             BufferedReader br = new BufferedReader(reader)) {          //put all that stuff in there because we want after opening the file to read it will close itself
            var text = br.readLine();                                   //if you put within this try-catch block, the file will not be closed
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
