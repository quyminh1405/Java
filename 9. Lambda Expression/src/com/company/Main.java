package com.company;

public class Main {

    public static void main(String[] args) {

	    Shape shape = (square) -> {
	        System.out.println("The area of a " + square.getSideLength() + " square is: " + square.findArea());
        };

	    Square square = new Square(6.9);
	    shape.getArea(square);
    }
}
