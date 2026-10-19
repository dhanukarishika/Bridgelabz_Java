/*
 * Question 5: Calculate the BMI and display the height,
 * weight, BMI, and weight status of each person.
 */
package Arrays.level2;
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the number of persons
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Number of persons must be positive.");
            sc.close();
            return;
        }
        // Create arrays to store each person's details
        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmiValues = new double[number];
        String[] weightStatuses = new String[number];
        // Read and validate weight and height for each person
        for (int i = 0; i < weights.length; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            System.out.print("Enter height in metres: ");
            double height = sc.nextDouble();
            // Retry the same person if input is invalid
            if (weight <= 0 || height <= 0) {
                System.out.println(
                        "Invalid input. Weight and height must be positive."
                );
                i--;
                continue;
            }
            weights[i] = weight;
            heights[i] = height;
        }
        // Calculate BMI and determine weight status
        for (int i = 0; i < weights.length; i++) {
            bmiValues[i] = weights[i] / (heights[i] * heights[i]);
            if (bmiValues[i] <= 18.4) {
                weightStatuses[i] = "Underweight";
            } else if (bmiValues[i] <= 24.9) {
                weightStatuses[i] = "Normal";
            } else if (bmiValues[i] <= 39.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obese";
            }
        }
        // Display the details of each person
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < weights.length; i++) {
            System.out.printf(
                    "Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    i + 1, heights[i], weights[i], bmiValues[i], weightStatuses[i]
            );
        }
        sc.close();
    }
}
