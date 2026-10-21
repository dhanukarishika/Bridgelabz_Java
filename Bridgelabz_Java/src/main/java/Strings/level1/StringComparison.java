/*
 * Program 1: Compare two strings using charAt() and
 * verify the result using the built-in equals() method.
 */
package Strings.level1;
import java.util.Scanner;
public class StringComparison {
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
        // Take input from the user
        System.out.print("Enter first string: ");
        String text1 = sc.next();
        System.out.print("Enter second string: ");
        String text2 = sc.next();
        // Compare using user-defined method
        boolean customResult = compareStrings(text1, text2);
        // Compare using built-in equals() method
        boolean builtInResult = text1.equals(text2);
        // Display results
        System.out.println("Using charAt(): " + customResult);
        System.out.println("Using equals(): " + builtInResult);
        System.out.println("Both results match: " + (customResult == builtInResult));
        sc.close();
    }
}
