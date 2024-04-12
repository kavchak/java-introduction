package com.hillel.homework.lesson14;

public class Americano extends Drink {

    public Americano() {
        super(DrinkType.AMERICANO, 30);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing americano...");
    }
}
