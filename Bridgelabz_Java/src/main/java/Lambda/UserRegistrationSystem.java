/*
 * This program demonstrates a user registration system using a lambda expression.
 * It collects user details and validates the name, mobile number, and password.
 */
package Lambda;
import java.util.Scanner;
// Functional interface containing a single abstract method for registration.
@FunctionalInterface
interface Registration {
    public void userRegistrationForm();
}
public class UserRegistrationSystem {
    public static void main(String[] args) {
        // Lambda expression provides the implementation of the registration method.
        Registration registration = () -> {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the fist name");
            String first_name = sc.nextLine();
            // Check whether the first name starts with a capital letter and has at least 3 characters.
            if (first_name.charAt(0) >= 'A' && first_name.charAt(0) <= 'Z' && first_name.length() >= 3) {
                first_name = first_name;
            } else {
                System.out.println("Enter first name capital or Enter first name as length of 3 characters");
                first_name = sc.nextLine();
            }
            System.out.println("Enter the Last name");
            String last_name = sc.nextLine();
            if (last_name.charAt(0) >= 'A' && last_name.charAt(0) <= 'Z' && last_name.length() >= 3) {
                last_name = last_name;
            } else {
                System.out.println("Enter first name capital or Enter first name as length of 3 characters");
                last_name = sc.nextLine();
            }
            System.out.println("Enter the mobile number with country code at beginning (Ex: 91 XXXX");
            String mobile_number = sc.nextLine();
            if (mobile_number.charAt(0) == '9' && mobile_number.charAt(1) == '1' && mobile_number.length() == 13) {
                mobile_number = mobile_number;
            } else {
                System.out.println("Enter the mobile number in specified format or enter the valid 10 digit number");
                mobile_number = sc.nextLine();
            }
            System.out.println("Enter the password");
            String password = sc.next();
            boolean isTrue = false;
            // Keep asking for a password until all required conditions are satisfied.
            while (!isTrue) {
                System.out.println("Enter the Password");
                password = sc.next();
                if (password.length() < 8) {
                    System.out.println("Enter the password of minimum length 8");
                    continue;
                }
                boolean special_character = false;
                for (char ch : password.toCharArray()) {
                    if (!Character.isLetterOrDigit(ch)) {
                        special_character = true;
                        break;
                    }
                }
                if (!special_character) {
                    System.out.println("enter the password with at least one special character");
                    continue;
                }
                // Check that the password contains at least one digit.
                boolean has_digit = password.chars().anyMatch(Character::isDigit);
                if (!has_digit) {
                    System.out.println("Enter the password with at least one number character");
                    continue;
                }
                isTrue = true;
            }
            // Display the collected registration details.
            System.out.println("First Name: " + first_name);
            System.out.println("Last Name: " + last_name);
            System.out.println("Mobile Number: " + mobile_number);
            System.out.println("Password: " + password);
        };
        registration.userRegistrationForm();
    }
}