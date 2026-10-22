/*
 * Q4. Track Inventory of Items
 * Create an Item class to display item details
 * and calculate the total cost for a given quantity.
 */
package ObjectOrientedFundamental.level1;
import java.util.Scanner;
public class Item {
    private String itemCode;
    private String itemName;
    private double price;
    public Item(String itemCode, String itemName, double price) {
        setItemCode(itemCode);
        setItemName(itemName);
        setPrice(price);
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        if (itemCode == null || itemCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Item code cannot be empty.");
        }
        this.itemCode = itemCode.trim();
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
    public double calculateTotalCost(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        return price * quantity;
    }
    public void displayDetails() {
        System.out.println("\nItem Details");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.printf("Price per Unit: Rs. %.2f%n", price);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter item code: ");
            String itemCode = scanner.nextLine();
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();
            System.out.print("Enter price per unit: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Price must be a number.");
                return;
            }
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Quantity must be an integer.");
                return;
            }
            int quantity = scanner.nextInt();
            try {
                Item item = new Item(itemCode, itemName, price);
                double totalCost = item.calculateTotalCost(quantity);

                item.displayDetails();
                System.out.println("Quantity: " + quantity);
                System.out.printf("Total Cost: Rs. %.2f%n", totalCost);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}