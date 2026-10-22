/*
 * Program 1: Find the length of a string without using
 * the built-in length() method and compare both results.
 */
package Strings.level2;
import java.util.Scanner;
public class StringLength {
    // Method to find string length without using length()
    public static int findStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string reached
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        // Find length using user-defined method
        int customLength = findStringLength(text);
        // Find length using built-in method
        int builtInLength = text.length();
        // Display results
        System.out.println("Using charAt(): " + customLength);
        System.out.println("Using length(): " + builtInLength);
        // Compare both results
        System.out.println("Both results match: " + (customLength == builtInLength));
        sc.close();
    }
}
