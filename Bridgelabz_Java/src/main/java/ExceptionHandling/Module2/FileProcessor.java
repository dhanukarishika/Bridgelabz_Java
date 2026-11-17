package ExceptionHandling.Module2;
/*
 * Program to read contents from multiple files using BufferedReader.
 * Try-with-resources automatically closes file resources even when exceptions occur.
 */
import java.io.*;
import java.util.*;
public class FileProcessor {
    public void FileProcessors(List<String> filePaths) {
        // Iterate through each file path
        for (String path : filePaths) {
            // Open the file using try-with-resources
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String line;
                // Read the file line by line
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                // Handle file reading exceptions
                System.out.println("Error reading file: " + path);
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor();
        // List of files to process
        List<String> files = Arrays.asList("file1.txt", "file2.txt", "file3.txt");
        fp.FileProcessors(files);
    }
}
