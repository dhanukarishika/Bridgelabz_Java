package ExceptionHandling.Module2;
/*
 * Program to read data from two files and combine their contents into a third file.
 * Try-with-resources automatically closes all three file resources.
 */
import java.io.*;
public class CombineFiles {
    public static void main(String[] args) {
        // Open two input files and one output file
        try (
                BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
                BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("combined.txt"))
        ) {
            String line;
            // Read and write contents of first file
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            // Read and write contents of second file
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            System.out.println("Files combined successfully");
        } catch (IOException e) {
            // Handle file operation exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}
