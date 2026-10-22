/*
 * Q3. Prime Number Checker
 * Write a Java program to check whether a given
 * number is prime using a separate method.
 */
package Methods.extras;
import java.util.Scanner;
public class PrimeNumberChecker {
    // Method to check whether a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / i; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Call method to check prime number
        boolean result = isPrime(number);
        // Display result
        if (result) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        sc.close();
    }
}
