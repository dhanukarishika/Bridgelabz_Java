package ExceptionHandling.Module2;
/*
 * Program to demonstrate checked and unchecked exceptions.
 * It handles IOException and ArithmeticException separately.
 */
import java.io.*;
public class ExceptionTypes {
    // Method that throws a checked and an unchecked exception
    public static void processData(int number) throws IOException {
        // Throw checked exception
        if (number < 0) {
            throw new IOException("Negative number is not allowed");
        }
        // Throw unchecked exception
        if (number == 0) {
            throw new ArithmeticException("Zero is not allowed");
        }
        System.out.println("Data processed successfully");
    }
    public static void main(String[] args) {
        try {
            // Call the method
            processData(-10);
        } catch (IOException e) {
            // Handle checked exception
            System.out.println("Checked Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            // Handle unchecked exception
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }
}