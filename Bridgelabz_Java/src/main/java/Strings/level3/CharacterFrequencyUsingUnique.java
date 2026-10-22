
/*
 * Program 5: Find the frequency of characters in a
 * string using unique characters, charAt(), and an
 * ASCII frequency array. Display the results in a table.
 */
package Strings.level3;

import java.util.Scanner;

public class CharacterFrequencyUsingUnique {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // Compare with previously occurring characters
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

        // Create an array of the required size
        char[] unique = new char[uniqueCount];

        for (int i = 0; i < uniqueCount; i++) {
            unique[i] = temp[i];
        }

        return unique;
    }

    // Method to find character frequencies
    public static String[][] findCharacterFrequency(String text) {

        // Array to store ASCII character frequencies
        int[] frequency = new int[256];

        // Count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < 256) {
                frequency[ch]++;
            }
        }

        // Find unique characters
        char[] unique = uniqueCharacters(text);

        // Count unique characters within the supported range
        int count = 0;

        for (char ch : unique) {
            if (ch < 256) {
                count++;
            }
        }

        // Store characters and frequencies in a 2D array
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < unique.length; i++) {
            char ch = unique[i];

            if (ch < 256) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                index++;
            }
        }

        return result;
    }

    // Method to display frequencies in tabular format
    public static void displayCharacterFrequency(String[][] data) {

        System.out.printf("%-15s %-15s%n",
                "Character", "Frequency");

        System.out.println("------------------------------");

        for (int i = 0; i < data.length; i++) {
            String character = data[i][0];

            if (character.equals(" ")) {
                character = "[Space]";
            }

            int frequency = Integer.parseInt(data[i][1]);

            System.out.printf("%-15s %-15d%n",
                    character, frequency);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find frequencies using unique characters
        String[][] frequencies = findCharacterFrequency(text);

        // Display results
        displayCharacterFrequency(frequencies);

        sc.close();
    }
}
