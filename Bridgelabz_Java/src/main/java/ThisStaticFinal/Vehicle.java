/*
 * Q6. Vehicle Registration System
 * Demonstrate static, this, final, and instanceof
 * using vehicle registration details.
 */
package ThisStaticFinal;

public class Vehicle {
    private static double registrationFee = 1000.0;

    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    public Vehicle(String ownerName, String vehicleType,
                   String registrationNumber) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name cannot be empty.");
        }

        if (vehicleType == null || vehicleType.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Vehicle type cannot be empty."
            );
        }

        if (registrationNumber == null
                || registrationNumber.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Registration number cannot be empty."
            );
        }

        this.ownerName = ownerName.trim();
        this.vehicleType = vehicleType.trim();
        this.registrationNumber = registrationNumber.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Owner name cannot be empty."
            );
        }
        this.ownerName = ownerName.trim();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        if (vehicleType == null || vehicleType.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Vehicle type cannot be empty."
            );
        }
        this.vehicleType = vehicleType.trim();
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static double getRegistrationFee() {
        return registrationFee;
    }

    public static void updateRegistrationFee(double newFee) {
        if (!Double.isFinite(newFee) || newFee < 0) {
            throw new IllegalArgumentException(
                    "Registration fee must be a valid non-negative number."
            );
        }
        registrationFee = newFee;
    }

    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.printf("Registration Fee: Rs. %.2f%n", registrationFee);
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Rishika Dhanuka", "Car", "TN01AB1234");
        Vehicle vehicle2 = new Vehicle("Vaidehi Mishra", "Scooter", "TN02CD5678");
        Vehicle.updateRegistrationFee(1500);
        Object[] vehicles = {vehicle1, vehicle2, "Not a vehicle"};
        for (Object object : vehicles) {
            if (object instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) object;
                vehicle.displayDetails();
            } else {
                System.out.println("The object is not a Vehicle.");
            }
            System.out.println();
        }
    }
}