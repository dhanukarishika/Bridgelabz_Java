/*
 * Q4. Date Comparison
 * Write a Java program to compare two dates using
 * isBefore(), isAfter(), and isEqual() methods.
 */
package Strings.builtinfunctions;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class DateComparison {
    // Method to compare two dates
    public static String compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            return "First date is before the second date.";
        } else if (date1.isAfter(date2)) {
            return "First date is after the second date.";
        } else if (date1.isEqual(date2)) {
            return "Both dates are equal.";
        }
        return "Unable to compare dates.";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first date (yyyy-MM-dd): ");
            String input1 = sc.nextLine();
            System.out.print("Enter second date (yyyy-MM-dd): ");
            String input2 = sc.nextLine();
            // Convert strings into LocalDate objects
            LocalDate date1 = LocalDate.parse(input1);
            LocalDate date2 = LocalDate.parse(input2);
            // Call the method to compare dates
            String result = compareDates(date1, date2);
            // Display the result
            System.out.println(result);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date! Use yyyy-MM-dd format.");
        }
        sc.close();
    }
}
