package com.company;

import java.math.BigDecimal;

public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    /*Because the result will be redundant so these lines just to make sure it's short*/
    public double findArea() {
        String stringSideLength = Double.toString(sideLength);
        var bigValue = new BigDecimal(stringSideLength);
        var result = bigValue.multiply(bigValue);
        var finalResult = result.doubleValue();
        return finalResult;
    }

    public double getSideLength() {
        return sideLength;
    }
}
