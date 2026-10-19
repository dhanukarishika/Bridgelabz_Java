
/*
 * Program 6: Find factors and calculate their greatest value,
 * sum, product, and product of cubes. Check perfect, abundant,
 * deficient, and strong numbers.
 */
package Methods.level3;

import java.util.Scanner;

public class NumberCheckerFactorAnalysis {

    // Find the factors of a number and store them in an array.
    public static int[] findFactors(int number) {
        int factorCount = 0;

        // Count the factors to determine the array size.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorCount++;
            }
        }

        int[] factors = new int[factorCount];
        int index = 0;

        // Store all factors in the array.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // Find the greatest factor.
    public static int findGreatestFactor(int[] factors) {
        int greatest = factors[0];

        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > greatest) {
                greatest = factors[i];
            }
        }

        return greatest;
    }

    // Calculate the sum of all factors.
    public static int calculateFactorSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Calculate the product of all factors.
    public static long calculateFactorProduct(int[] factors) {
        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Calculate the product of the cubes of all factors.
    public static double calculateProductOfCubes(int[] factors) {
        double product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }

        return product;
    }

    // Check whether the number is perfect.
    public static boolean isPerfectNumber(int number, int[] factors) {
        return calculateProperDivisorSum(factors) == number;
    }

    // Check whether the number is abundant.
    public static boolean isAbundantNumber(int number, int[] factors) {
        return calculateProperDivisorSum(factors) > number;
    }

    // Check whether the number is deficient.
    public static boolean isDeficientNumber(int number, int[] factors) {
        return calculateProperDivisorSum(factors) < number;
    }

    // Calculate the sum of proper divisors, excluding the number itself.
    public static int calculateProperDivisorSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            if (factors[i] != factors[factors.length - 1]) {
                sum += factors[i];
            }
        }

        return sum;
    }

    // Calculate the factorial of a digit.
    public static int calculateDigitFactorial(int digit) {
        int factorial = 1;

        for (int i = 1; i <= digit; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Check whether the number is a strong number.
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        do {
            int digit = temp % 10;
            sum += calculateDigitFactorial(digit);
            temp /= 10;
        } while (temp > 0);

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            sc.close();
            return;
        }

        // Find factors and calculate their properties.
        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: "
                + findGreatestFactor(factors));
        System.out.println("Sum of factors: "
                + calculateFactorSum(factors));
        System.out.println("Product of factors: "
                + calculateFactorProduct(factors));
        System.out.println("Product of cubes of factors: "
                + calculateProductOfCubes(factors));

        // Display number classifications.
        System.out.println("Perfect number: "
                + isPerfectNumber(number, factors));
        System.out.println("Abundant number: "
                + isAbundantNumber(number, factors));
        System.out.println("Deficient number: "
                + isDeficientNumber(number, factors));
        System.out.println("Strong number: "
                + isStrongNumber(number));

        sc.close();
    }
}
