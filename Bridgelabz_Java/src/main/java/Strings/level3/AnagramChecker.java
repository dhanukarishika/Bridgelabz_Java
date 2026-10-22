
/*
 * Program 8: Check whether two strings are anagrams
 * by comparing their lengths and character frequencies
 * using arrays.
 */
package Strings.level3;

import java.util.Scanner;

public class AnagramChecker {

    // Method to check whether two strings are anagrams
    public static boolean checkAnagram(String firstText, String secondText) {

        // Check if both strings have equal lengths
        if (firstText.length() != secondText.length()) {
            return false;
        }

        // Frequency arrays for characters in both strings
        int[] firstFrequency = new int[256];
        int[] secondFrequency = new int[256];

        // Count the frequency of each character
        for (int i = 0; i < firstText.length(); i++) {
            char firstChar = firstText.charAt(i);
            char secondChar = secondText.charAt(i);

            // Check whether characters are within supported range
            if (firstChar >= 256 || secondChar >= 256) {
                throw new IllegalArgumentException(
                        "Only characters with values 0 to 255 are supported.");
            }

            firstFrequency[firstChar]++;
            secondFrequency[secondChar]++;
        }

        // Compare the frequencies of all characters
        for (int i = 0; i < 256; i++) {
            if (firstFrequency[i] != secondFrequency[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first string: ");
            String firstText = sc.nextLine();

            System.out.print("Enter second string: ");
            String secondText = sc.nextLine();

            // Check whether the strings are anagrams
            boolean result = checkAnagram(firstText, secondText);

            // Display the result
            if (result) {
                System.out.println("The two strings are Anagrams.");
            } else {
                System.out.println("The two strings are not Anagrams.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
