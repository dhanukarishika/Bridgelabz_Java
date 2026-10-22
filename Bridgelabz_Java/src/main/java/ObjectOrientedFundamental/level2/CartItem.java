/*
 * Q5. Simulate a Shopping Cart
 * Create a CartItem class to add and remove item quantities
 * and display the total cost.
 */
package ObjectOrientedFundamental.level2;
import java.util.Scanner;
public class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    public CartItem(String itemName, double price, int quantity) {
        setItemName(itemName);
        setPrice(price);
        setQuantity(quantity);
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be empty.");
        }
        this.itemName = itemName.trim();
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
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }
    public void addItem(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Quantity to add must be positive."
            );
        }
        if (amount > Integer.MAX_VALUE - quantity) {
            throw new IllegalArgumentException("Quantity is too large.");
        }
        quantity += amount;
        System.out.println("Added " + amount + " unit(s) to the cart.");
    }
    public void removeItem(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Quantity to remove must be positive.");
        }
        if (amount > quantity) {
            System.out.println("Cannot remove more than the cart quantity.");
            return;
        }
        quantity -= amount;
        System.out.println("Removed " + amount + " unit(s) from the cart.");
    }
    public double calculateTotalCost() {
        return price * quantity;
    }
    public void displayTotalCost() {
        System.out.println("\nCart Details");
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price per Unit: Rs. %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost: Rs. %.2f%n", calculateTotalCost());
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter price per unit: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Price must be a number.");
                return;
            }
            double price = scanner.nextDouble();
            try {
                CartItem item = new CartItem(itemName, price, 0);
                int choice = 0;
                do {
                    System.out.println("\nShopping Cart Menu");
                    System.out.println("1. Add Item Quantity");
                    System.out.println("2. Remove Item Quantity");
                    System.out.println("3. Display Total Cost");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Choice must be an integer.");
                        scanner.next();
                        continue;
                    }
                    choice = scanner.nextInt();
                    if (choice == 1 || choice == 2) {
                        System.out.print("Enter quantity: ");
                        if (!scanner.hasNextInt()) {
                            System.out.println("Quantity must be an integer.");
                            scanner.next();
                            continue;
                        }
                        int amount = scanner.nextInt();
                        try {
                            if (choice == 1) {
                                item.addItem(amount);
                            } else {
                                item.removeItem(amount);
                            }
                        } catch (IllegalArgumentException exception) {
                            System.out.println(exception.getMessage());
                        }
                    } else if (choice == 3) {
                        item.displayTotalCost();
                    } else if (choice == 4) {
                        System.out.println("Thank you for shopping!");
                    } else {
                        System.out.println("Please choose from 1 to 4.");
                    }
                } while (choice != 4);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}