
/*
 * Q1. Count Vowels and Consonants
 * Write a Java program to count the number of vowels
 * and consonants in a given string.
 */
package Strings.extras;

import java.util.Scanner;

public class VowelConsonantCount {

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        // Convert string to lowercase
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check whether the character is an alphabet
            if (ch >= 'a' && ch <= 'z') {

                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Call the method
        int[] result = countVowelsAndConsonants(text);

        // Display results
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);

        sc.close();
    }
}
