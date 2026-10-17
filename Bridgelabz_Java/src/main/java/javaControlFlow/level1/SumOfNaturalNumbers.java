/*
 * Question 4: Find the sum of n natural numbers.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Read the number from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Check whether the number is natural
        if (number > 0) {
            // Calculate the sum using the formula
            int sum = number * (number + 1) / 2;
            // Display the result
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        // Close the Scanner
        sc.close();
    }
}
