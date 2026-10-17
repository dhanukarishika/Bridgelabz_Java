/*
 * Question 16: Print whether each number from 1 to N
 * is odd or even using a for loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class OddEvenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the limit
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        }
        else {
            // Check each number
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }
        sc.close();
    }
}