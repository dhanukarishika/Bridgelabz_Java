/*
 * Q9. Find the Most Frequent Character
 * Write a Java program to find the character
 * that occurs most frequently in a given string.
 */
package Strings.extras;
import java.util.Scanner;
public class MostFrequentCharacter {
    // Method to find the most frequent character
    public static char findMostFrequentCharacter(String text) {
        int maxCount = 0;
        char mostFrequent = '\0';
        // Check each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int count = 0;
            // Count occurrences of the current character
            for (int j = 0; j < text.length(); j++) {
                if (ch == text.charAt(j)) {
                    count++;
                }
            }
            // Update the most frequent character
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = ch;
            }
        }
        return mostFrequent;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Check for empty input
        if (text.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            // Call the method
            char result = findMostFrequentCharacter(text);
            // Display the result
            System.out.println("Most Frequent Character: '" + result + "'");
        }
        sc.close();
    }
}
