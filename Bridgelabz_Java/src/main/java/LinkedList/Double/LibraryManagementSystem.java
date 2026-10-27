
package LinkedList.Double;

/*
 * Q5. Doubly Linked List: Library Management System
 * Add, remove, search, update, display, and count books.
 */

public class LibraryManagementSystem {

    // Node to store book details
    static class Book {
        int id;
        String title, author, genre;
        boolean available;
        Book prev, next;

        Book(int id, String title, String author, String genre, boolean available) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.available = available;
        }
    }

    static Book head = null, tail = null;
    static int count = 0;

    // Add book at beginning
    static void addBeginning(Book book) {
        book.next = head;

        if (head != null) head.prev = book;
        else tail = book;

        head = book;
        count++;
    }

    // Add book at end
    static void addEnd(Book book) {
        if (head == null) {
            head = tail = book;
        } else {
            tail.next = book;
            book.prev = tail;
            tail = book;
        }
        count++;
    }

    // Add book at specific position (1-based)
    static void addPosition(int pos, Book book) {
        if (pos < 1 || pos > count + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addBeginning(book);
            return;
        }

        if (pos == count + 1) {
            addEnd(book);
            return;
        }

        Book temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        book.next = temp.next;
        book.prev = temp;
        temp.next.prev = book;
        temp.next = book;
        count++;
    }

    // Remove book by ID
    static void removeBook(int id) {
        Book temp = head;

        while (temp != null && temp.id != id)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        else head = temp.next;

        if (temp.next != null) temp.next.prev = temp.prev;
        else tail = temp.prev;

        temp.prev = temp.next = null;
        count--;
    }

    // Search book by title
    static void searchByTitle(String title) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                showBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("Book not found");
    }

    // Search books by author
    static void searchByAuthor(String author) {
        Book temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                showBook(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("Book not found");
    }

    // Update availability status
    static void updateAvailability(int id, boolean available) {
        Book temp = head;

        while (temp != null) {
            if (temp.id == id) {
                temp.available = available;
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found");
    }

    // Display book details
    static void showBook(Book book) {
        System.out.println(book.id + " | " + book.title + " | "
                + book.author + " | " + book.genre + " | "
                + (book.available ? "Available" : "Issued"));
    }

    // Display books forward
    static void displayForward() {
        Book temp = head;
        while (temp != null) {
            showBook(temp);
            temp = temp.next;
        }
    }

    // Display books in reverse
    static void displayReverse() {
        Book temp = tail;
        while (temp != null) {
            showBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    static int countBooks() {
        return count;
    }

    public static void main(String[] args) {
        addBeginning(new Book(101, "Clean Code", "Robert Martin", "Programming", true));
        addEnd(new Book(102, "Atomic Habits", "James Clear", "Self Help", true));
        addPosition(2, new Book(103, "The Alchemist", "Paulo Coelho", "Fiction", false));

        System.out.println("Forward Display:");
        displayForward();

        System.out.println("\nSearch by Title:");
        searchByTitle("Atomic Habits");

        System.out.println("\nSearch by Author:");
        searchByAuthor("Paulo Coelho");

        updateAvailability(103, true);
        removeBook(101);

        System.out.println("\nReverse Display:");
        displayReverse();

        System.out.println("\nTotal Books: " + countBooks());
    }
}
