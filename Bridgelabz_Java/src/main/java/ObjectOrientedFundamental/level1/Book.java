/*
 * Q3. Handle Book Details
 * Create a Book class with title, author, and price,
 * and add a method to display its details.
 */
package ObjectOrientedFundamental.level1;
import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private double price;
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
        System.out.println("\nBook Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: Rs. %.2f%n", price);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author name: ");
            String author = scanner.nextLine();
            System.out.print("Enter book price: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Price must be a number.");
                return;
            }
            double price = scanner.nextDouble();
            try {
                Book book = new Book(title, author, price);
                book.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}