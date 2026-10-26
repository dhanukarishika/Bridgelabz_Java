/*
 * This program demonstrates inheritance and interface implementation in Java.
 * Petrol and electric vehicles inherit common vehicle details and provide their own specific operations.
 */

package Inheritance;

class Vehiclee{
    String model;
    int max_speed;

    // Constructor to initialize the vehicle model and maximum speed
    Vehiclee(int max_speed, String model){
        this.model = model;
        this.max_speed = max_speed;
    }
}

interface Refuelable{

    // Defines the method that a refuelable vehicle must implement
    void refule();
}

class PetrolVehicle extends Vehiclee implements Refuelable{

    // Calls the parent constructor to initialize petrol vehicle details
    PetrolVehicle(String model, int max_speed){
        super(max_speed, model);
    }

    // Implements the refule() method for petrol vehicles
    public void refule(){
        System.out.println("This is petrol vehicle");
    }
}

class ElectricalVehicle extends Vehiclee{

    // Calls the parent constructor to initialize electric vehicle details
    ElectricalVehicle(String model, int max_speed){
        super(max_speed, model);
    }

    // Displays the charging operation of an electric vehicle
    public void Charge(){
        System.out.println("This is electric vehicle this is charge method");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args){

        // Creating objects for electric and petrol vehicles
        ElectricalVehicle ev = new ElectricalVehicle("TATA EV",250);
        PetrolVehicle pv = new PetrolVehicle("RollsRoyce",400);

        // Calling the specific operation of each vehicle
        ev.Charge();
        System.out.println();
        pv.refule();
    }
}