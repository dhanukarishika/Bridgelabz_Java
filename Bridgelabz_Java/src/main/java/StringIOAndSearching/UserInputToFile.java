package StringIOAndSearching;
import java.io.*;
import java.nio.charset.StandardCharsets;
/*
 * Q8. Read User Input and Write to File Using InputStreamReader
 * Read user input and write each line to a file until "exit" is entered.
 */
public class UserInputToFile {
    public static void main(String[] args) {
        // Read console input and write it to a file
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8));
             FileWriter fw = new FileWriter("output.txt", StandardCharsets.UTF_8)) {
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            // Continue reading until user enters exit
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("exit")) {
                    break;
                }
                fw.write(line + System.lineSeparator());
            }
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
