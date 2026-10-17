/*
 * Question 14: Calculate the factorial of a positive integer
 * using a while loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else {
            // Calculate factorial
            long factorial = 1;
            int i = 1;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            // Display the result
            System.out.println("Factorial of " + number + " = " + factorial);
        }
        sc.close();
    }
}