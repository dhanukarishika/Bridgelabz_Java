
/*
 * Program 7: Check whether a string is a palindrome
 * using three methods: iteration, recursion, and
 * character arrays.
 */
package Strings.level3;

import java.util.Scanner;

public class PalindromeChecker {

    // Method 1: Check palindrome using iteration
    public static boolean checkPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 2: Check palindrome using recursion
    public static boolean checkPalindromeRecursive(
            String text, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        return checkPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }

        return reversed;
    }

    // Method 3: Check palindrome using character arrays
    public static boolean checkPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Check palindrome using iteration
        boolean iterativeResult = checkPalindromeIterative(text);

        // Check palindrome using recursion
        boolean recursiveResult = checkPalindromeRecursive(
                text, 0, text.length() - 1);

        // Check palindrome using character arrays
        boolean arrayResult = checkPalindromeUsingArray(text);

        // Display results
        System.out.println("Using Iteration: " + iterativeResult);
        System.out.println("Using Recursion: " + recursiveResult);
        System.out.println("Using Character Arrays: " + arrayResult);

        if (iterativeResult && recursiveResult && arrayResult) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }

        sc.close();
    }
}
