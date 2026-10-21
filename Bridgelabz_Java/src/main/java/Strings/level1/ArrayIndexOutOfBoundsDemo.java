/*
 * Program 8: Demonstrate ArrayIndexOutOfBoundsException
 * by accessing an invalid array index and handle it
 * using try-catch.
 */
package Strings.level1;
import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        int index = names.length;
        System.out.println("Name: " + names[index]);
    }
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {
        int index = names.length;
        try {
            System.out.println("Name: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid array size.");
            sc.close();
            return;
        }
        String[] names = new String[size];
        // Input array elements
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        // Generate the exception
        System.out.println("\nGenerating Exception:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception generated: " + e);
        }
        // Handle the exception
        System.out.println("\nHandling Exception:");
        handleException(names);
        sc.close();
    }
}
