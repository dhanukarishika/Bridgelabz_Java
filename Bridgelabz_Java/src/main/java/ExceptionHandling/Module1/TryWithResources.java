/*
 * This program demonstrates creating, writing to, and reading from a text file.
 * It uses try-with-resources to automatically close file readers and writers.
 */
package ExceptionHandling.Module1;
import java.io.*;
import java.lang.RuntimeException;
public class TryWithResources {
    public static void main(String[] args) {
        // Creates a File object representing data.txt.
        File file = new File("data.txt");
        // Creates the file if it does not already exist.
        try {
            if (file.createNewFile()) {
                System.out.println("File Created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Writes text into the file and automatically closes the writer afterward.
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"))) {
            writer.write("this is written by akhil from pokuru\n");
            writer.write("he is stupid");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Reads the file line by line and prints its contents.
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}