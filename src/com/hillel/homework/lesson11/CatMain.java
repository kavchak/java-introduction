package com.hillel.homework.lesson11;

public class CatMain {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Oscar";
        cat1.age = 2;
        cat1.weight = 4.5;
        cat1.breed = "Domestic";

        Cat cat2 = new Cat("Bob", 2, 4.5, "Norwegian");

        Cat cat3 = new Cat("Felix", 5);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
    }
}
