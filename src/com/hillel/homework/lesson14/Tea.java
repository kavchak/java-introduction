package com.hillel.homework.lesson14;

public class Tea extends Drink {

    public Tea() {
        super(DrinkType.TEA, 40);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing tea...");
    }
}
