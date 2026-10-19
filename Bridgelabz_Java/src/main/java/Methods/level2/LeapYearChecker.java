/*
 * Program 3: Check whether a given year is a leap year.
 * The program works only for years greater than or equal
 * to 1582, corresponding to the Gregorian calendar.
 */
package Methods.level2;
import java.util.Scanner;
public class LeapYearChecker {
    // Method to check whether the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take user input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // Validate the year
        if (year < 1582) {
            System.out.println("Invalid year. Enter a year >= 1582.");
        } else {
            // Check and display the result
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
        // Close the Scanner object
        sc.close();
    }
}