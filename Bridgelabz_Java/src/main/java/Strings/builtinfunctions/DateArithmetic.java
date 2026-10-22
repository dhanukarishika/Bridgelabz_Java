/*
 * Q2. Date Arithmetic
 * Write a Java program to take a date as input,
 * add 7 days, 1 month, and 2 years, and then
 * subtract 3 weeks from the resulting date.
 */
package Strings.builtinfunctions;
import java.time.LocalDate;
import java.util.Scanner;
public class DateArithmetic {
    // Method to perform date arithmetic
    public static LocalDate calculateDate(LocalDate date) {
        // Add 7 days
        date = date.plusDays(7);
        // Add 1 month
        date = date.plusMonths(1);
        // Add 2 years
        date = date.plusYears(2);
        // Subtract 3 weeks
        date = date.minusWeeks(3);
        return date;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        try {
            // Convert string input into LocalDate
            LocalDate date = LocalDate.parse(input);
            // Call the method to perform date arithmetic
            LocalDate result = calculateDate(date);
            // Display results
            System.out.println("Original Date: " + date);
            System.out.println("Final Date: " + result);
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("Invalid date! Use yyyy-MM-dd format.");
        }
        sc.close();
    }
}
