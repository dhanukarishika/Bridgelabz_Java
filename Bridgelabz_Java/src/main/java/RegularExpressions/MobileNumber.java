/*
 * This program accepts a mobile number from the user and displays it.
 * It uses the Scanner class to read the number from the keyboard.
 */
package RegularExpressions;
import java.util.Scanner;
public class MobileNumber {
    public static void main(String[] args) {
        // Create a Scanner object to accept user input.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        long number = sc.nextLong();
        // Display the entered mobile number.
        System.out.println("Number: " + number);
    }
}