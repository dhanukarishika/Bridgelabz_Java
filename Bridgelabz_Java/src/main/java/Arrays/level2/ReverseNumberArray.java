/*
 * Question 4: Reverse a number by storing its digits
 * in an array and displaying them in reverse order.
 */
package Arrays.level2;
import java.util.Scanner;
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the input number
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
            sc.close();
            return;
        }
        // Count the number of digits
        int temp = number;
        int digitCount = 0;
        do {
            digitCount++;
            temp /= 10;
        } while (temp > 0);
        // Create an array to store the digits
        int[] digits = new int[digitCount];
        temp = number;
        // Extract and store each digit
        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        // Create another array to store the digits in reverse order
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        // Display the digits in reverse order
        System.out.print("Digits in reverse order: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        sc.close();
    }
}
