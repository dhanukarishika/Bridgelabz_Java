
/*
 * Program 5: Check whether a number is prime, neon,
 * spy, automorphic, or buzz using static methods.
 */
package Methods.level3;

import java.util.Scanner;

public class NumberCheckerSpecialNumbers {

    // Check whether a number is prime.
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

    // Find the sum of the digits of a number.
    public static int calculateDigitSum(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    // Check whether a number is neon.
    // A neon number's square has a digit sum equal to the number.
    public static boolean isNeon(int number) {
        if (number < 0) {
            return false;
        }

        int square = number * number;
        return calculateDigitSum(square) == number;
    }

    // Check whether a number is a spy number.
    // Its digit sum must equal its digit product.
    public static boolean isSpy(int number) {
        if (number < 0) {
            return false;
        }

        int temp = number;
        int sum = 0;
        int product = 1;

        do {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        } while (temp > 0);

        return sum == product;
    }

    // Check whether a number is automorphic.
    // Its square must end with the original number.
    public static boolean isAutomorphic(int number) {
        if (number < 0) {
            return false;
        }

        long square = (long) number * number;
        int temp = number;

        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    // Check whether a number is a buzz number.
    // It must be divisible by 7 or end in 7.
    public static boolean isBuzz(int number) {
        return number >= 0
                && (number % 7 == 0 || number % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(
                    "Invalid input. Enter a non-negative integer.");
            sc.close();
            return;
        }

        // Display the results of all five checks.
        System.out.println("Prime number: " + isPrime(number));
        System.out.println("Neon number: " + isNeon(number));
        System.out.println("Spy number: " + isSpy(number));
        System.out.println("Automorphic number: " + isAutomorphic(number));
        System.out.println("Buzz number: " + isBuzz(number));

        sc.close();
    }
}
