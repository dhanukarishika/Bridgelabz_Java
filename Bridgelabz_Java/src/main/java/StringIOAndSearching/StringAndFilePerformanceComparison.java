package StringIOAndSearching;
import java.io.*;
import java.nio.charset.StandardCharsets;
/*
 * Q9. Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
 * Compare concatenation time for 1 million strings and
 * file reading time while counting words in a large file.
 */
public class StringAndFilePerformanceComparison {
    // Count words from a BufferedReader
    static long countWords(BufferedReader br) throws IOException {
        long count = 0;
        String line;
        while ((line = br.readLine()) != null) {
            line = line.trim();
            if (!line.isEmpty()) {
                count += line.split("\\s+").length;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 1000000;
        String str = "hello";
        String fileName = "largefile.txt";
        // Compare StringBuilder performance
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        long builderTime = System.nanoTime() - start;
        // Compare StringBuffer performance
        StringBuffer buffer = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            buffer.append(str);
        }
        long bufferTime = System.nanoTime() - start;
        System.out.println("StringBuilder Time: "
                + builderTime / 1000000.0 + " ms");
        System.out.println("StringBuffer Time: " + bufferTime / 1000000.0 + " ms");
        // Read file using FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName, StandardCharsets.UTF_8))) {
            start = System.nanoTime();
            long words = countWords(br);
            long fileReaderTime = System.nanoTime() - start;
            System.out.println("\nFileReader Word Count: " + words);
            System.out.println("FileReader Time: " + fileReaderTime / 1000000.0 + " ms");
        } catch (IOException e) {
            System.out.println("FileReader Error: " + e.getMessage());
        }
        // Read file using InputStreamReader
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            start = System.nanoTime();
            long words = countWords(br);
            long inputStreamTime = System.nanoTime() - start;
            System.out.println("\nInputStreamReader Word Count: " + words);
            System.out.println("InputStreamReader Time: " + inputStreamTime / 1000000.0 + " ms");
        } catch (IOException e) {
            System.out.println("InputStreamReader Error: " + e.getMessage());
        }
    }
}
