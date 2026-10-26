/*
  This program demonstrates abstraction, inheritance, polymorphism and interfaces in a Food Delivery System.
  It manages veg and non-veg food items with price calculation and discount operations.
 */

package EncPolyAbs;

import java.util.ArrayList;
import java.util.List;

// Abstract class containing common properties and methods for food items
abstract class FoodItem{
    String item_name;
    double price;
    int quantity;

    FoodItem(String item_name,double price, int quantity){
        // Initializes the common food item details
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
    }

    // Abstract method that must be implemented by child classes
    abstract void calculateTotalPrice();

    // Displays the details of a food item
    public void displayItemDetails(){
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

}

// Interface defining discount-related operations
interface Discountable{
    public void applyDiscount();
    public String getDiscountDetails();
}

// VegItem inherits FoodItem and implements Discountable
class VegItem extends FoodItem implements Discountable{

    double gst;
    List<FoodItem> items;
    double total_price;
    int discount;

    VegItem(String item_name, double price, int quantity, double gst){
        super(item_name, price, quantity);

        this.gst = gst;

        // Creates a list to store veg food items
        items = new ArrayList<>();
    }

    // Adds a veg item to the list
    public void addVegItems(VegItem veg){
        items.add(veg);
    }

    // Calculates the total price based on price and quantity
    @Override
    void calculateTotalPrice() {
        total_price = price * quantity;
    }

    // Applies a fixed discount to the veg item
    @Override
    public void applyDiscount() {
        discount = 50;
    }

    // Returns the discount details
    @Override
    public String getDiscountDetails() {
        return "Discount is" + discount;
    }

    // Displays all veg item details
    public void displayItems(){
        // Iterates through all stored food items
        for(FoodItem item : items){
            item.displayItemDetails();

            // Displays the discount amount
            System.out.println("Discount applied: " + discount + "Rs");

            // Displays the final price after discount
            System.out.println("Total Price: " + (total_price - discount));
            System.out.println();
        }
    }

}

// NonVegItem inherits FoodItem and implements Discountable
class NonVegItem extends FoodItem implements Discountable{

    double gst;
    List<FoodItem> items;
    double total_price;
    int discount;

    NonVegItem(String item_name, double price, int quantity, double gst){
        super(item_name, price, quantity);

        this.gst = gst;

        // Creates a list to store non-veg food items
        items = new ArrayList<>();
    }

    // Adds a non-veg item to the list
    public void addVegItems(NonVegItem nonveg){
        items.add(nonveg);
    }

    // Calculates the total price based on price and quantity
    @Override
    void calculateTotalPrice() {
        total_price = price * quantity;
    }

    // Applies a fixed discount to the non-veg item
    @Override
    public void applyDiscount() {
        discount = 100;
    }

    // Returns the discount details
    @Override
    public String getDiscountDetails() {
        return "Discount is" + discount;
    }

    // Displays all non-veg item details
    public void displayItems(){
        // Iterates through all stored food items
        for(FoodItem item : items){
            item.displayItemDetails();

            // Displays the discount amount
            System.out.println("Discount applied: " + discount + "Rs");

            // Displays the final price after discount
            System.out.println("Total Price: " + (total_price - discount));
            System.out.println();
        }
    }

}

// Main class for managing food delivery operations
public class FoodDeliverySystem {
    public static void main(String[] args){

        // Creates a veg food item
        VegItem veg = new VegItem("Paneer",400.23,2,40);

        // Adds the veg item to the list
        veg.addVegItems(veg);

        // Calculates the total price
        veg.calculateTotalPrice();

        // Applies the discount
        veg.applyDiscount();

        // Displays the veg item details
        veg.displayItems();

        // Creates a non-veg food item
        NonVegItem nonveg = new NonVegItem("Fish",300,4,50);

        // Adds the non-veg item to the list
        nonveg.addVegItems(nonveg);

        // Calculates the total price
        nonveg.calculateTotalPrice();

        // Applies the discount
        nonveg.applyDiscount();

        // Displays the non-veg item details
        nonveg.displayItems();
    }
}