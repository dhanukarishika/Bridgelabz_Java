/*
 * Program 3: Calculate the number of rounds required
 * to complete a 5 km run in a triangular park.
 */
package Methods.level1;
import java.util.Scanner;
public class TriangularPark {
    // Calculate the number of rounds needed to complete the run.
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double runningDistance = 5000.0;
        double rounds = runningDistance / perimeter;
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the three sides of the triangular park.
        System.out.print("Enter the first side in meters: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the second side in meters: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the third side in meters: ");
        double side3 = sc.nextDouble();

        // Validate the side lengths.
        if (side1 <= 0 || side2 <= 0 || side3 <= 0
                || side1 + side2 <= side3
                || side1 + side3 <= side2
                || side2 + side3 <= side1) {
            System.out.println("Invalid input. Enter valid sides of a triangle.");
            sc.close();
            return;
        }
        // Calculate the required rounds.
        double rounds = calculateRounds(side1, side2, side3);
        // Display the result.
        System.out.printf("The number of rounds required to complete 5 km is %.2f.%n", rounds);
        sc.close();
    }
}
