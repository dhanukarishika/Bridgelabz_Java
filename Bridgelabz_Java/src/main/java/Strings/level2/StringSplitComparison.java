/*
 * Program 2: Split a string into words using charAt()
 * without using split() and compare the result
 * with the built-in split() method.
 */
package Strings.level2;
import java.util.Scanner;
import java.util.Arrays;
public class StringSplitComparison {
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
    // Method to split text into words using charAt()
    public static String[] splitWords(String text) {
        int length = findStringLength(text);
        int wordCount = 0;
        boolean inWord = false;
        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    wordCount++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        // Store the starting and ending indexes of words
        int[] startIndexes = new int[wordCount];
        int[] endIndexes = new int[wordCount];
        int index = 0;
        inWord = false;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                if (!inWord) {
                    startIndexes[index] = i;
                    inWord = true;
                }
            } else if (inWord) {
                endIndexes[index] = i;
                index++;
                inWord = false;
            }
        }
        if (inWord) {
            endIndexes[index] = length;
        }
        // Create words using the stored indexes
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = startIndexes[i]; j < endIndexes[i]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }
    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Split using user-defined method
        String[] customWords = splitWords(text);
        // Split using built-in method
        String[] builtInWords = text.trim().isEmpty() ? new String[0] : text.trim().split(" +");
        // Display results
        System.out.println("Using charAt(): " + Arrays.toString(customWords));
        System.out.println("Using split(): " + Arrays.toString(builtInWords));
        // Compare both arrays
        boolean result = compareStringArrays(customWords, builtInWords);
        System.out.println("Both results match: " + result);
        sc.close();
    }
}
