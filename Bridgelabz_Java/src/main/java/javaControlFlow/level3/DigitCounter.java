/*
 * Question 2: Write a program to count the number of digits
 * in an integer.
 */
package javaControlFlow.level3;
import java.util.Scanner;
// Class to count the digits in an integer
public class DigitCounter {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get an integer from the user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        // Store the number and initialize the digit count
        int tempNumber = number;
        int count = 0;
        // Handle zero as a special case
        if (tempNumber == 0) {
            count = 1;
        } else {
            // Remove digits one by one and count them
            while (tempNumber != 0) {
                tempNumber = tempNumber / 10;
                count++;
            }
        }
        // Display the number of digits
        System.out.println("Number of digits: " + count);
        // Close the Scanner
        sc.close();
    }
}