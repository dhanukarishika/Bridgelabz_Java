/*
 * Program 8: Calculate the quotient and remainder
 * of two integers using a method.
 */
package Methods.level1;
import java.util.Scanner;
public class QuotientRemainder {
    // Find and return the quotient and remainder.
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get two integers from the user.
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        // Validate the divisor.
        if (divisor == 0) {
            System.out.println("Invalid input. Divisor cannot be zero.");
            sc.close();
            return;
        }
        // Calculate the quotient and remainder.
        int[] results = findRemainderAndQuotient(number, divisor);
        // Display the results.
        System.out.println("Quotient: " + results[0]);
        System.out.println("Remainder: " + results[1]);
        sc.close();
    }
}
