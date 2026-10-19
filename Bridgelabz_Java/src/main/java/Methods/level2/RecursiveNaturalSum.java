/*
 * Program 2: Find the sum of n natural numbers using
 * recursion and compare the result with the formula
 * n * (n + 1) / 2. Display both results and verify
 * whether they match.
 */
package Methods.level2;
import java.util.Scanner;
public class RecursiveNaturalSum {
    // Calculate sum using recursion
    public static long calculateSumRecursively(int number) {
        if (number == 1) {
            return 1;
        }
        return number + calculateSumRecursively(number - 1);
    }
    // Calculate sum using the mathematical formula
    public static long calculateSumUsingFormula(int number) {
        return (long) number * (number + 1L) / 2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long recursiveSum = calculateSumRecursively(number);
            long formulaSum = calculateSumUsingFormula(number);
            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);
            if (recursiveSum == formulaSum) {
                System.out.println("Both results match.");
            } else {
                System.out.println("Both results do not match.");
            }
        }
        input.close();
    }
}