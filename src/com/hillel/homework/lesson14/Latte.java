package com.hillel.homework.lesson14;

public class Latte extends Drink {

    public Latte() {
        super(DrinkType.LATTE, 50);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing latte...");
    }
}
