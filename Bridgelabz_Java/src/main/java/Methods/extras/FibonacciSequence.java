/*
 * Q4. Fibonacci Sequence Generator
 * Write a Java program to generate the Fibonacci
 * sequence up to a specified number of terms
 * using a separate method.
 */
package Methods.extras;
import java.util.Scanner;
public class FibonacciSequence {
    // Method to generate and print Fibonacci sequence
    public static void generateFibonacci(int terms) {
        long first = 0;
        long second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        // Validate input
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
        } else if (terms > 93) {
            System.out.println("Please enter 93 terms or fewer to avoid overflow.");
        } else {
            // Call method to generate Fibonacci sequence
            generateFibonacci(terms);
        }
        sc.close();
    }
}
