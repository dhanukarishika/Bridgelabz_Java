
/*
 * Program 2: Find unique characters in a string
 * using charAt() and nested loops without using
 * the built-in length() method.
 */
package Strings.level3;

import java.util.Scanner;
import java.util.Arrays;

public class UniqueCharacters {

    // Method to find string length without using length()
    public static int findStringLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }

        return count;
    }

    // Method to find unique characters using nested loops
    public static char[] findUniqueCharacters(String text) {
        int length = findStringLength(text);

        // Temporary array to store unique characters
        char[] temp = new char[length];
        int uniqueCount = 0;

        // Check each character against previous characters
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        // Create an array of the exact required size
        char[] uniqueCharacters = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = temp[i];
        }

        return uniqueCharacters;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find unique characters
        char[] uniqueCharacters = findUniqueCharacters(text);

        // Display results
        System.out.println("Unique Characters: "
                + Arrays.toString(uniqueCharacters));

        System.out.println("Number of Unique Characters: "
                + uniqueCharacters.length);

        sc.close();
    }
}
