/*
 * This program validates a password using a regular expression.
 * It checks for uppercase, lowercase, numeric, and special characters with a minimum length of 8.
 */
package RegularExpressions;
import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args) {
        // Accept a password from the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password");
        String password = sc.next();
        // Check whether the password satisfies all the required conditions.
        System.out.println(password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,}"));
    }
}