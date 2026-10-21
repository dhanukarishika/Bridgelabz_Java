/*
 * Program 9: Convert a string to uppercase using
 * charAt() and ASCII values, then compare the result
 * with the built-in toUpperCase() method.
 */
package Strings.level1;
import java.util.Scanner;
public class StringToUppercase {
    // Method to convert a string to uppercase using charAt()
    public static String convertToUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Convert using user-defined method
        String customResult = convertToUppercase(text);
        // Convert using built-in method
        String builtInResult = text.toUpperCase();
        // Display results
        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using toUpperCase(): " + builtInResult);
        // Compare both results
        boolean result = compareStrings(customResult, builtInResult);
        System.out.println("Both results match: " + result);
        sc.close();
    }
}
