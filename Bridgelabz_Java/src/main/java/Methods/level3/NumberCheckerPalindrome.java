
/*
 * Program 4: Reverse the digits array, compare two arrays,
 * and check whether a number is a palindrome or duck number.
 */
package Methods.level3;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerPalindrome {

    // Count the digits in a number.
    public static int countDigits(int number) {
        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }

    // Store the digits in their original order.
    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];

        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    // Reverse the digits array.
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    // Compare two arrays and check whether they are equal.
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;
    }

    // Check whether the number is a palindrome.
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Check whether the digits contain a zero.
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }

        return false;
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

        // Get and reverse the digits.
        int[] digits = getDigits(number);
        int[] reversedDigits = reverseDigits(digits);

        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reversed digits: "
                + Arrays.toString(reversedDigits));

        // Display the results.
        System.out.println("Arrays are equal: "
                + areArraysEqual(digits, reversedDigits));

        System.out.println("Palindrome number: "
                + isPalindrome(digits));

        System.out.println("Duck number: "
                + isDuckNumber(digits));

        sc.close();
    }
}
