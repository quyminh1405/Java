package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int v1 = 0;
        int v2 = 0;
        String op = null;
        Scanner in = new Scanner(System.in);

        try {

            v1 = enterValue(in, "Enter the 1st number: ");
            v2 = enterValue(in, "Enter the 2nd number: ");

        } catch (Exception e) {
            System.out.println("You have to input in the correct format. Error: " + e.getMessage());
            return;
        }

        System.out.print("Select and operation (+ - * /): ");
        in.nextLine();                  //the last in.nextInt is still queued up so we need to release that
        op = in.nextLine();

        switch (op) {
            case "+":
                System.out.printf("v1 + v2 = %d", v1+v2);
                break;
            case "-":
                System.out.printf("v1 - v2 = %d", v1-v2);
                break;
            case "*":
                System.out.printf("v1 * v2 = %d", v1*v2);
                break;
            case "/":
                System.out.printf("v1 / v2 = %d", v1/v2);
                break;
            default:
                System.out.println("Please input the right format!");
        }
    }

    public static int enterValue(Scanner sc ,String prompt) {
        System.out.print(prompt);
        int v = sc.nextInt();
        return v;
    }
}
