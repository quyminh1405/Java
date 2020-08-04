package com.company;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        /*When you store things in Map, the order is unknown*/

        //the first one in <> is the key for each value, the second one is the value
        Map<String, ClothingItems> items = new HashMap<>();
        items.put("shirt", new Shirt(ClothingSize.L, 69));
        items.put("hat", new Hat(ClothingSize.S, 90));

        //if you want to loop through the whole map, first you need to gather all the keys
        var keys = items.keySet();

        for (String key : keys) {
            var item = items.get(key);
            displayProducts(item);
        }
    }

    private static void displayProducts(ClothingItems ci) {
        Locale locale = new Locale("de", "DE");
        var currency = NumberFormat.getCurrencyInstance(locale);

        System.out.println(ci.getKind() + " " + ci.getSize() + " " + currency.format(ci.getPrice()));
    }
}












