/*
 * Q2. Reverse a String
 * Write a Java program to reverse a given string
 * without using any built-in reverse functions.
 */
package Strings.extras;
import java.util.Scanner;
public class StringReverse {
    // Method to reverse a string
    public static String reverseString(String text) {
        String reversed = "";
        // Traverse the string from last to first
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Call the method to reverse the string
        String reversed = reverseString(text);
        // Display the result
        System.out.println("Reversed String: " + reversed);
        sc.close();
    }
}
