
/*
 * Program 9: Display a calendar for a given month
 * and year using the Gregorian calendar algorithm.
 */
package Strings.level3;

import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the month name
    public static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };

        return monthNames[month - 1];
    }

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Method to find the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }

        return days[month - 1];
    }

    // Method to find the first day of the month
    // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    public static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;

        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        int m0 = month + 12 * ((14 - month) / 12) - 2;

        int d0 = (1 + x + 31 * m0 / 12) % 7;

        return d0;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numberOfDays = getDaysInMonth(month, year);
        int firstDay = getFirstDay(month, year);

        System.out.println("\n      " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print all days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%4d", day);

            // Move to the next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

            // Validate month and year
            if (month < 1 || month > 12 || year < 1) {
                System.out.println(
                        "Invalid input! Enter a valid month and positive year."
                );
                return;
            }

            // Display the calendar
            displayCalendar(month, year);

        } catch (java.util.InputMismatchException e) {
            System.out.println(
                    "Invalid input! Please enter integer values."
            );
        } finally {
            sc.close();
        }
    }
}
