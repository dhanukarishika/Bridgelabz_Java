/*
 * This program demonstrates inheritance between a Device and a Thermostat.
 * The Thermostat class inherits the common device details and adds a temperature setting.
 */

package Inheritance;

class Device{
    int DeviceId;
    String status;

    // Constructor to initialize the device details
    Device(int deviceId,String status){
        this.DeviceId = deviceId;
        this.status = status;
    }

    // Displays the common details of the device
    public void displayDestails(){
        System.out.println("Device ID: "+DeviceId);
        System.out.println("Device Status: "+status);
    }
}

class Thermostat extends Device{
    int temperatureSetting;

    // Calls the parent constructor and initializes the temperature setting
    Thermostat(int deviceId, String status, int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    // Displays device details along with thermostat-specific details
    public void displayDetails(){
        super.displayDestails();
        System.out.println("Temperature Setting (Max Temperature): "+temperatureSetting);
    }
}


public class SmartHomeDevices {
    public static void main(String[] args){

        // Creating objects for Device and Thermostat classes
        Device device = new Device(1232,"Working");
        Thermostat thermostat = new Thermostat(43153,"Working",120);

        // Displaying thermostat and device details
        thermostat.displayDetails();
        System.out.println();
        device.displayDestails();
    }
}