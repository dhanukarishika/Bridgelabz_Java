
/*
 * Program 3: Convert a string into a character array
 * without using toCharArray() and compare the result
 * with the built-in toCharArray() method.
 */
package Strings.level1;
import java.util.Scanner;
public class StringToCharArray {
    // Convert a string to a character array using charAt()
    public static char[] convertToCharArray(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }
    // Compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        // Convert using user-defined method
        char[] customArray = convertToCharArray(text);
        // Convert using built-in method
        char[] builtInArray = text.toCharArray();
        // Display both arrays
        System.out.println("Using charAt():");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }
        System.out.println("\nUsing toCharArray():");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }
        // Compare the arrays
        boolean result = compareCharArrays(customArray, builtInArray);
        System.out.println("\nBoth arrays match: " + result);
        sc.close();
    }
}
