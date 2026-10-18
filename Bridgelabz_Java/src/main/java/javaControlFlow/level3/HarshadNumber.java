/*
 * Question 3: Write a program to check whether a number
 * is a Harshad number or not.
 */
package javaControlFlow.level3;
import java.util.Scanner;
// Class to check whether a number is a Harshad number
public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get an integer from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Initialize variables for digit sum calculation
        int tempNumber = number;
        int sum = 0;
        // Validate the input number
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of the digits
            while (tempNumber != 0) {
                int digit = tempNumber % 10;
                sum += digit;
                // Remove the last digit
                tempNumber = tempNumber / 10;
            }
            // Check whether the number is divisible by its digit sum
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad number.");
            } else {
                System.out.println(number + " is not a Harshad number.");
            }
        }
        // Close the Scanner
        sc.close();
    }
}