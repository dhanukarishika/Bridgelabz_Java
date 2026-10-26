/*
  This program demonstrates abstraction, inheritance and interfaces in a Library Management System.
  It manages library books with loan duration, reservation and availability operations.
 */

package EncPolyAbs;

// Abstract class representing common properties of library items
abstract class LibraryItem{
    int item_id;
    String title;
    String author;

    // Abstract method to define loan duration
    abstract void loanDuration();

    // Displays the details of the library item
    public void getItemDetails(){
        System.out.println("Item ID: " + item_id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

}

// Interface defining reservation and availability operations
interface Reservable{
    void reserverItem();
    boolean checkAvailability();
}

// Book inherits LibraryItem and implements Reservable
class Book extends LibraryItem implements Reservable{

    boolean available;
    boolean reserved;

    Book(int item_id, String title, String author){
        // Initializes the book details
        this.item_id = item_id;
        this.title = title;
        this.author = author;

        // Book is available when it is created
        this.available = true;
        this.reserved = false;
    }

    // Defines the loan duration for the book
    @Override
    void loanDuration() {
        System.out.println("Loan Duration: 14 days");
    }

    // Reserves the book if it is available
    @Override
    public void reserverItem() {
        if(available && !reserved){
            reserved = true;
            available = false;
            System.out.println("Book reserved successfully");
        }else{
            System.out.println("Book is not available for reservation");
        }
    }

    // Checks whether the book is currently available
    @Override
    public boolean checkAvailability() {
        return available;
    }

}

// Main class for managing the library
public class LibraryManagementSystem {
    public static void main(String[] args){

        // Creates a book object
        Book book = new Book(101, "Java Programming", "James Gosling");

        // Displays book details
        book.getItemDetails();

        // Displays the loan duration
        book.loanDuration();

        // Checks whether the book is available
        System.out.println("Book Available: " + book.checkAvailability());

        // Reserves the book
        book.reserverItem();

        // Checks availability after reservation
        System.out.println("Book Available After Reservation: " + book.checkAvailability());
    }
}