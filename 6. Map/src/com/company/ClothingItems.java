package com.company;

public class ClothingItems {
    public static final String SHIRT = "Shirt";
    public static final String HAT = "Hat";

    private String kind;
    private ClothingSize size;
    private double price;

    public ClothingItems(String kind, ClothingSize size, double price) {
        this.kind = kind;
        this.size = size;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public ClothingSize getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
}