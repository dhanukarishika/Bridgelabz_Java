/*
 This program demonstrates abstraction, encapsulation, inheritance and interfaces in a Product Management System.
 It manages electronics, clothing and grocery products with product details and tax calculation.
 */

package EncPolyAbs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Abstract class containing common product properties and methods
abstract class Products{
    private int prod_id;
    private String prod_name;
    private double price;

    // Setter method to assign product ID
    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    // Setter method to assign product name
    public void setProd_name(String prod_name){
        this.prod_name = prod_name;
    }

    // Setter method to assign product price
    public void setPrice(double price){
        this.price = price;
    }

    // Getter method to return product ID
    public int getProd_id(){
        return prod_id;
    }

    // Getter method to return product name
    public String getProd_name(){
        return prod_name;
    }

    // Getter method to return product price
    public double getPrice(){
        return price;
    }
}

// Interface defining tax-related operations
interface Taxable{
    public void calculateTax();
    public double getTaxDetails();
}

// Electronics inherits Products and implements Taxable
class Electronics extends Products implements Taxable{

    double tax;
    double gst;
    double cgst;
    double total;

    Electronics(double tax, double gst, double cgst){
        // Initializes the tax values
        this.cgst = cgst;
        this.gst = gst;
        this.tax = tax;
    }

    // Adds the electronics product details
    public void addProduct(String prod_name, int prod_id, double price){
        setProd_name(prod_name);
        setProd_id(prod_id);
        setPrice(price);
    }

    // Calculates the total price by adding all tax amounts
    public void calculateTax(){
        total = getPrice() + tax + gst + cgst;
    }

    // Returns the total price after adding taxes
    public double getTaxDetails(){
        return total;
    }

    // Displays the electronics product details
    public void displayProductDetails() {

        System.out.println("Product Name: " + getProd_name());
        System.out.println("Product ID: " + getProd_id());
        System.out.println("Product Price: " + getPrice());
        System.out.println("Tax: " + tax);
        System.out.println("cgst: " + cgst);
        System.out.println("gst: " + gst);
        System.out.println("Total price: " + getTaxDetails());

    }
}

// Clothing inherits Products and implements Taxable
class Clothing extends Products implements Taxable{

    double tax;
    double gst;
    double cgst;
    double total;

    Clothing(double tax, double gst, double cgst){
        // Initializes the tax values
        this.cgst = cgst;
        this.gst = gst;
        this.tax = tax;
    }

    // Adds the clothing product details
    public void addProduct(String prod_name, int prod_id, double price){
        setProd_name(prod_name);
        setProd_id(prod_id);
        setPrice(price);
    }

    // Calculates the total price by adding all tax amounts
    public void calculateTax(){
        total = getPrice() + tax + gst + cgst;
    }

    // Returns the total price after adding taxes
    public double getTaxDetails(){
        return total;
    }

    // Displays the clothing product details
    public void displayProductDetails() {

        System.out.println("Product Name: " + getProd_name());
        System.out.println("Product ID: " + getProd_id());
        System.out.println("Product Price: " + getPrice());
        System.out.println("Tax: " + tax);
        System.out.println("cgst: " + cgst);
        System.out.println("gst: " + gst);
        System.out.println("Total price: " + getTaxDetails());

    }

}

// Groceries inherits Products and implements Taxable
class Groceries extends Products implements Taxable{
    double tax;
    double gst;
    double cgst;
    double total;

    Groceries(double tax, double gst, double cgst){
        // Initializes the tax values
        this.cgst = cgst;
        this.gst = gst;
        this.tax = tax;
    }

    // Adds the grocery product details
    public void addProduct(String prod_name, int prod_id, double price){
        setProd_name(prod_name);
        setProd_id(prod_id);
        setPrice(price);
    }

    // Calculates the total price by adding all tax amounts
    public void calculateTax(){
        total = getPrice() + tax + gst + cgst;
    }

    // Returns the total price after adding taxes
    public double getTaxDetails(){
        return total;
    }

    // Displays the grocery product details
    public void displayProductDetails() {

        System.out.println("Product Name: " + getProd_name());
        System.out.println("Product ID: " + getProd_id());
        System.out.println("Product Price: " + getPrice());
        System.out.println("Tax: " + tax);
        System.out.println("cgst: " + cgst);
        System.out.println("gst: " + gst);
        System.out.println("Total price: " + getTaxDetails());

    }
}

// Main class for managing different types of products
public class ProductManagementSystem {
    public static void main(String[] args){

        // Creates an electronics product
        Electronics electronics1 = new Electronics(50,20,10);

        // Adds product details
        electronics1.addProduct("Speaker",53531,500);

        // Calculates tax
        electronics1.calculateTax();

        // Displays product details
        electronics1.displayProductDetails();

        System.out.println();

        // Creates another electronics product
        Electronics electronics2 = new Electronics(60,33,12);

        // Adds product details
        electronics2.addProduct("iphone",5634353,100000);

        // Calculates tax
        electronics2.calculateTax();

        // Displays product details
        electronics2.displayProductDetails();

        System.out.println();

        // Creates a clothing product
        Clothing clothing = new Clothing(90,23,41);

        // Adds product details
        clothing.addProduct("Saree",8530412,200);

        // Calculates tax
        clothing.calculateTax();

        // Displays product details
        clothing.displayProductDetails();

        System.out.println();

        // Creates a grocery product
        Groceries groceries = new Groceries(20,10,2);

        // Adds product details
        groceries.addProduct("coriander",49893289,20);

        // Calculates tax
        groceries.calculateTax();

        // Displays product details
        groceries.displayProductDetails();
    }
}