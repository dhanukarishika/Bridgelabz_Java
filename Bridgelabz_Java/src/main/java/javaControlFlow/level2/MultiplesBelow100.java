/*
 * Question 12: Display all multiples of a number below 100.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Validate the input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Print multiples below 100 in descending order
            System.out.println("Multiples of " + number + " below 100:");
            for (int i = 99; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
