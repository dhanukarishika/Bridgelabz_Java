/*
 * Q6. Car Rental System
 * Create a CarRental class with constructors to initialize
 * rental details and a method to calculate total cost.
 */
package Constructor.level1;
import java.util.Scanner;
public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 1500.0;
    public CarRental() {
        this("Guest", "Standard Car", 1);
    }
    public CarRental(String customerName, String carModel, int rentalDays) {
        setCustomerName(customerName);
        setCarModel(carModel);
        setRentalDays(rentalDays);
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        this.customerName = customerName.trim();
    }
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        if (carModel == null || carModel.trim().isEmpty()) {
            throw new IllegalArgumentException("Car model cannot be empty.");
        }
        this.carModel = carModel.trim();
    }
    public int getRentalDays() {
        return rentalDays;
    }
    public void setRentalDays(int rentalDays) {
        if (rentalDays <= 0) {
            throw new IllegalArgumentException(
                    "Rental days must be positive."
            );
        }
        this.rentalDays = rentalDays;
    }
    public double calculateTotalCost() {
        return rentalDays * DAILY_RATE;
    }
    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Daily Rate: Rs. %.2f%n", DAILY_RATE);
        System.out.printf("Total Cost: Rs. %.2f%n", calculateTotalCost());
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            CarRental defaultRental = new CarRental();
            System.out.println("Default Rental");
            defaultRental.displayDetails();
            System.out.print("\nEnter customer name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter car model: ");
            String carModel = scanner.nextLine();
            System.out.print("Enter rental days: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Rental days must be an integer.");
                return;
            }
            int rentalDays = scanner.nextInt();
            try {
                CarRental rental = new CarRental(customerName, carModel, rentalDays);
                System.out.println("\nCustomer Rental");
                rental.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}