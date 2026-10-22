/*
 * Q5. Palindrome Checker
 * Write a Java program to check whether a string
 * is a palindrome using separate methods for
 * input, checking, and displaying the result.
 */
package Methods.extras;
import java.util.Scanner;
public class PalindromeChecker {
    // Method to take input from the user
    public static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    // Method to check whether a string is a palindrome
    public static boolean isPalindrome(String text) {
        // Ignore spaces, punctuation, and letter case
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Method to display the result
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input
        String text = takeInput(sc);
        // Check palindrome
        boolean result = isPalindrome(text);
        // Display result
        displayResult(text, result);
        sc.close();
    }
}
