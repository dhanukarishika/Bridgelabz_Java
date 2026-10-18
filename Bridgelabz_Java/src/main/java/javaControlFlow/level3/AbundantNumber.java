/*
 * Question 4: Write a program to check whether a number
 * is an Abundant Number or not.
 */
package javaControlFlow.level3;
import java.util.Scanner;
// Class to check whether a number is abundant
public class AbundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get a positive integer from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Initialize the sum of proper divisors
        int sum = 0;
        // Validate the input number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Find and add all proper divisors of the number
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            // Check whether the sum exceeds the number
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is not an Abundant Number.");
            }
        }
        // Close the Scanner
        sc.close();
    }
}