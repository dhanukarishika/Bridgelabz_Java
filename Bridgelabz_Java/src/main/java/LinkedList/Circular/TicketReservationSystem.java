
package LinkedList.Circular;

/*
 * Q9. Circular Linked List: Online Ticket Reservation System
 * Add, remove, display, search, and count ticket reservations.
 */

public class TicketReservationSystem {

    // Node to store ticket details
    static class Ticket {
        int id, seatNumber;
        String customerName, movieName, bookingTime;
        Ticket next;

        Ticket(int id, String customerName, String movieName,
               int seatNumber, String bookingTime) {
            this.id = id;
            this.customerName = customerName;
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.bookingTime = bookingTime;
        }
    }

    static Ticket head = null, tail = null;
    static int count = 0;

    // Add ticket at end
    static void addTicket(int id, String customer, String movie,
                          int seat, String time) {
        Ticket newNode = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        tail.next = head;
        count++;
    }

    // Remove ticket by ID
    static void removeTicket(int id) {
        if (head == null) return;

        Ticket temp = head, prev = tail;

        do {
            if (temp.id == id) {
                if (head == tail) {
                    head = tail = null;
                } else {
                    prev.next = temp.next;

                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = prev;
                }

                temp.next = null;
                count--;
                return;
            }

            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // Display ticket details
    static void showTicket(Ticket ticket) {
        System.out.println(ticket.id + " | " + ticket.customerName
                + " | " + ticket.movieName + " | "
                + ticket.seatNumber + " | " + ticket.bookingTime);
    }

    // Display all booked tickets
    static void display() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;

        do {
            showTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search tickets by customer name
    static void searchByCustomer(String name) {
        if (head == null) return;

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                showTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("Ticket not found");
    }

    // Search tickets by movie name
    static void searchByMovie(String movie) {
        if (head == null) return;

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                showTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) System.out.println("Ticket not found");
    }

    // Count total booked tickets
    static int countTickets() {
        return count;
    }

    public static void main(String[] args) {
        addTicket(101, "Rishika", "Inception", 12, "10:30 AM");
        addTicket(102, "Vaidehi", "Interstellar", 15, "11:00 AM");
        addTicket(103, "Ananya", "Inception", 18, "11:15 AM");

        System.out.println("Booked Tickets:");
        display();

        System.out.println("\nSearch by Customer:");
        searchByCustomer("Vaidehi");

        System.out.println("\nSearch by Movie:");
        searchByMovie("Inception");

        System.out.println("\nTotal Tickets: " + countTickets());

        removeTicket(102);

        System.out.println("\nAfter Cancellation:");
        display();

        System.out.println("\nTotal Tickets: " + countTickets());
    }
}
