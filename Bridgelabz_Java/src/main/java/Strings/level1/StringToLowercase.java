/*
 * Program 10: Convert a string to lowercase using
 * charAt() and ASCII values, then compare the result
 * with the built-in toLowerCase() method.
 */
package Strings.level1;
import java.util.Scanner;
public class StringToLowercase {
    // Method to convert a string to lowercase using charAt()
    public static String convertToLowercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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
        String customResult = convertToLowercase(text);
        // Convert using built-in method
        String builtInResult = text.toLowerCase();
        // Display results
        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using toLowerCase(): " + builtInResult);
        // Compare both results
        boolean result = compareStrings(customResult, builtInResult);
        System.out.println("Both results match: " + result);
        sc.close();
    }
}
