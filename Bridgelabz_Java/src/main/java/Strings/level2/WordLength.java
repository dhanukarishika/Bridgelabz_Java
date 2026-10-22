
/*
 * Program 3: Split a string into words using charAt()
 * without using split(), find the length of each word
 * and display the results using a 2D String array.
 */
package Strings.level2;
import java.util.Scanner;
public class WordLength {
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
        String[] words = new String[wordCount];
        int wordIndex = 0;
        String word = "";
        // Extract words using charAt()
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                words[wordIndex] = word;
                wordIndex++;
                word = "";
            }
        }
        // Store the last word
        if (!word.isEmpty()) {
            words[wordIndex] = word;
        }
        return words;
    }
    // Method to store words and their lengths in a 2D array
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            int length = findStringLength(words[i]);
            result[i][1] = String.valueOf(length);
        }
        return result;
    }
    // Method to display results in tabular format
    public static void displayWordLengths(String[][] data) {
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("------------------------------");
        for (int i = 0; i < data.length; i++) {
            String word = data[i][0];
            int length = Integer.parseInt(data[i][1]);
            System.out.printf("%-20s %-10d%n", word, length);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        // Split text into words
        String[] words = splitWords(text);
        // Store words and their lengths
        String[][] wordLengths = getWordLengths(words);
        // Display results
        displayWordLengths(wordLengths);
        sc.close();
    }
}
