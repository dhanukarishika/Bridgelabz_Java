/*
 * Program 5: Demonstrate StringIndexOutOfBoundsException
 * using charAt() and handle it using try-catch.
 */
package Strings.level1;
import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        int index = text.length();
        System.out.println("Character: " + text.charAt(index));
    }
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        int index = text.length();
        try {
            System.out.println("Character: " + text.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
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
        try
        {
            generateException(text);
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception generated: " + e);
        }
        // Handle the exception
        System.out.println("\nHandling Exception:");
        handleException(text);
        sc.close();
    }
}
