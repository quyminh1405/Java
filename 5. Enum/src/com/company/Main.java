package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        ClothingItems ci1 = new ClothingItems(ClothingItems.SHIRT, ClothingSize.L, 399.9);
        Locale locale = new Locale("de", "DE");
        var currency = NumberFormat.getCurrencyInstance(locale);

        System.out.println(ci1.getKind() + " " + ci1.getSize() + " " + currency.format(ci1.getPrice()));
    }
}
