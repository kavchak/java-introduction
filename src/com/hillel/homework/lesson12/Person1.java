package com.hillel.homework.lesson12;

public class Person1 {

    private static final int DEFAULT_VALUE = -1;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int weight;
    private final int height;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = DEFAULT_VALUE;
        this.weight = DEFAULT_VALUE;
        this.height = DEFAULT_VALUE;
    }

    public Person1(String firstName, String lastName, int age, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
