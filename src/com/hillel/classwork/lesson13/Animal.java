package com.hillel.classwork.lesson13;

public class Animal {

    public static String DEFAULT_COLOR = "white";

    protected String color;

    public Animal(String color) {
        this.color = color;
    }

    public void speak(){
        System.out.println("animal speaks");
    }
}
