/*
 * Program 7: Demonstrate NumberFormatException
 * using Integer.parseInt() and handle it
 * using try-catch.
 */
package Strings.level1;
import java.util.Scanner;
public class NumberFormatExceptionDemo {
    // Method to generate NumberFormatException
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }
    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        // Generate the exception
        System.out.println("\nGenerating Exception:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception generated: " + e);
        }
        // Handle the exception
        System.out.println("\nHandling Exception:");
        handleException(text);
        sc.close();
    }
}
