package com.hillel.homework.lesson14;

public class Drink {

    private final DrinkType type;
    private final double price;

    public Drink(DrinkType type, double price) {
        this.type = type;
        this.price = price;
    }

    public DrinkType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void prepare() {
        System.out.println("Preparing the drink...");
    }
}
