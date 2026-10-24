/*
 * Q4. Shopping Cart System
 * Demonstrate static, this, final, and instanceof
 * using products with a shared discount.
 */
package ThisStaticFinal;

public class Product {
    private static double discount = 0;

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName,
                   double price, int quantity) {
        if (productID == null || productID.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Product ID cannot be empty."
            );
        }

        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Product name cannot be empty."
            );
        }

        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException(
                    "Price must be a valid non-negative number."
            );
        }

        if (quantity < 0) {
            throw new IllegalArgumentException(
                    "Quantity cannot be negative."
            );
        }

        this.productID = productID.trim();
        this.productName = productName.trim();
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductID() {
        return productID;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException(
                    "Quantity cannot be negative."
            );
        }
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        if (!Double.isFinite(newDiscount)
                || newDiscount < 0 || newDiscount > 100) {
            throw new IllegalArgumentException(
                    "Discount must be between 0 and 100."
            );
        }
        discount = newDiscount;
    }

    public double calculateTotalCost() {
        double subtotal = price * quantity;
        return subtotal - (subtotal * discount / 100);
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price per Unit: Rs. %.2f%n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Discount: %.2f%%%n", discount);
        System.out.printf("Total Cost: Rs. %.2f%n", calculateTotalCost());
    }

    public static void main(String[] args) {
        Product product1 = new Product("P101", "Notebook", 100, 3);
        Product product2 = new Product("P102", "Pen", 20, 5);

        Product.updateDiscount(10);

        Object[] products = {product1, product2, "Not a product"};

        for (Object object : products) {
            if (object instanceof Product) {
                Product product = (Product) object;
                product.displayDetails();
            } else {
                System.out.println("The object is not a Product.");
            }
            System.out.println();
        }
    }
}