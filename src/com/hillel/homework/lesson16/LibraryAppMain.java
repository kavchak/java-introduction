package com.hillel.homework.lesson16;

import java.util.Scanner;

public class LibraryAppMain {

    private enum Action {
        ADD,
        DELETE,
        LIST
    }

    private static final int MENU_SIZE = 3;
    private static final Library library = new Library();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printLibraryMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    manageItems(Genre.class.getSimpleName());
                    break;
                case 2:
                    manageItems(Author.class.getSimpleName());
                    break;
                case 3:
                    manageItems(Book.class.getSimpleName());
                    break;
                case 0:
                    System.out.println("\nExiting Library Menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printLibraryMenu() {
        System.out.println("\nLibrary Menu:");
        System.out.println("1. Manage Genres");
        System.out.println("2. Manage Authors");
        System.out.println("3. Manage Books");
        System.out.println("0. Exit");
    }

    private static int getUserChoice() {
        int choice;
        while (true) {
            System.out.print("\nPlease enter your choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice <= LibraryAppMain.MENU_SIZE) {
                    break;
                } else {
                    System.out.println("\nInvalid choice. Please enter a number between 0 and " + LibraryAppMain.MENU_SIZE + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a number.");
            }
        }
        return choice;
    }

    private static void manageItems(String itemType) {
        while (true) {
            printItemsMenu(itemType);
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    performAction(itemType, Action.ADD);
                    break;
                case 2:
                    performAction(itemType, Action.DELETE);
                    break;
                case 3:
                    performAction(itemType, Action.LIST);
                    break;
                case 0:
                    System.out.println("Returning to main menu.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printItemsMenu(String itemType) {
        System.out.println("\n" + itemType + " Menu:");
        System.out.println("1. Add " + itemType);
        System.out.println("2. Delete " + itemType);
        System.out.println("3. List All " + itemType + "s");
        System.out.println("0. Back to Main Menu");
    }

    private static void performAction(String itemType, Action action) {
        switch (action) {
            case ADD:
                addItem(itemType);
                break;
            case DELETE:
                deleteItem(itemType);
                break;
            case LIST:
                listAllItems(itemType);
                break;
            default:
                System.out.println("Invalid action. Please try again.");
        }
    }

    private static void addItem(String itemType) {
        if (itemType.equals(Genre.class.getSimpleName())) {
            addGenre();
        } else if (itemType.equals(Author.class.getSimpleName())) {
            addAuthor();
        } else if (itemType.equals(Book.class.getSimpleName())) {
            addBook();
        }
    }

    private static void addGenre() {
        String name = getNonEmptyInput("\nEnter genre name: ");

        System.out.println("\nEnter genre description (optional): ");
        String description = scanner.nextLine().trim();

        Genre genre = new Genre(name, description);
        library.addGenre(genre);
        System.out.println("\nGenre added successfully.");
        listAllGenres();
    }

    private static void addAuthor() {
        String firstName = getNonEmptyInput("\nEnter author's first name: ");
        String lastName = getNonEmptyInput("\nEnter author's last name: ");

        Author author = new Author(firstName, lastName);
        library.addAuthor(author);
        System.out.println("\nAuthor added successfully.");
        listAllAuthors();
    }

    private static void addBook() {
        String title = getNonEmptyInput("\nEnter book title: ");

        System.out.println("\nEnter book description (optional): ");
        String description = scanner.nextLine();

        int year = getIntInput("\nEnter publication year (use only numbers): ");

        if (library.getAllGenres().isEmpty()) {
            handleMissingItem(Genre.class.getSimpleName());
        } else {
            listAllGenres();
        }

        int genreId = getIntInput("\nEnter genre ID (use only numbers): ");

        Genre genre = library.getGenreById(genreId);
        if (genre == null) {
            System.out.println("\nInvalid genre ID. Book not added.");
            return;
        }

        if (library.getAllAuthors().isEmpty()) {
            handleMissingItem(Author.class.getSimpleName());
        } else {
            listAllAuthors();
        }

        int authorId = getIntInput("\nEnter author ID (use only numbers): ");

        Author author = library.getAuthorById(authorId);
        if (author == null) {
            System.out.println("\nInvalid author ID. Book not added.");
            return;
        }

        Book book = new Book(title, description, year, genre, author);
        library.addBook(book);
        System.out.println("\nBook added successfully.");
        listAllBooks();
    }

    private static String getNonEmptyInput(String message) {
        String input;
        while (true) {
            System.out.println(message);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("\nInput cannot be empty. Please try again.");
        }
    }

    private static int getIntInput(String messageForUser) {
        int input;
        while (true) {
            System.out.print(messageForUser);
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input. Please enter a number.");
            }
        }
        return input;
    }

    private static void handleMissingItem(String itemType) {
        System.out.println("\nNo " + itemType + " available. You need to add a " + itemType + " first.");
        System.out.println("Possible options: ");
        System.out.println("1. Create " + itemType);
        System.out.println("0. Exit to Main Menu");

        while (true) {
            int choice = getUserChoice();

            if (choice == 1) {
                if (itemType.equals(Genre.class.getSimpleName())) {
                    addGenre();
                } else if (itemType.equals(Author.class.getSimpleName())) {
                    addAuthor();
                }
                break;
            } else if (choice == 0) {
                return;
            } else {
                System.out.println("\nInvalid choice. Please try again.");
            }
        }
    }

    private static void deleteItem(String itemType) {
        if (itemType.equals(Genre.class.getSimpleName())) {
            deleteGenre();
        } else if (itemType.equals(Author.class.getSimpleName())) {
            deleteAuthor();
        } else if (itemType.equals(Book.class.getSimpleName())) {
            deleteBook();
        }
    }

    private static void deleteGenre() {
        listAllGenres();

        int id = getIntInput("\nEnter the ID of the genre you want to delete (use only numbers): ");

        Genre genreToDelete = library.getGenreById(id);

        if (genreToDelete != null) {
            library.deleteGenre(genreToDelete.getId());
            System.out.println("\nGenre deleted successfully.");
            listAllGenres();
        } else {
            System.out.println("\nGenre not found.");
        }
    }

    private static void deleteAuthor() {
        listAllAuthors();

        int id = getIntInput("\nEnter the ID of the author you want to delete (use only numbers): ");

        Author authorToDelete = library.getAuthorById(id);

        if (authorToDelete != null) {
            library.deleteAuthor(authorToDelete.getId());
            System.out.println("\nAuthor deleted successfully.");
            listAllAuthors();
        } else {
            System.out.println("\nAuthor not found.");
        }
    }

    private static void deleteBook() {
        listAllBooks();

        int id = getIntInput("\nEnter the ID of the book you want to delete (use only numbers): ");

        Book bookToDelete = library.getBookById(id);

        if (bookToDelete != null) {
            library.deleteBook(bookToDelete.getId());
            System.out.println("\nBook deleted successfully.");
            listAllBooks();
        } else {
            System.out.println("\nBook not found.");
        }
    }

    private static void listAllItems(String itemType) {
        if (itemType.equals(Genre.class.getSimpleName())) {
            listAllGenres();
        } else if (itemType.equals(Author.class.getSimpleName())) {
            listAllAuthors();
        } else if (itemType.equals(Book.class.getSimpleName())) {
            listAllBooks();
        }
    }

    private static void listAllGenres() {
        System.out.println("\nAll Available Genres:");
        if (library.getAllGenres().isEmpty()) {
            System.out.println("{}");
        } else {
            for (Genre genre : library.getAllGenres()) {
                System.out.println(genre);
            }
        }
    }

    private static void listAllAuthors() {
        System.out.println("\nAll Available Authors:");
        if (library.getAllAuthors().isEmpty()) {
            System.out.println("{}");
        } else {
            for (Author author : library.getAllAuthors()) {
                System.out.println(author);
            }
        }
    }

    private static void listAllBooks() {
        System.out.println("\nAll Available Books:");
        if (library.getAllBooks().isEmpty()) {
            System.out.println("{}");
        } else {
            for (Book book : library.getAllBooks()) {
                System.out.println(book);
            }
        }
    }
}