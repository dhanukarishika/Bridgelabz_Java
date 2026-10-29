package StringIOAndSearching;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Q6. Count Word Occurrences Using FileReader
 * Count how many times a specific word appears in a text file.
 */
public class CountWordOccurrences {
    // Count occurrences of the target word
    static void countWords(String fileName, String target) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read file line by line
            while ((line = br.readLine()) != null) {
                // Split each line into words
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
            System.out.println("Word '" + target + "' occurs " + count + " times.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        countWords("sample.txt", "Java");
    }
}
