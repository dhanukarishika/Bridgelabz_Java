/*
 * Question 2: Write a program to check whether the first
 * number is the smallest among three numbers.
 *
 * Input: Three integers named number1, number2, and number3
 * Output: Whether the first number is the smallest
 * Logic: The first number must be less than or equal to
 * both the second and third numbers.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class IsFirstSmallest {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Get three integer inputs from the user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        // Check whether the first number is the smallest
        boolean isFirstSmallest = number1 <= number2 && number1 <= number3;
        // Display the result
        System.out.println("Is the first number the smallest? " + isFirstSmallest);
        // Close the Scanner object
        sc.close();
    }
}