/*
 * Q3. Vehicle Registration
 * Create a Vehicle class with owner and vehicle details
 * and a shared registration fee updated by a class method.
 */
package Constructor.level2;
public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 1000.0;
    public Vehicle(String ownerName, String vehicleType) {
        setOwnerName(ownerName);
        setVehicleType(vehicleType);
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be empty.");
        }
        this.ownerName = ownerName.trim();
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        if (vehicleType == null || vehicleType.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle type cannot be empty.");
        }
        this.vehicleType = vehicleType.trim();
    }
    public static double getRegistrationFee() {
        return registrationFee;
    }
    public static void updateRegistrationFee(double newFee) {
        if (!Double.isFinite(newFee) || newFee < 0) {
            throw new IllegalArgumentException("Registration fee must be a valid non-negative number.");
        }
        registrationFee = newFee;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.printf("Registration Fee: Rs. %.2f%n", registrationFee);
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Rishika Dhanuka", "Car");
        Vehicle vehicle2 = new Vehicle("Vaidehi Mishra", "Scooter");
        System.out.println("Before Updating Registration Fee");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(1500);
        System.out.println("\nAfter Updating Registration Fee");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}