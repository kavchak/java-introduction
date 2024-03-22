package com.hillel.homework.lesson12;

public class Person2Main {

    public static void main(String[] args) {

        Person2 father = new Person2("Peter", null, null);
        Person2 mother = new Person2("Kate", null, null);
        Person2 child = new Person2("Kevin", father, mother);

        System.out.println(father);
        System.out.println(mother);
        System.out.println(child);
    }
}
