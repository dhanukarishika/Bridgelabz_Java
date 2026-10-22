
/*
 * Program 6: Find the frequency of each character
 * in a string using nested loops and toCharArray().
 * Display each character and its frequency.
 */
package Strings.level3;

import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method to find character frequencies using nested loops
    public static String[] findCharacterFrequency(String text) {

        // Convert the string into a character array
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Count the frequency of each character
        for (int i = 0; i < characters.length; i++) {

            if (characters[i] == '\0') {
                continue;
            }

            frequency[i] = 1;

            for (int j = i + 1; j < characters.length; j++) {

                if (characters[i] == characters[j]) {
                    frequency[i]++;

                    // Mark duplicate characters as processed
                    characters[j] = '\0';
                }
            }
        }

        // Count the number of distinct characters
        int uniqueCount = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '\0') {
                uniqueCount++;
            }
        }

        // Store characters and frequencies in a 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {

            if (characters[i] != '\0') {
                String character = String.valueOf(characters[i]);

                result[index] = character + " : " + frequency[i];
                index++;
            }
        }

        return result;
    }

    // Method to display character frequencies
    public static void displayCharacterFrequency(String[] data) {

        System.out.println("\nCharacter Frequencies:");
        System.out.println("------------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find frequencies using nested loops
        String[] frequencies = findCharacterFrequency(text);

        // Display results
        displayCharacterFrequency(frequencies);

        sc.close();
    }
}
