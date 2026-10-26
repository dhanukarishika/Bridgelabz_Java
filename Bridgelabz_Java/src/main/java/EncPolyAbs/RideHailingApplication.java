/*
  This program demonstrates abstraction, inheritance, encapsulation and interfaces in a Ride Hailing Application.
  It manages cars, bikes and autos with fare calculation and GPS location operations.
 */

package EncPolyAbs;

import java.util.ArrayList;
import java.util.List;

// Abstract class containing common properties and methods for all vehicles
abstract class Vehicle1 {

    int vehicleId;
    String driverName;
    double ratePerKm;

    // Private variables provide encapsulation
    private String driverPhone;
    private String vehicleNumber;

    Vehicle1(int vehicleId, String driverName, double ratePerKm,
             String driverPhone, String vehicleNumber) {

        // Initializes the common vehicle details
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.driverPhone = driverPhone;
        this.vehicleNumber = vehicleNumber;
    }

    // Getter method to access driver phone number
    public String getDriverPhone() {
        return driverPhone;
    }

    // Setter method to update driver phone number
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    // Getter method to access vehicle number
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Setter method to update vehicle number
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    // Abstract method for calculating fare
    abstract void calculateFare(double distance);

    // Displays the common vehicle details
    public void getVehicleDetails() {

        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate Per KM: " + ratePerKm);
        System.out.println("Driver Phone: " + driverPhone);
        System.out.println("Vehicle Number: " + vehicleNumber);
    }
}

// Interface defining GPS-related operations
interface GPS {

    void getCurrentLocation();

    void updateLocation();
}

// Car inherits Vehicle1 and implements GPS
class Car1 extends Vehicle1 implements GPS {

    double fare;
    List<Vehicle1> vehicles;

    Car1(int vehicleId, String driverName, double ratePerKm,
         String driverPhone, String vehicleNumber) {

        // Calls the parent class constructor
        super(vehicleId, driverName, ratePerKm, driverPhone, vehicleNumber);

        // Creates a list to store vehicles
        vehicles = new ArrayList<>();
    }

    // Adds a car to the vehicle list
    public void addCar(Car1 car) {
        vehicles.add(car);
    }

    // Calculates car fare with an additional fixed charge of 50
    @Override
    void calculateFare(double distance) {
        fare = distance * ratePerKm + 50;
    }

    // Displays the current location of the car
    @Override
    public void getCurrentLocation() {
        System.out.println("Car Location: Vijayawada");
    }

    // Updates the car location
    @Override
    public void updateLocation() {
        System.out.println("Car location updated");
    }

    // Displays car details and calculated fare
    public void displayVehicles(double distance) {

        // Iterates through all vehicles stored in the list
        for (Vehicle1 vehicle : vehicles) {

            vehicle.getVehicleDetails();
            vehicle.calculateFare(distance);

            System.out.println("Distance: " + distance);
            System.out.println("Car Fare: " + fare);
            System.out.println();
        }
    }
}

// Bike inherits Vehicle1 and implements GPS
class Bike1 extends Vehicle1 implements GPS {

    double fare;
    List<Vehicle1> vehicles;

    Bike1(int vehicleId, String driverName, double ratePerKm,
          String driverPhone, String vehicleNumber) {

        // Calls the parent class constructor
        super(vehicleId, driverName, ratePerKm, driverPhone, vehicleNumber);

        // Creates a list to store vehicles
        vehicles = new ArrayList<>();
    }

    // Adds a bike to the vehicle list
    public void addBike(Bike1 bike) {
        vehicles.add(bike);
    }

    // Calculates bike fare based on distance and rate per kilometer
    @Override
    void calculateFare(double distance) {
        fare = distance * ratePerKm;
    }

    // Displays the current location of the bike
    @Override
    public void getCurrentLocation() {
        System.out.println("Bike Location: Guntur");
    }

    // Updates the bike location
    @Override
    public void updateLocation() {
        System.out.println("Bike location updated");
    }

    // Displays bike details and calculated fare
    public void displayVehicles(double distance) {

        // Iterates through all vehicles stored in the list
        for (Vehicle1 vehicle : vehicles) {

            vehicle.getVehicleDetails();
            vehicle.calculateFare(distance);

            System.out.println("Distance: " + distance);
            System.out.println("Bike Fare: " + fare);
            System.out.println();
        }
    }
}

// Auto inherits Vehicle1 and implements GPS
class Auto extends Vehicle1 implements GPS {

    double fare;
    List<Vehicle1> vehicles;

    Auto(int vehicleId, String driverName, double ratePerKm,
         String driverPhone, String vehicleNumber) {

        // Calls the parent class constructor
        super(vehicleId, driverName, ratePerKm, driverPhone, vehicleNumber);

        // Creates a list to store vehicles
        vehicles = new ArrayList<>();
    }

    // Adds an auto to the vehicle list
    public void addAuto(Auto auto) {
        vehicles.add(auto);
    }

    // Calculates auto fare with an additional fixed charge of 20
    @Override
    void calculateFare(double distance) {
        fare = distance * ratePerKm + 20;
    }

    // Displays the current location of the auto
    @Override
    public void getCurrentLocation() {
        System.out.println("Auto Location: Amaravati");
    }

    // Updates the auto location
    @Override
    public void updateLocation() {
        System.out.println("Auto location updated");
    }

    // Displays auto details and calculated fare
    public void displayVehicles(double distance) {

        // Iterates through all vehicles stored in the list
        for (Vehicle1 vehicle : vehicles) {

            vehicle.getVehicleDetails();
            vehicle.calculateFare(distance);

            System.out.println("Distance: " + distance);
            System.out.println("Auto Fare: " + fare);
            System.out.println();
        }
    }
}

// Main class for managing the ride hailing application
public class RideHailingApplication {

    public static void main(String[] args) {

        // Creates a car object with driver and vehicle details
        Car1 car =
                new Car1(
                        101,
                        "Akhil",
                        15,
                        "9876543210",
                        "AP01AB1234"
                );

        // Adds the car to the vehicle list
        car.addCar(car);

        // Displays the current car location
        car.getCurrentLocation();

        // Updates the car location
        car.updateLocation();

        System.out.println("----- CAR -----");

        // Displays car details and fare for 10 km
        car.displayVehicles(10);

        // Creates a bike object with driver and vehicle details
        Bike1 bike =
                new Bike1(
                        102,
                        "Rahul",
                        10,
                        "9876501234",
                        "AP02CD5678"
                );

        // Adds the bike to the vehicle list
        bike.addBike(bike);

        // Displays the current bike location
        bike.getCurrentLocation();

        // Updates the bike location
        bike.updateLocation();

        System.out.println("----- BIKE -----");

        // Displays bike details and fare for 10 km
        bike.displayVehicles(10);

        // Creates an auto object with driver and vehicle details
        Auto auto =
                new Auto(
                        103,
                        "Suresh",
                        12,
                        "9876512345",
                        "AP03EF9012"
                );

        // Adds the auto to the vehicle list
        auto.addAuto(auto);

        // Displays the current auto location
        auto.getCurrentLocation();

        // Updates the auto location
        auto.updateLocation();

        System.out.println("----- AUTO -----");

        // Displays auto details and fare for 10 km
        auto.displayVehicles(10);
    }
}