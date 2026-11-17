/*
 * This program checks whether an entered email address matches a regular expression.
 * It uses the String matches() method to validate the email format.
 */
package RegularExpressions;
import java.util.Scanner;
public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email");
        String email = sc.next();
        // Check whether the email matches the specified pattern.
        System.out.println(email.matches(("^[?=.*A-Za-z0-9._+\\-]+@[?=.*A-Za-z0-9._+\\-]+\\.[A-Za-z]{2,}$")));
    }
}