/*
 * Q4. Model a Movie Ticket Booking System
 * Create a MovieTicket class to book a ticket
 * by assigning its seat and price, and display details.
 */
package ObjectOrientedFundamental.level2;
import java.util.Scanner;
public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    public MovieTicket(String movieName) {
        setMovieName(movieName);
        this.seatNumber = "Not assigned";
        this.price = 0;
    }
    public String getMovieName() {
        return movieName;
    }
    public void setMovieName(String movieName) {
        if (movieName == null || movieName.trim().isEmpty()) {
            throw new IllegalArgumentException("Movie name cannot be empty.");
        }
        this.movieName = movieName.trim();
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Seat number cannot be empty.");
        }
        this.seatNumber = seatNumber.trim();
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
    public void bookTicket(String seatNumber, double price) {
        // Validate both values before updating the ticket.
        if (seatNumber == null || seatNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Seat number cannot be empty.");
        }
        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException("Price must be a valid non-negative number.");
        }
        setSeatNumber(seatNumber);
        setPrice(price);
        System.out.println("\nTicket booked successfully!");
    }
    public void displayDetails() {
        System.out.println("\nMovie Ticket Details");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.printf("Price: Rs. %.2f%n", price);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter movie name: ");
            String movieName = scanner.nextLine();
            System.out.print("Enter seat number: ");
            String seatNumber = scanner.nextLine();
            System.out.print("Enter ticket price: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Price must be a number.");
                return;
            }
            double price = scanner.nextDouble();
            try {
                MovieTicket ticket = new MovieTicket(movieName);
                ticket.bookTicket(seatNumber, price);
                ticket.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}