/*
 * This program demonstrates exception handling using try, catch, and finally blocks.
 * It shows that the finally block executes whether an exception occurs or is handled.
 */
package ExceptionHandling.Module1;
public class Finally {
    public static void main(String[] args) {
        int a = 10;
        // Attempts division by zero, which causes an ArithmeticException.
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            // Handles the exception and displays its error message.
            System.out.println("Exception: " + e.getMessage());
        } finally {
            // Executes after the try-catch blocks to indicate completion.
            System.out.println("Operation Completed");
        }
    }
}