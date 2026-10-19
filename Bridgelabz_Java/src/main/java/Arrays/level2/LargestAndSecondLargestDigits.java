/*
 * Question 3: Store the digits of a number in an array
 * and find the largest and second-largest distinct digits.
 */
package Arrays.level2;
import java.util.Scanner;
public class LargestAndSecondLargestDigits {
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
        // Initialize an array with an initial capacity of 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        int temp = number;
        // Store each digit and expand the array when it becomes full
        do {
            // Increase array capacity if necessary
            if (index == digits.length) {
                maxDigit = maxDigit + 10;
                int[] tempDigits = new int[maxDigit];
                // Copy existing digits into the larger array
                for (int i = 0; i < digits.length; i++) {
                    tempDigits[i] = digits[i];
                }
                digits = tempDigits;
            }
            // Store the last digit
            digits[index] = temp % 10;
            index++;
            // Remove the last digit
            temp = temp / 10;
        } while (temp > 0);
        // Initialize the largest and second-largest distinct digits
        int largest = -1;
        int secondLargest = -1;
        // Find the two largest distinct digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] < largest && digits[i] > secondLargest) {
                secondLargest = digits[i];
            }
        }
        // Display the results
        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("There is no second-largest distinct digit.");
        } else {
            System.out.println("Second-largest distinct digit: " + secondLargest);
        }
        sc.close();
    }
}
