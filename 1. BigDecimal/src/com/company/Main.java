package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	    //the problem with double
        double value = .012;
        double sum = value + value + value;
        System.out.println(sum);    //the answer is 0.036000000000000004 when it's supposed to be 0.036

        var stringValue = Double.toString(value);
        var bigValue = new BigDecimal(stringValue);
        var bigSum = bigValue.add(bigValue).add(bigValue);
        System.out.println(bigSum);
    }
}
