/*
 * Question 15: Calculate the factorial of a non-negative integer
 * using a for loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            // Display the result
            System.out.println("Factorial of " + number + " = " + factorial);
        }
        sc.close();
    }
}