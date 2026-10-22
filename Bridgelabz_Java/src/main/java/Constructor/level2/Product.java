/*
 * Q1. Product Inventory
 * Create a Product class with instance variables for details
 * and a class variable to count products created.
 */
package Constructor.level2;

public class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        setProductName(productName);
        setPrice(price);
        totalProducts++;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Product name cannot be empty."
            );
        }
        this.productName = productName.trim();
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

    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: Rs. %.2f%n", price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Product.displayTotalProducts();

        Product product1 = new Product("Notebook", 60);
        Product product2 = new Product("Pen", 20);

        System.out.println("\nProduct 1");
        product1.displayProductDetails();

        System.out.println("\nProduct 2");
        product2.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}