
/*
 * Program 4: Split a string into words using charAt(),
 * find the length of each word without using length(),
 * and display the shortest and longest words.
 */
package Strings.level2;
import java.util.Scanner;
public class ShortestLongestWord {
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
        if (!word.isEmpty()) {
            words[wordIndex] = word;
        }
        return words;
    }
    // Method to store words and lengths in a 2D array
    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(
                    findStringLength(words[i]));
        }
        return result;
    }
    // Method to find indexes of shortest and longest words
    public static int[] findShortestLongest(String[][] data) {
        if (data.length == 0) {
            return new int[]{-1, -1};
        }
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            int shortestLength = Integer.parseInt(data[shortestIndex][1]);
            int longestLength = Integer.parseInt(data[longestIndex][1]);
            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
    // Method to display words and their lengths
    public static void displayWordLengths(String[][] data) {
        System.out.printf("%-20s %-10s%n", "Word", "Length");
        System.out.println("------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-20s %-10d%n", data[i][0], Integer.parseInt(data[i][1]));
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
        // Find shortest and longest word indexes
        int[] indexes = findShortestLongest(wordLengths);
        // Display results
        displayWordLengths(wordLengths);
        if (indexes[0] == -1) {
            System.out.println("No words found.");
        } else {
            System.out.println("\nShortest Word: " + wordLengths[indexes[0]][0]);
            System.out.println("Shortest Word Length: " + wordLengths[indexes[0]][1]);
            System.out.println("\nLongest Word: " + wordLengths[indexes[1]][0]);
            System.out.println("Longest Word Length: " + wordLengths[indexes[1]][1]);
        }
        sc.close();
    }
}