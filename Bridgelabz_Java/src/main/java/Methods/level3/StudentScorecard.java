
/*
 * Program 12: Generate random Physics, Chemistry, and Maths marks
 * for students, calculate total, average, and percentage,
 * and display a formatted scorecard.
 */
package Methods.level3;

import java.util.Scanner;

public class StudentScorecard {

    // Generate random two-digit marks (10 to 99).
    public static int generateMarks() {
        return (int) (Math.random() * 90) + 10;
    }

    // Round a value to two decimal places.
    public static double roundToTwoDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be positive.");
            sc.close();
            return;
        }

        // Columns: Physics, Chemistry, Mathematics.
        int[][] marks = new int[numberOfStudents][3];

        int[] total = new int[numberOfStudents];
        double[] average = new double[numberOfStudents];
        double[] percentage = new double[numberOfStudents];

        // Generate marks and calculate results.
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = generateMarks();
                total[i] += marks[i][j];
            }

            average[i] = roundToTwoDecimals(total[i] / 3.0);
            percentage[i] = roundToTwoDecimals(
                    total[i] / 300.0 * 100.0);
        }

        // Display the scorecard.
        System.out.println("\nStudent Scorecard");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s%n",
                "Student", "Physics", "Chemistry", "Maths",
                "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf(
                    "%-10d %-10d %-10d %-10d %-10d %-12.2f %-11.2f%%%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    total[i],
                    average[i],
                    percentage[i]);
        }

        System.out.println("--------------------------------------------------------------------------");

        sc.close();
    }
}
