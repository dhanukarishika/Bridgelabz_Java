/*
 * Q2. Maximum of Three Numbers
 * Write a Java program to take three integer inputs
 * and find the maximum using modular functions.
 */
package Methods.extras;
import java.util.Scanner;
public class MaximumOfThree {
    // Method to take integer input
    public static int takeInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }
    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take three numbers as input
        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");
        int num3 = takeInput(sc, "Enter third number: ");
        // Call method to find maximum
        int maximum = findMaximum(num1, num2, num3);
        // Display result
        System.out.println("Maximum number: " + maximum);
        sc.close();
    }
}
