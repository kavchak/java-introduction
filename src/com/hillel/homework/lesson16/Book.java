package com.hillel.homework.lesson16;

public class Book {
    private static int NEXT_ID = 1;

    private final int id;
    private final String title;
    private final String description;
    private final int year;
    private final Genre genre;
    private final Author author;

    public Book(String title, String description, int year, Genre genre, Author author) {
        this.id = NEXT_ID++;
        this.title = title;
        this.description = description;
        this.year = year;
        this.genre = genre;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getYear() {
        return year;
    }

    public Genre getGenre() {
        return genre;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", year=" + year +
                ", genre=" + genre +
                ", author=" + author.getFullName() +
                '}';
    }
}