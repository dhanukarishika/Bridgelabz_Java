/*
 * Question 1: Write a program to check whether a number
 * is an Armstrong number or not.
 */
package javaControlFlow.level3;
import java.util.Scanner;
// Class to check whether a number is an Armstrong number
public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        // Get the number from the user
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        // Store the original number and initialize the sum
        int originalNumber = number;
        int tempNumber = number;
        int sum = 0;
        // Check whether the number is non-negative
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Extract each digit and add its cube to the sum
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                int cube = digit * digit * digit;
                sum += cube;
                // Remove the last digit from the number
                tempNumber = tempNumber / 10;
            }
            // Compare the sum of cubes with the original number
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is not an Armstrong number.");
            }
        }
        // Close the Scanner object
        sc.close();
    }
}