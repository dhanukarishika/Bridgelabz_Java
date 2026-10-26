/*
  This program demonstrates abstraction, inheritance, encapsulation and interfaces in a Vehicle Rental System.
  It manages cars, bikes and trucks with rental cost and insurance calculation.
 */

package EncPolyAbs;

import java.util.ArrayList;
import java.util.List;

// Abstract class containing common vehicle properties and rental calculation
abstract class Vehicle{
    int vehicle_number;
    String type;
    int rental_rate;

    Vehicle(int vehicle_number, String type, int rental_rate){
        // Initializes the common vehicle details
        this.vehicle_number = vehicle_number;
        this.type = type;
        this.rental_rate = rental_rate;
    }

    // Abstract method that must be implemented by child classes
    abstract void calculateRentalCost();
}

// Interface defining insurance-related operations
interface Insurable{
    public void CalculateInsurance();
    public int getInsuranceDetails();
}

// Car inherits Vehicle and implements Insurable
class Car extends Vehicle implements Insurable{

    int days;
    int total_price;
    private int insurance_number;
    int insurance_rate;
    int idv;
    int total_insurance;
    List<Vehicle> vehicle;

    Car(int vehicle_number, String type,int rental_rate, int days, int insurance_number, int insurance_rate, int idv){
        // Calls the parent class constructor
        super(vehicle_number,type,rental_rate);

        this.days = days;
        this.insurance_number = insurance_number;
        this.insurance_rate = insurance_rate;
        this.idv = idv;

        // Creates a list to store vehicles
        this.vehicle = new ArrayList<>();
    }

    // Calculates the total rental cost based on days and rental rate
    void calculateRentalCost(){
        total_price = days * rental_rate;
    }

    // Calculates the total insurance amount
    public void CalculateInsurance(){
        total_insurance = idv * insurance_rate;
    }

    // Returns the calculated insurance amount
    public int getInsuranceDetails(){
        return total_insurance;
    }

    // Adds a car to the vehicle list
    public void addVehicle(Car car){
        vehicle.add(car);
    }

    // Displays the car details
    public void displayDetails(){
        System.out.println("Details of Car's");

        // Iterates through all vehicles stored in the list
        for(Vehicle vehicle : vehicle){
            System.out.println("Vehicle Number: " + vehicle.vehicle_number);
            System.out.println("Vehicle Type: " + vehicle.type);
            System.out.println("Number of Days: " + days);
            System.out.println("Insurance Number: " + insurance_number);
            System.out.println("Insurance Rate: " + insurance_rate);
            System.out.println("IDV: " + idv);
            System.out.println("Rental Rate: " + rental_rate);
            System.out.println("Total Insurance: " + getInsuranceDetails());
            System.out.println("Total Price: " + total_price);
        }
    }

}

// Bike inherits Vehicle and implements Insurable
class Bike extends Vehicle implements Insurable {

    int days;
    int total_price;
    private int insurance_number;
    int insurance_rate;
    int idv;
    int total_insurance;
    List<Vehicle> vehicle;

    Bike(int vehicle_number, String type, int rental_rate, int days, int insurance_number, int insurance_rate, int idv) {
        // Calls the parent class constructor
        super(vehicle_number, type, rental_rate);

        this.days = days;
        this.insurance_number = insurance_number;
        this.insurance_rate = insurance_rate;
        this.idv = idv;

        // Creates a list to store vehicles
        this.vehicle = new ArrayList<>();
    }

    // Calculates the total rental cost based on days and rental rate
    void calculateRentalCost() {
        total_price = days * rental_rate;
    }

    // Calculates the total insurance amount
    public void CalculateInsurance() {
        total_insurance = idv * insurance_rate;
    }

    // Returns the calculated insurance amount
    public int getInsuranceDetails() {
        return total_insurance;
    }

    // Adds a bike to the vehicle list
    public void addVehicle(Bike bike) {
        vehicle.add(bike);
    }

    // Displays the bike details
    public void displayDetails() {
        System.out.println("Details of Bike's");

        // Iterates through all vehicles stored in the list
        for (Vehicle vehicle : vehicle) {
            System.out.println("Vehicle Number: " + vehicle.vehicle_number);
            System.out.println("Vehicle Type: " + vehicle.type);
            System.out.println("Number of Days: " + days);
            System.out.println("Insurance Number: " + insurance_number);
            System.out.println("Insurance Rate: " + insurance_rate);
            System.out.println("IDV: " + idv);
            System.out.println("Rental Rate: " + rental_rate);
            System.out.println("Total Insurance: " + getInsuranceDetails());
            System.out.println("Total Price: " + total_price);
        }
    }
}

// Truck inherits Vehicle and implements Insurable
class Truck extends Vehicle implements Insurable {

    int days;
    int total_price;
    private int insurance_number;
    int insurance_rate;
    int idv;
    int total_insurance;
    List<Vehicle> vehicle;

    Truck(int vehicle_number, String type, int rental_rate, int days, int insurance_number, int insurance_rate, int idv) {
        // Calls the parent class constructor
        super(vehicle_number, type, rental_rate);

        this.days = days;
        this.insurance_number = insurance_number;
        this.insurance_rate = insurance_rate;
        this.idv = idv;

        // Creates a list to store vehicles
        this.vehicle = new ArrayList<>();
    }

    // Calculates the total rental cost based on days and rental rate
    void calculateRentalCost() {
        total_price = days * rental_rate;
    }

    // Calculates the total insurance amount
    public void CalculateInsurance() {
        total_insurance = idv * insurance_rate;
    }

    // Returns the calculated insurance amount
    public int getInsuranceDetails() {
        return total_insurance;
    }

    // Adds a truck to the vehicle list
    public void addVehicle(Truck truck) {
        vehicle.add(truck);
    }

    // Displays the truck details
    public void displayDetails() {
        System.out.println("Details of Truck's");

        // Iterates through all vehicles stored in the list
        for (Vehicle vehicle : vehicle) {
            System.out.println("Vehicle Number: " + vehicle.vehicle_number);
            System.out.println("Vehicle Type: " + vehicle.type);
            System.out.println("Number of Days: " + days);
            System.out.println("Insurance Number: " + insurance_number);
            System.out.println("Insurance Rate: " + insurance_rate);
            System.out.println("IDV: " + idv);
            System.out.println("Rental Rate: " + rental_rate);
            System.out.println("Total Insurance: " + getInsuranceDetails());
            System.out.println("Total Price: " + total_price);
        }
    }
}

// Main class for managing vehicle rental operations
public class VehicleRentalSystem {
    public static void main(String[] args){

        // Creates a car object with rental and insurance details
        Car car = new Car(312853,"Mercedes",5000,2,584321,900,500);

        // Calculates the rental cost
        car.calculateRentalCost();

        // Calculates the insurance amount
        car.CalculateInsurance();

        // Adds the car to the vehicle list
        car.addVehicle(car);

        // Displays the car details
        car.displayDetails();

        System.out.println();

        // Creates a bike object with rental and insurance details
        Bike bike = new Bike(34802,"Hero",1000,5,5397032,200,200);

        // Calculates the rental cost
        bike.calculateRentalCost();

        // Calculates the insurance amount
        bike.CalculateInsurance();

        // Adds the bike to the vehicle list
        bike.addVehicle(bike);

        // Displays the bike details
        bike.displayDetails();

        System.out.println();

        // Creates a truck object with rental and insurance details
        Truck truck = new Truck(389472,"robo",9000,10,88493293,5000,2000);

        // Calculates the rental cost
        truck.calculateRentalCost();

        // Calculates the insurance amount
        truck.CalculateInsurance();

        // Adds the truck to the vehicle list
        truck.addVehicle(truck);

        // Displays the truck details
        truck.displayDetails();
    }
}