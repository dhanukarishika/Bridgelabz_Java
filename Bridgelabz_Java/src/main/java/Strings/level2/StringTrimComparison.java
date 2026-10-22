/*
 * Program 7: Trim leading and trailing spaces from a
 * string using charAt() and compare the result with
 * the built-in trim() method.
 */
package Strings.level2;
import java.util.Scanner;
public class StringTrimComparison {
    // Method to find the start and end indexes after trimming
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length();
        // Skip leading spaces
        while (start < end && text.charAt(start) == ' ') {
            start++;
        }
        // Skip trailing spaces
        while (end > start && text.charAt(end - 1) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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
        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();
        // Find indexes after trimming spaces
        int[] indexes = findTrimIndexes(text);
        // Trim using user-defined methods
        String customResult = createSubstring(text, indexes[0], indexes[1]);
        // Trim using built-in method
        String builtInResult = text.trim();
        // Display results
        System.out.println("Using charAt(): [" + customResult + "]");
        System.out.println("Using trim(): [" + builtInResult + "]");
        // Compare both results
        boolean result = compareStrings(customResult, builtInResult);
        System.out.println("Both results match: " + result);
        sc.close();
    }
}
