/*
 * This program demonstrates nested try-catch blocks for handling different exceptions.
 * It handles arithmetic errors in the inner block and array index errors in the outer block.
 */
package ExceptionHandling.Module1;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // Reads five integer elements from the user.
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Reads the divisor entered by the user.
        System.out.println("Enter the divisor");
        int divisor = sc.nextInt();
        // The outer try block handles invalid array index access.
        try {
            int element = arr[3];
            // The inner try block handles arithmetic errors.
            try {
                System.out.println(element / 0);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}