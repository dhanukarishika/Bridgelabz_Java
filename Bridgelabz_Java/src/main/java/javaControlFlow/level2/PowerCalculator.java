/*
 * Question 10: Calculate the power of a number.
 * The user enters a base and a non-negative exponent.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get base and exponent from the user
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter a non-negative integer exponent: ");
        int exponent = sc.nextInt();
        // Validate the exponent
        if (exponent < 0) {
            System.out.println("Exponent must be non-negative.");
        } else {
            // Calculate the power using a loop
            double result = 1;
            for (int i = 1; i <= exponent; i++) {
                result = result * base;
            }
            // Display the result
            System.out.println("Result: " + result);
        }
        sc.close();
    }
}
