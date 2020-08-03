package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    var doubleValue = 10_000_000.53;

	    /*Number format*/
        var numF = NumberFormat.getNumberInstance();
        System.out.println(numF.format(doubleValue));       //output: 10,000,000.53

        /*Integer format*/
        var intF = NumberFormat.getIntegerInstance();
        System.out.println(intF.format(doubleValue));       //output:10,000,001

        /*If you don't want any notation in your output*/
        intF.setGroupingUsed(false);
        System.out.println(intF.format(doubleValue));       //output 10000001

        /*We can display the format of a number depends on the location in the world*/
        /*Different places have different way to display numbers*/
        Locale locale = new Locale("de", "DE");
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println(localeFormatter.format(doubleValue));        //output: 10.000.000,53

        /*Currency format*/
        var currencyFormat = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormat.format(doubleValue));         //output: 10.000.000,53 €

        /*Custom format*/
        var customFormat = new DecimalFormat("$00.00");
        System.out.println(customFormat.format(10000.56555));       //output: $10000.57
    }
}
