/*
 * Program 2: Calculate the maximum number of handshakes
 * among a given number of students.
 */
package Methods.level1;
import java.util.Scanner;
public class MaximumHandshakes {
    // Calculate the maximum possible number of handshakes.
    public static int calculateHandshakes(int numberOfStudents) {
        int handshakes = numberOfStudents * (numberOfStudents - 1) / 2;
        return handshakes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number of students.
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        // Validate the input.
        if (numberOfStudents < 0) {
            System.out.println("Invalid input. Number of students cannot be negative.");
            sc.close();
            return;
        }
        // Calculate the maximum number of handshakes.
        int handshakes = calculateHandshakes(numberOfStudents);
        // Display the result.
        System.out.println("The maximum number of handshakes is: " + handshakes);
        sc.close();
    }
}
