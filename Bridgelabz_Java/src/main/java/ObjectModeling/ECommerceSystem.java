/*
 * Q7. E-commerce Platform
 * Model customers placing orders that aggregate
 * independently created products.
 */
package ObjectModeling;
import java.util.ArrayList;
class Product {
    private final String productName;
    private final double price;
    public Product(String productName, double price) {
        if (productName == null || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty.");
        }
        if (!Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException("Price must be a valid non-negative number.");
        }
        this.productName = productName.trim();
        this.price = price;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public void displayDetails() {
        System.out.printf("%s: Rs. %.2f%n", productName, price);
    }
}
class Order {
    private final String orderId;
    private final ShoppingCustomer customer;
    private final ArrayList<Product> products;
    public Order(String orderId, ShoppingCustomer customer) {
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be empty.");
        }
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null.");
        }
        this.orderId = orderId.trim();
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        products.add(product);
    }
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        if (products.isEmpty()) {
            System.out.println("No products added.");
        }
        for (Product product : products) {
            product.displayDetails();
        }
        System.out.printf("Order Total: Rs. %.2f%n", calculateTotal());
    }
}
class ShoppingCustomer {
    private final String name;
    private final ArrayList<Order> orders;
    public ShoppingCustomer(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        this.name = name.trim();
        this.orders = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public Order placeOrder(String orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }
    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders placed.");
            return;
        }
        for (Order order : orders) {
            order.displayDetails();
            System.out.println();
        }
    }
}
public class ECommerceSystem {
    public static void main(String[] args) {
        Product notebook = new Product("Notebook", 100);
        Product pen = new Product("Pen", 20);
        ShoppingCustomer customer = new ShoppingCustomer("Rishika");
        Order order1 = customer.placeOrder("ORD101");
        order1.addProduct(notebook);
        order1.addProduct(pen);
        Order order2 = customer.placeOrder("ORD102");
        order2.addProduct(notebook);
        System.out.println("Customer Orders");
        customer.displayOrders();
        System.out.println("Independent Product Details");
        notebook.displayDetails();
    }
}