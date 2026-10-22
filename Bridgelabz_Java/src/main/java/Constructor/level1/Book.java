/*
 * Q1. Book Constructors
 * Create a Book class with title, author, and price,
 * using default and parameterized constructors.
 */
package Constructor.level1;
public class Book {
    private String title;
    private String author;
    private double price;
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }
    public Book(String title, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
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
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException("Price must be a valid non-negative number.");
        }
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: Rs. %.2f%n", price);
    }
    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book customBook = new Book("The Alchemist", "Paulo Coelho", 350);
        System.out.println("Book Using Default Constructor");
        defaultBook.displayDetails();
        System.out.println("\nBook Using Parameterized Constructor");
        customBook.displayDetails();
    }
}