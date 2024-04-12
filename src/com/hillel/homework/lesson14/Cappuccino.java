package com.hillel.homework.lesson14;

public class Cappuccino extends Drink {

    public Cappuccino() {
        super(DrinkType.CAPPUCCINO, 70);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing cappuccino...");
    }
}
