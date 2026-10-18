/*
 * Question 9: Find the greatest factor of a number
 * other than the number itself.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get input from the user
        System.out.print("Enter a positive integer greater than 1: ");
        int number = sc.nextInt();
        // Validate the input
        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
        } else {
            // Search for the greatest factor below the number
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    System.out.println("Greatest factor other than itself: " + i);
                    break;
                }
            }
        }
        sc.close();
    }
}
