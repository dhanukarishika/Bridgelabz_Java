/*
 * Program 4: Create a UnitConvertor utility class with
 * static methods to convert kilometers to miles,
 * miles to kilometers, meters to feet, and feet to meters.
 */
package Methods.level2;
import java.util.Scanner;
public class UnitConvertor {

    // Conversion methods
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input for the value to convert
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Choose a conversion (1-4): ");
        int choice = sc.nextInt();
        System.out.print("Enter the value: ");
        double value = sc.nextDouble();
        // Perform the selected conversion
        switch (choice) {
            case 1:
                System.out.println("Miles: " + convertKmToMiles(value));
                break;
            case 2:
                System.out.println("Kilometers: " + convertMilesToKm(value));
                break;
            case 3:
                System.out.println("Feet: " + convertMetersToFeet(value));
                break;
            case 4:
                System.out.println("Meters: " + convertFeetToMeters(value));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        // Close the Scanner object
        sc.close();
    }
}
