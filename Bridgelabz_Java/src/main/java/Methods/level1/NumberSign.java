/*
 * Program 4: Check whether a number is positive,
 * negative, or zero using a method.
 */
package Methods.level1;
import java.util.Scanner;
public class NumberSign {
    // Return 1 for positive, -1 for negative, and 0 for zero.
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get an integer from the user.
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        // Check the sign of the number.
        int result = checkNumber(number);
        // Display the result.
        if (result == 1) {
            System.out.println(number + " is a positive number.");
        } else if (result == -1) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
