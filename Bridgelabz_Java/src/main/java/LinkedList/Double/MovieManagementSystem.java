
package LinkedList.Double;

/*
 * Q2. Doubly Linked List: Movie Management System
 * Add, remove, search, display, and update movie records.
 */

public class MovieManagementSystem {

    // Node to store movie details
    static class Movie {
        String title, director;
        int year;
        double rating;
        Movie prev, next;

        Movie(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    static Movie head = null, tail = null;

    // Add movie at beginning
    static void addBeginning(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);
        newNode.next = head;

        if (head != null) head.prev = newNode;
        else tail = newNode;

        head = newNode;
    }

    // Add movie at end
    static void addEnd(String title, String director, int year, double rating) {
        Movie newNode = new Movie(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add movie at specific position (1-based)
    static void addPosition(int pos, String title, String director, int year, double rating) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            addBeginning(title, director, year, rating);
            return;
        }

        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Movie newNode = new Movie(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) temp.next.prev = newNode;
        else tail = newNode;

        temp.next = newNode;
    }

    // Remove movie by title
    static void removeMovie(String title) {
        Movie temp = head;

        while (temp != null && !temp.title.equalsIgnoreCase(title))
            temp = temp.next;

        if (temp == null) {
            System.out.println("Movie not found");
            return;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;

        temp.prev = temp.next = null;
    }

    // Search movies by director
    static void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found");
    }

    // Search movies by rating
    static void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("No movies found");
    }

    // Update movie rating
    static void updateRating(String title, double rating) {
        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = rating;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found");
    }

    // Display movie details
    static void displayMovie(Movie movie) {
        System.out.println(movie.title + " | " + movie.director
                + " | " + movie.year + " | " + movie.rating);
    }

    // Display movies forward
    static void displayForward() {
        Movie temp = head;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display movies in reverse
    static void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        addBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        addEnd("Interstellar", "Christopher Nolan", 2014, 8.7);
        addPosition(2, "Titanic", "James Cameron", 1997, 7.9);

        System.out.println("Forward Display:");
        displayForward();

        System.out.println("\nSearch by Director:");
        searchByDirector("Christopher Nolan");

        System.out.println("\nSearch by Rating:");
        searchByRating(7.9);

        updateRating("Titanic", 8.0);
        removeMovie("Inception");

        System.out.println("\nReverse Display After Update and Deletion:");
        displayReverse();
    }
}