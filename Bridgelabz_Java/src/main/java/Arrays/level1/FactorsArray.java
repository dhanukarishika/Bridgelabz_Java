/*
 * Question 8: Find all factors of a number and store them
 * in an array, increasing the array capacity when required.
 */
package Arrays.level1;
import java.util.Scanner;
public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        // Initialize the array with the starting capacity
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int factorCount = 0;
        // Find factors and expand the array if it becomes full
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Double the array capacity when necessary
                if (factorCount == factors.length) {
                    maxFactor = maxFactor * 2;
                    int[] expandedFactors = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        expandedFactors[j] = factors[j];
                    }
                    factors = expandedFactors;
                }
                // Store the factor
                factors[factorCount] = i;
                factorCount++;
            }
        }
        // Display all factors stored in the array
        System.out.print("Factors of " + number + ": ");
        for (int i = 0; i < factorCount; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}