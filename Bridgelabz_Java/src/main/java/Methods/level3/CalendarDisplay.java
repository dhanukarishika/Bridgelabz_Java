
/*
 * Program 8: Display a calendar for a given month and year.
 * Use arrays for month names and days, check leap years,
 * and align dates under the correct weekdays.
 */
package Methods.level3;

import java.util.Scanner;

public class CalendarDisplay {

    static String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
    };

    static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    // Check whether the given year is a leap year.
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }

    // Calculate the day of the week for the first day of a month.
    // Sunday = 0, Monday = 1, ..., Saturday = 6.
    public static int getFirstDay(int month, int year) {
        int day = 1;
        int y = year;
        int m = month;

        if (m < 3) {
            m += 12;
            y--;
        }

        int k = y % 100;
        int j = y / 100;

        int h = (day + (13 * (m + 1)) / 5
                + k + k / 4 + j / 4 + 5 * j) % 7;

        // Zeller's formula: 0 = Saturday, 1 = Sunday, etc.
        return (h + 6) % 7;
    }

    // Display the calendar for the specified month and year.
    public static void displayCalendar(int month, int year) {
        int totalDays = daysInMonth[month - 1];

        if (month == 2 && isLeapYear(year)) {
            totalDays = 29;
        }

        System.out.println("\n      " + monthNames[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);

        // Indent the first date under its correct weekday.
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int date = 1; date <= totalDays; date++) {
            System.out.printf("%3d", date);

            if ((date + firstDay) % 7 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid month or year.");
        } else {
            displayCalendar(month, year);
        }

        sc.close();
    }
}
