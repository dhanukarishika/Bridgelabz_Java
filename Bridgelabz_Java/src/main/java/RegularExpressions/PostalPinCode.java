/*
 * This program validates a PIN code entered by the user.
 * It uses a regular expression to check whether the PIN contains 4 to 6 digits.
 */
package RegularExpressions;
import java.util.Scanner;
public class PostalPinCode {
    public static void main(String[] args) {
        // Accept the PIN code as a string from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pin");
        String pin = sc.next();
        // Check whether the PIN contains only digits and has a length of 4 to 6.
        if (pin.matches("^\\d{4,6}$")) {
            System.out.println("A valid PIN");
        } else {
            System.out.println("Not a Valid PIN");
        }
    }
}