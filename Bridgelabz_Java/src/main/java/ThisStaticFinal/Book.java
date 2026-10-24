/*
 * Q2. Library Management System
 * Demonstrate static, this, final, and instanceof
 * using library book details.
 */
package ThisStaticFinal;

public class Book {
    private static String libraryName = "Central Library";

    private String title;
    private String author;
    private final String isbn;

    public Book(String title, String author, String isbn) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }

        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Author cannot be empty.");
        }

        if (isbn == null || isbn.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be empty.");
        }

        this.title = title.trim();
        this.author = author.trim();
        this.isbn = isbn.trim();
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

    public String getIsbn() {
        return isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Book book2 = new Book("The Alchemist", "Paulo Coelho", "9780061122415");

        Book.displayLibraryName();

        Object[] books = {book1, book2, "Not a book"};

        for (Object object : books) {
            System.out.println();

            if (object instanceof Book) {
                Book book = (Book) object;
                book.displayDetails();
            } else {
                System.out.println("The object is not a Book.");
            }
        }
    }
}