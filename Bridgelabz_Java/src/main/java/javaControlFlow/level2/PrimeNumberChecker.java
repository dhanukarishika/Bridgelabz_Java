/*
 * Question 4: Check whether a number is prime.
 * A prime number is greater than 1 and divisible only by 1 and itself.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create Scanner and read the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        // Assume the number is prime
        boolean isPrime = number > 1;
        // Check whether the number has any other factors
        for (int i = 2; i < number && isPrime; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        // Display the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
        // Close Scanner
        sc.close();
    }
}