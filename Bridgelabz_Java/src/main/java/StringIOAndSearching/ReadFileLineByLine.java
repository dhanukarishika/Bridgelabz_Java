package StringIOAndSearching;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/*
 * Q5. Read a File Line by Line Using FileReader
 * Read a text file line by line and display its contents.
 */
public class ReadFileLineByLine {
    // Read and display file contents
    static void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line until the end of file
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
