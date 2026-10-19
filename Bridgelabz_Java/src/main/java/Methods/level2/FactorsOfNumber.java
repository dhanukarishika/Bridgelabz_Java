/*
 * Program 1: Find the factors of a number and calculate
 * their sum, product, and sum of squares.
 */
package Methods.level2;
import java.util.Scanner;
public class FactorsOfNumber {
    // Find all factors and return them in an array.
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
        // Store the factors in the array.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }
    // Calculate the sum of the factors.
    public static int calculateSum(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }
    // Calculate the product of the factors.
    public static long calculateProduct(int[] factors) {
        long product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }
    // Calculate the sum of the squares of the factors.
    public static double calculateSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }
        return sumOfSquares;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the number.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            sc.close();
            return;
        }
        // Find the factors.
        int[] factors = findFactors(number);
        // Display the factors.
        System.out.print("Factors: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        // Calculate and display the results.
        int sum = calculateSum(factors);
        long product = calculateProduct(factors);
        double sumOfSquares = calculateSumOfSquares(factors);
        System.out.println("\nSum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        sc.close();
    }
}