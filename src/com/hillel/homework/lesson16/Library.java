package com.hillel.homework.lesson16;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Author> authors;
    private final List<Book> books;
    private final List<Genre> genres;

    public Library() {
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
        this.genres = new ArrayList<>();
    }

    public void addGenre(Genre genre) {
        genres.add(genre);
    }

    public void deleteGenre(int id) {
        Genre genre = getGenreById(id);
        if (genre != null) {
            genres.remove(genre);
        }
    }

    public Genre getGenreById(int id) {
        for (Genre genre : genres) {
            if (genre.getId() == id) {
                return genre;
            }
        }
        return null;
    }

    public List<Genre> getAllGenres() {
        return new ArrayList<>(genres);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void deleteAuthor(int id) {
        Author author = getAuthorById(id);
        if (author != null) {
            authors.remove(author);
        }
    }

    public Author getAuthorById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    public List<Author> getAllAuthors() {
        return new ArrayList<>(authors);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int id) {
        Book bookToDelete = getBookById(id);
        if (bookToDelete != null) {
            books.remove(bookToDelete);
        }
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }
}