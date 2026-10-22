/*
 * Q8. Compare Two Strings
 * Write a Java program to compare two strings
 * lexicographically without using built-in
 * comparison methods.
 */
package Strings.extras;
import java.util.Scanner;
public class LexicographicalComparison {
    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        // Compare characters one by one
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            if (ch1 < ch2) {
                return -1;
            } else if (ch1 > ch2) {
                return 1;
            }
        }
        // If all compared characters are equal,
        // the shorter string comes first
        if (str1.length() < str2.length()) {
            return -1;
        } else if (str1.length() > str2.length()) {
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        // Call the method to compare strings
        int result = compareStrings(str1, str2);
        // Display the result
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" +
                    str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" +
                    str2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
        sc.close();
    }
}
