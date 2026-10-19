/*
 * Question 9: Find the frequency of each digit in a number
 * using a digit array and a frequency array.
 */
package Arrays.level2;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the number
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
            sc.close();
            return;
        }
        // Count the number of digits
        int temp = number;
        int digitCount = 0;
        do {
            digitCount++;
            temp /= 10;
        } while (temp != 0);
        // Store each digit in an array
        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        // Create an array to store the frequency of digits 0 to 9
        int[] frequency = new int[10];
        // Count the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        // Display the digit frequencies
        System.out.println("\nDigit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " appears " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}
