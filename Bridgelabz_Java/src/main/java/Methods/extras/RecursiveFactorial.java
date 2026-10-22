/*
 * Q6. Factorial Using Recursion
 * Write a Java program to calculate the factorial
 * of a number using recursion with separate methods
 * for input, calculation, and output.
 */
package Methods.extras;
import java.util.Scanner;
public class RecursiveFactorial {
    // Method to take input from the user
    public static int takeInput(Scanner sc) {
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }
    // Recursive method to calculate factorial
    public static long calculateFactorial(int number) {
        // Base case
        if (number == 0 || number == 1) {
            return 1;
        }
        // Recursive call
        return number * calculateFactorial(number - 1);
    }
    // Method to display the result
    public static void displayResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input
        int number = takeInput(sc);
        // Validate input
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (number > 20) {
            System.out.println("Please enter a number from 0 to 20.");
        } else {
            // Calculate factorial
            long factorial = calculateFactorial(number);
            // Display result
            displayResult(number, factorial);
        }
        sc.close();
    }
}
