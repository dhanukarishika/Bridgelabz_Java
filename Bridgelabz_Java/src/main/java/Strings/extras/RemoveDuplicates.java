/*
 * Q4. Remove Duplicates from a String
 * Write a Java program to remove duplicate characters
 * from a string and return the modified string.
 */
package Strings.extras;
import java.util.Scanner;
public class RemoveDuplicates {
    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";
        // Traverse each character of the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isDuplicate = false;
            // Check if character already exists in result
            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            // Add character only if it is not a duplicate
            if (!isDuplicate) {
                result += ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Call the method to remove duplicates
        String modifiedString = removeDuplicates(text);
        // Display the result
        System.out.println("Modified String: " + modifiedString);
        sc.close();
    }
}
