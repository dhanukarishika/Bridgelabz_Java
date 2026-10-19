
/*
 * Program 2: Create a NumberChecker utility to check
 * duck and Armstrong numbers and find the largest,
 * second-largest, smallest, and second-smallest digits.
 */
package Methods.level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker {

    // Count the digits in a number.
    public static int countDigits(int number) {
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }

    // Store the digits of a number in an array.
    public static int[] getDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Check whether the number is a duck number.
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
    }

    // Check whether the number is an Armstrong number.
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int digitCount = digits.length;

        for (int i = 0; i < digits.length; i++) {
            sum += (int) Math.pow(digits[i], digitCount);
        }

        return sum == number;
    }

    // Find the largest and second-largest distinct digits.
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest
                    && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        return new int[]{largest, secondLargest};
    }

    // Find the smallest and second-smallest distinct digits.
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest;
                smallest = digits[i];
            } else if (digits[i] < secondSmallest
                    && digits[i] > smallest) {
                secondSmallest = digits[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
            sc.close();
            return;
        }

        // Get the digits of the number.
        int[] digits = getDigits(number);

        System.out.println("Digits: " + Arrays.toString(digits));

        // Check duck and Armstrong numbers.
        System.out.println("Duck number: " + isDuckNumber(digits));
        System.out.println("Armstrong number: "
                + isArmstrongNumber(number, digits));

        // Find the largest and second-largest digits.
        int[] largestDigits = findLargestAndSecondLargest(digits);

        System.out.println("Largest digit: " + largestDigits[0]);

        if (largestDigits[1] == Integer.MIN_VALUE) {
            System.out.println("No second-largest distinct digit.");
        } else {
            System.out.println("Second-largest digit: " + largestDigits[1]);
        }

        // Find the smallest and second-smallest digits.
        int[] smallestDigits = findSmallestAndSecondSmallest(digits);

        System.out.println("Smallest digit: " + smallestDigits[0]);

        if (smallestDigits[1] == Integer.MAX_VALUE) {
            System.out.println("No second-smallest distinct digit.");
        } else {
            System.out.println("Second-smallest digit: " + smallestDigits[1]);
        }

        sc.close();
    }
}
