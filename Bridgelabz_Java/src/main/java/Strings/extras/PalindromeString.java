/*
 * Q3. Palindrome String Check
 * Write a Java program to check whether a given
 * string reads the same forward and backward.
 */
package Strings.extras;
import java.util.Scanner;
public class PalindromeString {
    // Method to check whether a string is a palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;
        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Call the method to check palindrome
        boolean result = isPalindrome(text);
        // Display the result
        if (result) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is not a Palindrome.");
        }
        sc.close();
    }
}
