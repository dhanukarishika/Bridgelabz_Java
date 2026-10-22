/*
 * Q5. Handle Mobile Phone Details
 * Create a MobilePhone class with brand, model,
 * and price, and display its details.
 */
package ObjectOrientedFundamental.level1;
import java.util.Scanner;
public class MobilePhone {
    private String brand;
    private String model;
    private double price;
    public MobilePhone(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand.trim();
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty.");
        }
        this.model = model.trim();
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException(
                    "Price must be a valid non-negative number."
            );
        }
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("\nMobile Phone Details");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.printf("Price: Rs. %.2f%n", price);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter phone brand: ");
            String brand = scanner.nextLine();
            System.out.print("Enter phone model: ");
            String model = scanner.nextLine();
            System.out.print("Enter phone price: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Price must be a number.");
                return;
            }
            double price = scanner.nextDouble();
            try {
                MobilePhone phone = new MobilePhone(brand, model, price);
                phone.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}