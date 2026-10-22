/*
 * Q7. Toggle Case of Characters
 * Write a Java program to convert uppercase letters
 * to lowercase and lowercase letters to uppercase.
 */
package Strings.extras;
import java.util.Scanner;
public class ToggleCase {
    // Method to toggle the case of characters
    public static String toggleCase(String text) {
        String result = "";
        // Traverse each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            }
            // Convert lowercase to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            }
            // Keep spaces, digits and symbols unchanged
            else {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Call the method to toggle case
        String modifiedString = toggleCase(text);
        // Display the result
        System.out.println("Toggled String: " + modifiedString);
        sc.close();
    }
}
