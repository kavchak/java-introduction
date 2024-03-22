package com.hillel.homework.lesson12;

public class Person2 {

    public static final String DEFAULT_NAME = "Unknown";
    private final String name;
    private final Person2 father;
    private final Person2 mother;

    public Person2(String name, Person2 father, Person2 mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String fatherName = father != null ? father.getName() : DEFAULT_NAME;
        String motherName = mother != null ? mother.getName() : DEFAULT_NAME;

        return "Person{" +
                "name='" + name + '\'' +
                ", father='" + fatherName + '\'' +
                ", mother=" + motherName +
                '}';
    }
}
