/*
 * Program 6: Identify each character in a string as
 * Vowel, Consonant, or Not a Letter using charAt()
 * and display the results in a 2D String array.
 */
package Strings.level2;
import java.util.Scanner;
public class VowelConsonantType {
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
    // Method to store characters and their types in a 2D array
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
    // Method to display the 2D array in tabular format
    public static void displayCharacterTypes(String[][] data) {
        System.out.printf("%-15s %-20s%n", "Character", "Type");
        System.out.println("-----------------------------------");
        for (int i = 0; i < data.length; i++) {
            String character = data[i][0];
            // Display spaces clearly
            if (character.equals(" ")) {
                character = "[Space]";
            }
            System.out.printf("%-15s %-20s%n",
                    character, data[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Find character types
        String[][] characterTypes = findCharacterTypes(text);
        // Display results
        displayCharacterTypes(characterTypes);
        sc.close();
    }
}
