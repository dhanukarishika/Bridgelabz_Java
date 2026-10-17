/*
 * Question 1: Write a program to check whether a number
 * entered by the user is divisible by 5.
 *
 * Input: An integer named number
 * Output: Whether the number is divisible by 5
 * Logic: A number is divisible by 5 if its remainder
 * after division by 5 is zero.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class DivisibleByFive {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Get an integer input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Check whether the number is divisible by 5
        boolean isDivisibleByFive = number % 5 == 0;
        // Display the result
        System.out.println("Is the number " + number +" divisible by 5? " + isDivisibleByFive);
        // Close the Scanner object
        sc.close();
    }
}