/*
 * Question 5: Write a program to find the day of the week
 * for a given date using command-line arguments.
 */
package javaControlFlow.level3;
// Class to calculate the day of the week
public class DayOfWeek {
    public static void main(String[] args) {
        // Check whether three command-line arguments are provided
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
        // Read month, day, and year from command-line arguments
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        // Validate the input values
        if (m < 1 || m > 12 || d < 1 || d > 31 || y < 1) {
            System.out.println("Invalid date.");
            return;
        }
        // Calculate the adjusted year
        int y0 = y - (14 - m) / 12;
        // Calculate the year adjustment value
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        // Calculate the adjusted month
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        // Calculate the day of the week
        int d0 = (d + x + (31 * m0) / 12) % 7;
        // Display the result
        System.out.println("Day of the week: " + d0);
        // Display the corresponding day name
        switch (d0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}