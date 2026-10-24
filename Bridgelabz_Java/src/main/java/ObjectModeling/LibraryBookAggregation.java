/*
 * Q1. Library and Books
 * Demonstrate aggregation by adding independently
 * created books to different libraries.
 */
package ObjectModeling;

import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.title = title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }
        this.author = author.trim();
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    private String libraryName;
    private final ArrayList<Book> books;

    public Library(String libraryName) {
        setLibraryName(libraryName);
        this.books = new ArrayList<>();
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        if (libraryName == null || libraryName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Library name cannot be empty."
            );
        }
        this.libraryName = libraryName.trim();
    }

    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book cannot be null.");
        }

        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
    }
}

public class LibraryBookAggregation {
    public static void main(String[] args) {
        // Books exist independently of the libraries.
        Book book1 = new Book("DSA", "Akhil");
        Book book2 = new Book("OS", "Charan");

        Library library1 = new Library("SRM Library");
        Library library2 = new Library("City Library");

        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book1);

        library1.displayLibraryBooks();
        library2.displayLibraryBooks();

        library1.removeBook(book2);

        System.out.println("Removed Book Still Exists Independently");
        book2.displayDetails();
    }
}