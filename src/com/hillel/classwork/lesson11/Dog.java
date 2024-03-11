package com.hillel.classwork.lesson11;

public class Dog {

    String breed;
    String size;
    int age;
    String color;

    public Dog() {
        System.out.println("Dog has been created!");
    }

    public Dog(String breed, String size, int age, String color) {
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void run() {
        System.out.println("dog runs");
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dog) {
            Dog dog = (Dog) obj;
            return this.size.equals(dog.size) && this.age == dog.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + this.breed + '\'' +
                ", size='" + this.size + '\'' +
                ", age=" + this.age +
                ", color='" + this.color + '\'' +
                '}';
    }
}
