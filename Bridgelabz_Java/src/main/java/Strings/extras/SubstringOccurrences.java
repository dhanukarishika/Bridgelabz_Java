/*
 * Q6. Find Substring Occurrences
 * Write a Java program to count how many times
 * a given substring occurs in a string.
 */
package Strings.extras;
import java.util.Scanner;
public class SubstringOccurrences {
    // Method to count substring occurrences
    public static int countOccurrences(String text, String substring) {
        int count = 0;
        if (substring.isEmpty()) {
            return 0;
        }
        // Check each possible starting position
        for (int i = 0; i <= text.length() - substring.length(); i++) {
            boolean isMatch = true;
            // Compare characters of the substring
            for (int j = 0; j < substring.length(); j++) {
                if (text.charAt(i + j) != substring.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.print("Enter substring to search: ");
        String substring = sc.nextLine();
        // Call the method to count occurrences
        int result = countOccurrences(text, substring);
        // Display the result
        System.out.println("Number of Occurrences: " + result);
        sc.close();
    }
}
