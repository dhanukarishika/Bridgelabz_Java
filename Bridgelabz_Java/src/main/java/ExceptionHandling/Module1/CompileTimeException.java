/*
 * This program demonstrates handling compile-time (checked) exceptions while reading a file.
 * It reads and prints the contents of data.txt and handles file-related errors.
 */
package ExceptionHandling.Module1;
import java.io.*;
public class CompileTimeException {
    public static void main(String[] args) throws IOException {
        // Specifies the name of the file to be read.
        String file = "data.txt";
        // Opens the file and automatically closes the reader when finished.
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            // Reads and prints the file one line at a time until the end is reached.
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handles the situation where the specified file cannot be found.
            System.out.println(e.getMessage());
        } catch (IOException e) {
            // Handles other errors that occur while reading the file.
            System.out.println(e.getMessage());
        }
    }
}