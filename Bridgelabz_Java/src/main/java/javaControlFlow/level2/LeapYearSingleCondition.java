/*
 * Question 2: Check whether a year is a leap year
 * using a single if condition and logical operators.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class LeapYearSingleCondition {
    public static void main(String[] args) {
        // Create Scanner and read the year
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // Check year validity and leap year conditions
        if (year >= 1582) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Enter a year from 1582 onwards.");
        }
        // Close Scanner
        sc.close();
    }
}