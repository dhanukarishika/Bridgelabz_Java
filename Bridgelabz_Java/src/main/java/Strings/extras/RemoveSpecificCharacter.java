/*
 * Q10. Remove a Specific Character from a String
 * Write a Java program to remove all occurrences
 * of a specific character from a given string.
 */
package Strings.extras;
import java.util.Scanner;
public class RemoveSpecificCharacter {
    // Method to remove a specific character
    public static String removeCharacter(String text, char ch) {
        String result = "";
        // Traverse each character of the string
        for (int i = 0; i < text.length(); i++) {
            // Add only characters that do not match
            if (text.charAt(i) != ch) {
                result += text.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = sc.nextLine().charAt(0);
        // Call the method to remove the character
        String modifiedString = removeCharacter(text, ch);
        // Display the result
        System.out.println("Modified String: " + modifiedString);
        sc.close();
    }
}