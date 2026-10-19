/*
 * Program 1: Calculate simple interest using a method.
 * Simple Interest = Principal * Rate * Time / 100
 */
package Methods.level1;
import java.util.Scanner;
public class SimpleInterest {
    // Calculate simple interest using the given inputs.
    public static double calculateSimpleInterest(double principal, double rate, double time)
    {
        double simpleInterest = principal*rate*time / 100;
        return simpleInterest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get principal, rate, and time from the user.
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double time = sc.nextDouble();
        // Validate the inputs.
        if (principal < 0 || rate < 0 || time < 0) {
            System.out.println("Invalid input. Values cannot be negative.");
            sc.close();
            return;
        }

        // Calculate simple interest.
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        // Display the result.
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, " + "Rate of Interest %.2f and Time %.2f years.%n",
                simpleInterest, principal, rate, time);

        sc.close();
    }
}
