
/*
 * Program 4: Find the frequency of each character
 * in a string using charAt() and an ASCII frequency
 * array. Display the results in a tabular format.
 */
package Strings.level3;

import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of each character
    public static String[][] findCharacterFrequency(String text) {

        // Array to store frequencies of 256 ASCII characters
        int[] frequency = new int[256];

        // Count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < 256) {
                frequency[ch]++;
            }
        }

        // Count the number of distinct characters
        int uniqueCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and frequencies
        String[][] result = new String[uniqueCount][2];

        int index = 0;

        // Store each character and its frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < 256 && frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);

                index++;

                // Mark character as already processed
                frequency[ch] = 0;
            }
        }

        return result;
    }

    // Method to display character frequencies
    public static void displayCharacterFrequency(String[][] data) {

        System.out.printf("%-15s %-15s%n",
                "Character", "Frequency");

        System.out.println("------------------------------");

        for (int i = 0; i < data.length; i++) {
            String character = data[i][0];

            // Display spaces clearly
            if (character.equals(" ")) {
                character = "[Space]";
            }

            int count = Integer.parseInt(data[i][1]);

            System.out.printf("%-15s %-15d%n",
                    character, count);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display results
        displayCharacterFrequency(frequencies);

        sc.close();
    }
}
