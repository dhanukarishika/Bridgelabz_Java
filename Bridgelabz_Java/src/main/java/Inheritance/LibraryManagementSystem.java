/*
 * This program demonstrates inheritance between Book and Author classes.
 * The Author class inherits book details and adds information about the author.
 */

package Inheritance;

class Book{
    String title;
    int publication_year;

    // Constructor to initialize book details
    Book(String title, int publication_year){
        this.title=title;
        this.publication_year=publication_year;
    }

    // Displays the basic details of the book
    public void displayDetails(){
        System.out.println("Title: "+title);
        System.out.println("Publication Year: "+publication_year);
    }

    // Default constructor
    Book(){}
}

class Author extends Book{
    String name;
    String bio;

    // Calls the parent constructor and initializes author details
    Author(String title, int publication_year, String name,String bio){
        super(title, publication_year);
        this.name = name;
        this.bio = bio;
    }

    // Displays book details along with author information
    public void BookDetails(){
        super.displayDetails();
        System.out.println("Book Name: "+name);
        System.out.println("Bio: "+bio);
    }
}


public class LibraryManagementSystem {
    public static void main(String[] args){

        // Creating objects for Book and Author classes
        Book book = new Book("Story Books",2005);
        Author author = new Author("Story Books",2005,"Dream Story","Stories that wakes you up");

        // Displaying the complete book and author details
        author.BookDetails();
    }
}