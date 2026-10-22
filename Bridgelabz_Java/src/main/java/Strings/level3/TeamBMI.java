
/*
 * Program 1: Calculate the BMI and health status of
 * 10 team members using their weight and height.
 * Display the results in a tabular format.
 */
package Strings.level3;

import java.util.Scanner;

public class TeamBMI {

    // Method to calculate BMI and determine health status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to store height, weight, BMI and status
    public static String[][] calculateTeamBMI(double[][] measurements) {
        String[][] results = new String[measurements.length][4];

        for (int i = 0; i < measurements.length; i++) {
            double weight = measurements[i][0];
            double height = measurements[i][1];

            String[] bmiResult = calculateBMI(weight, height);

            results[i][0] = String.valueOf(height);
            results[i][1] = String.valueOf(weight);
            results[i][2] = bmiResult[0];
            results[i][3] = bmiResult[1];
        }

        return results;
    }

    // Method to display BMI results in tabular format
    public static void displayBMIResults(String[][] results) {
        System.out.printf("%-10s %-15s %-15s %-10s %-15s%n",
                "Person", "Height (cm)", "Weight (kg)", "BMI", "Status");

        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-10s %-15s%n",
                    i + 1,
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfPeople = 10;
        double[][] measurements = new double[numberOfPeople][2];

        // Take height and weight input for 10 people
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            measurements[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            measurements[i][1] = sc.nextDouble();

            if (measurements[i][0] <= 0 || measurements[i][1] <= 0) {
                System.out.println("Weight and height must be positive.");
                i--;
            }
        }

        // Calculate BMI and health status
        String[][] results = calculateTeamBMI(measurements);

        // Display results
        System.out.println("\nBMI Report:");
        displayBMIResults(results);

        sc.close();
    }
}
