/*
 * Q5. Find the Longest Word in a Sentence
 * Write a Java program to take a sentence as input
 * and return the longest word in the sentence.
 */
package Strings.extras;
import java.util.Scanner;
public class LongestWord {
    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+");
        String longestWord = "";
        // Compare the length of each word
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        // Call the method to find the longest word
        String longestWord = findLongestWord(sentence);
        // Display the result
        if (longestWord.isEmpty()) {
            System.out.println("No words found.");
        } else {
            System.out.println("Longest Word: " + longestWord);
            System.out.println("Length: " + longestWord.length());
        }
        sc.close();
    }
}
