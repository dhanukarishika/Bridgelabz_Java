/*
 * Program 5: Create a UnitConvertor utility class with
 * static methods to convert yards to feet, feet to yards,
 * meters to inches, inches to meters, and inches to centimeters.
 */
package Methods.level2;
import java.util.Scanner;
public class UnitConvertorLength {

    // Conversion methods
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Display conversion options
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Choose a conversion (1-5): ");
        int choice = sc.nextInt();
        // Take the value to convert
        System.out.print("Enter the value: ");
        double value = sc.nextDouble();
        // Perform the selected conversion
        switch (choice) {
            case 1:
                System.out.println("Feet: " + convertYardsToFeet(value));
                break;
            case 2:
                System.out.println("Yards: " + convertFeetToYards(value));
                break;
            case 3:
                System.out.println("Inches: " + convertMetersToInches(value));
                break;
            case 4:
                System.out.println("Meters: " + convertInchesToMeters(value));
                break;
            case 5:
                System.out.println("Centimeters: " + convertInchesToCm(value));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        // Close the Scanner object
        sc.close();
    }
}
