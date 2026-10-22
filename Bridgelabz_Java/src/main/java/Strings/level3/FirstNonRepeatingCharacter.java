
/*
 * Program 3: Find the first non-repeating character
 * in a string using charAt() and an ASCII frequency array.
 */
package Strings.level3;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {

        // Array to store frequencies of 256 ASCII characters
        int[] frequency = new int[256];

        // Count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < 256) {
                frequency[ch]++;
            }
        }

        // Find the first character that occurs only once
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < 256 && frequency[ch] == 1) {
                return ch;
            }
        }

        // Return null character if none is found
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeating(text);

        // Display result
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First Non-Repeating Character: " + result);
        }

        sc.close();
    }
}
