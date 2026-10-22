/*
 * Program 5: Find the number of vowels and consonants
 * in a string using charAt() and ASCII values.
 */
package Strings.level2;
import java.util.Scanner;
public class VowelConsonantCount {
    // Method to check whether a character is a vowel or consonant
    public static String checkCharacterType(char ch) {
        // Convert uppercase letters to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        // Check if the character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharacterType(ch);
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Count vowels and consonants
        int[] result = countVowelsConsonants(text);
        // Display results
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);
        sc.close();
    }
}
