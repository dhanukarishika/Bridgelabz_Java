/*
 * Program 6: Create a UnitConvertor utility class with
 * static methods to convert Fahrenheit to Celsius,
 * Celsius to Fahrenheit, pounds to kilograms,
 * kilograms to pounds, gallons to liters, and liters to gallons.
 */
package Methods.level2;
import java.util.Scanner;
public class UnitConvertorTemperatureWeightVolume {

    // Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Display conversion options
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Choose a conversion (1-6): ");
        int choice = sc.nextInt();
        // Take the value to convert
        System.out.print("Enter the value: ");
        double value = sc.nextDouble();
        // Perform the selected conversion
        switch (choice) {
            case 1:
                System.out.println("Celsius: " + convertFahrenheitToCelsius(value));
                break;
            case 2:
                System.out.println("Fahrenheit: " + convertCelsiusToFahrenheit(value));
                break;
            case 3:
                System.out.println("Kilograms: " + convertPoundsToKilograms(value));
                break;
            case 4:
                System.out.println("Pounds: " + convertKilogramsToPounds(value));
                break;
            case 5:
                System.out.println("Liters: " + convertGallonsToLiters(value));
                break;
            case 6:
                System.out.println("Gallons: " + convertLitersToGallons(value));
                break;
            default:
                System.out.println("Invalid choice.");
        }
        // Close the Scanner object
        sc.close();
    }
}
