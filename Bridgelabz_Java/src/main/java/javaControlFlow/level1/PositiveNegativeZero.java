/*
 * Question 6: Check whether a number is positive, negative, or zero.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        // Read an integer from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Check the sign of the number
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        // Close the Scanner
        sc.close();
    }
}
