package StringIOAndSearching;
import java.io.*;
import java.nio.charset.StandardCharsets;
/*
 * Q7. Convert Byte Stream to Character Stream Using InputStreamReader
 * Read UTF-8 encoded data from a file and display it as characters.
 */
public class ByteStreamToCharacterStream {
    // Read byte stream and convert it into characters
    static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;
            // Read and display each line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        readFile("sample.txt");
    }
}
