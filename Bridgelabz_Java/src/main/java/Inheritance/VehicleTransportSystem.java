/*
 * This program demonstrates hierarchical inheritance and method overriding in Java.
 * Car, Truck, and MotorCycle inherit common vehicle details and override displayInfo() with their own details.
 */

package Inheritance;

class Vehicle{
    int max_speed;
    String fuel_type;

    // Constructor to initialize common vehicle details
    Vehicle(int max_speed,String fuel_type){
        this.max_speed = max_speed;
        this.fuel_type = fuel_type;
    }

    // Displays the common information of the vehicle
    public void displayInfo(){
        System.out.println("Max Speed: "+max_speed);
        System.out.println("Fuel Type: "+fuel_type);
    }
}

class Car extends Vehicle{
    int seat_capacity;

    // Calls the parent constructor and initializes the seat capacity
    Car(int max_speed,String fuel_type,int seat_capacity){
        super(max_speed,fuel_type);
        this.seat_capacity = seat_capacity;
    }

    // Displays car-specific and common vehicle details
    public void displayInfo(){
        System.out.println("Car Details");
        super.displayInfo();
        System.out.println("Seat Capacity: "+seat_capacity);
    }
}

class Truck extends Vehicle{
    int load_capacity;

    // Calls the parent constructor and initializes the load capacity
    Truck(int max_speed,String fuel_type,int load_capacity){
        super(max_speed,fuel_type);
        this.load_capacity = load_capacity;
    }

    // Displays truck-specific and common vehicle details
    public void displayInfo(){
        System.out.println("Truck Details");
        super.displayInfo();
        System.out.println("Load Capacity: "+load_capacity);
    }
}

class MotorCycle extends Vehicle{
    String type;

    // Calls the parent constructor and initializes the motorcycle type
    MotorCycle(int max_speed,String fuel_type,String type){
        super(max_speed,fuel_type);
        this.type = type;
    }

    // Displays motorcycle-specific and common vehicle details
    public void displayInfo(){
        System.out.println("MotorCycle Details");
        super.displayInfo();
        System.out.println("Motor Cycle type: "+type);
    }
}


public class VehicleTransportSystem {
    public static void main(String[] args){

        // Creating different vehicle objects and storing them in a parent class array
        Vehicle[] vehicles = {
                new Car(200,"Diseal",6),
                new Truck(150,"Diseal",1000),
                new MotorCycle(50,"None","gear"),
        };

        // Calls the overridden displayInfo() method for each vehicle
        for(Vehicle vehicle : vehicles){
            vehicle.displayInfo();
            System.out.println();
        }

    }
}