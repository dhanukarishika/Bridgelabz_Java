/*
 * Question 8: Find the youngest and tallest among Amar, Akbar, and Anthony.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get ages of the three friends
        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        // Get heights of the three friends in centimeters
        System.out.print("Enter Amar's height (cm): ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar's height (cm): ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony's height (cm): ");
        double anthonyHeight = sc.nextDouble();
        // Find the youngest person
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Youngest: Amar");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Youngest: Akbar");
        } else {
            System.out.println("Youngest: Anthony");
        }
        // Find the tallest person
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Tallest: Amar");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Tallest: Akbar");
        } else {
            System.out.println("Tallest: Anthony");
        }
        sc.close();
    }
}
