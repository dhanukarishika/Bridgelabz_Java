/*
 * Question 6: Calculate BMI and weight status using a
 * two-dimensional array to store height, weight, and BMI.
 */
package Arrays.level2;
import java.util.Scanner;
public class BMICalculator2D {
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

        // Store height, weight, and BMI in columns 0, 1, and 2
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Read and validate each person's weight and height
        for (int i = 0; i < personData.length; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height in metres: ");
            double height = sc.nextDouble();
            System.out.print("Enter weight in kg: ");
            double weight = sc.nextDouble();
            // Retry the same person if either value is invalid
            if (height <= 0 || weight <= 0) {
                System.out.println(
                        "Invalid input. Height and weight must be positive."
                );
                i--;
                continue;
            }
            personData[i][0] = height;
            personData[i][1] = weight;
        }
        // Calculate BMI and determine weight status
        for (int i = 0; i < personData.length; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];
            personData[i][2] = weight / (height * height);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        // Display each person's height, weight, BMI, and status
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < personData.length; i++) {
            System.out.printf(
                    "Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s%n",
                    i + 1,
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]
            );
        }
        sc.close();
    }
}
