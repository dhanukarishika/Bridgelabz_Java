/*
 * Question 7: Calculate BMI and determine the weight status.
 * BMI = Weight in kilograms / (Height in meters * Height in meters)
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get weight and height from the user
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in centimeters: ");
        double heightInCm = sc.nextDouble();
        // Validate the input
        if (weight <= 0 || heightInCm <= 0) {
            System.out.println("Weight and height must be positive.");
        } else {
            // Convert height from centimeters to meters
            double heightInMeters = heightInCm / 100.0;
            // Calculate BMI
            double bmi = weight / (heightInMeters * heightInMeters);
            System.out.printf("Your BMI is: %.2f%n", bmi);
            // Determine weight status
            if (bmi < 18.5) {
                System.out.println("Weight Status: Underweight");
            } else if (bmi < 25) {
                System.out.println("Weight Status: Normal weight");
            } else if (bmi < 40) {
                System.out.println("Weight Status: Overweight");
            } else {
                System.out.println("Weight Status: Obese");
            }
        }
        sc.close();
    }
}
