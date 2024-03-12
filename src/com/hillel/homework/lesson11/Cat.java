package com.hillel.homework.lesson11;

public class Cat {

    String name;
    int age;
    Double weight;
    String breed;

    public Cat() {
    }

    public Cat(String name, int age, Double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", weight=" + this.weight +
                ", breed='" + this.breed + '\'' +
                '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.weight.equals(cat.weight) && this.age == cat.age;
        }
        return false;
    }
}
