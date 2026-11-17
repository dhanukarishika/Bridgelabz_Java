/*
 * This program demonstrates handling runtime exceptions during user input and calculations.
 * It handles division-by-zero errors and invalid input using separate catch blocks.
 */
package ExceptionalHandling.Module1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class RuntimeException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // Reads two integer values from the user.
            System.out.println("Enter the number 1: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the number 2: ");
            int num2 = sc.nextInt();
            // Performs addition and then attempts to divide the result by zero.
            System.out.println((num1 + num2) / 0);
        } catch (ArithmeticException e) {
            // Handles arithmetic errors, such as division by zero.
            System.out.println("Exception: " + e.getMessage());
        } catch (InputMismatchException e) {
            // Handles cases where the user enters a non-integer value.
            System.out.println("Exception: input mis match " + e.getMessage());
        }
    }
}