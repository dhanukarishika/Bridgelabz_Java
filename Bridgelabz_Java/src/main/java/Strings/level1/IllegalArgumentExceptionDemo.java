/*
 * Program 6: Demonstrate IllegalArgumentException
 * using substring() with invalid indexes and
 * handle it using try-catch.
 */
package Strings.level1;
import java.util.Scanner;
public class IllegalArgumentExceptionDemo {
    // Method to generate IllegalArgumentException
    public static void generateException(String text) {
        int start = text.length();
        int end = 0;
        System.out.println("Substring: " + text.substring(start, end));
    }
    // Method to handle IllegalArgumentException
    public static void handleException(String text) {
        int start = text.length();
        int end = 0;
        try {
            System.out.println("Substring: " + text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        // Generate the exception
        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception generated: " + e);
        }
        // Handle the exception
        System.out.println("\nHandling Exception:");
        handleException(text);
        sc.close();
    }
}
