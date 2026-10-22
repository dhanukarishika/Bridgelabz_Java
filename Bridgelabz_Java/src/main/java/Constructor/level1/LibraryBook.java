/*
 * Q5. Library Book System
 * Create a LibraryBook class with book details,
 * availability, and a method to borrow the book.
 */
package Constructor.level1;
public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean availability;
    public LibraryBook(String title, String author, double price, boolean availability) {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        this.availability = availability;
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
    public boolean isAvailable() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("You have borrowed \"" + title + "\".");
        } else {
            System.out.println("The book is currently unavailable.");
        }
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.printf("Price: Rs. %.2f%n", price);
        System.out.println("Availability: " + (availability ? "Available" : "Unavailable"));
    }
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("The Alchemist", "Paulo Coelho", 350, true);
        System.out.println("Book Details");
        book.displayDetails();
        System.out.println("\nFirst Borrow Attempt");
        book.borrowBook();
        System.out.println("\nBook Details After Borrowing");
        book.displayDetails();
        System.out.println("\nSecond Borrow Attempt");
        book.borrowBook();
    }
}