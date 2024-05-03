package com.hillel.homework.lesson16;

public class Genre {
    private static int NEXT_ID = 1;

    private final int id;
    private final String name;
    private final String description;

    public Genre(String name, String description) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}