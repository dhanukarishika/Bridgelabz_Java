package Collections.Map;
import java.io.*;
import java.util.*;
/*
 * Q1. Word Frequency Counter
 * Read a text file and count word frequencies using HashMap,
 * ignoring case and punctuation.
 */
public class WordFrequencyCounter {
    // Count word occurrences from a text file
    public static Map<String, Integer> countWords(String fileName) throws IOException {
        Map<String, Integer> frequency = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Convert to lowercase and split by punctuation or spaces
                String[] words = line.toLowerCase().split("[^a-z0-9]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        frequency.put(word, frequency.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return frequency;
    }
    public static void main(String[] args) throws IOException {
        Map<String, Integer> result = countWords("words.txt");
        System.out.println("Word Frequencies: " + result);
    }
}