package ExceptionHandling.Module2;
/*
 * Program to demonstrate rethrowing exceptions with additional context.
 * It performs division and handles ArithmeticException when the denominator is zero.
 */
public class DivisionExample {
    // Method to perform division
    public static int performDivision(int numerator, int denominator) {
        // Check whether denominator is zero
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return numerator / denominator;
    }
    // Method to catch and rethrow the exception with additional context
    public static int calculate(int numerator, int denominator) {
        try {
            return performDivision(numerator, denominator);
        } catch (ArithmeticException e) {
            // Rethrow exception with additional information
            throw new ArithmeticException("Division failed: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        try {
            // Perform division
            int result = calculate(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the rethrown exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}