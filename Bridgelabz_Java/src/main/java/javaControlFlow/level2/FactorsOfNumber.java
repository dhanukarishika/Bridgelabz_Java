/*
 * Question 11: Find and display all factors of a number.
 * A factor divides the number exactly without a remainder.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Validate the input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Find and display all factors
            System.out.println("Factors of " + number + ":");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
