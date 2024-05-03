package com.hillel.homework.lesson16;

public class Author {
    private static int NEXT_ID = 1;

    private final int id;
    private final String fullName;

    public Author(String firstName, String lastName) {
        this.id = NEXT_ID++;
        this.fullName = firstName + " " + lastName;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}