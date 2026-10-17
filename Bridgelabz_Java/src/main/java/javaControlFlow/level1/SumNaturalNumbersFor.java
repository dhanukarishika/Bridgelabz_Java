/*
 * Question 13: Calculate the sum of the first n natural numbers
 * using a for loop and the mathematical formula.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class SumNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read n
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate sum using for loop
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            // Calculate sum using formula
            int formulaSum = n * (n + 1) / 2;
            // Display and compare results
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Both results are equal: "
                    + (sum == formulaSum));
        }
        sc.close();
    }
}