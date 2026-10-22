/*
 * Q2. Book Library System
 * Demonstrate access modifiers using a Book class
 * and its subclass EBook.
 */
package Constructor.level3;
public class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN, String title, String author) {
        if (ISBN == null || ISBN.trim().isEmpty()) {
            throw new IllegalArgumentException("ISBN cannot be empty.");
        }
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty.");
        }
        this.ISBN = ISBN.trim();
        this.title = title.trim();
        setAuthor(author);
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
    public static void main(String[] args) {
        EBook book = new EBook("9780134685991", "Effective Java", "Joshua Bloch");
        System.out.println("EBook Details");
        book.displayDetails();
        // Public members can be accessed directly.
        System.out.println("\nPublic ISBN: " + book.ISBN);
        book.setAuthor("Joshua J. Bloch");
        System.out.println("\nAfter Updating Author");
        book.displayDetails();
    }
}
class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        // The subclass can directly access the protected title.
        System.out.println("Title: " + title);
        // Private author is accessed through its public getter.
        System.out.println("Author: " + getAuthor());
    }
}