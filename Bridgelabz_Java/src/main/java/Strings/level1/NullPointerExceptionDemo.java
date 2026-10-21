
/*
 * Program 4: Demonstrate NullPointerException by
 * accessing a null string and handle it using try-catch.
 */
package Strings.level1;
public class NullPointerExceptionDemo {
    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println("String length: " + text.length());
    }
    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            System.out.println("String length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Demonstrate exception generation
        System.out.println("Generating NullPointerException:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated: " + e);
        }
        // Demonstrate exception handling
        System.out.println("\nHandling NullPointerException:");
        handleException();
    }
}
