/*
 * Q3. Date Formatting
 * Write a Java program to display the current date
 * in three formats using DateTimeFormatter:
 * dd/MM/yyyy, yyyy-MM-dd, and EEE, MMM dd, yyyy.
 */
package Strings.builtinfunctions;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
public class DateFormatting {
    // Method to format a date using the given pattern
    public static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.ENGLISH);
        return date.format(formatter);
    }
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        // Format the current date in three different ways
        String format1 = formatDate(currentDate, "dd/MM/yyyy");
        String format2 = formatDate(currentDate, "yyyy-MM-dd");
        String format3 = formatDate(currentDate, "EEE, MMM dd, yyyy");
        // Display results
        System.out.println("Current Date: " + currentDate);
        System.out.println("Format 1 (dd/MM/yyyy): " + format1);
        System.out.println("Format 2 (yyyy-MM-dd): " + format2);
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + format3);
    }
}
