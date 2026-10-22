/*
 * Q7. GCD and LCM Calculator
 * Write a Java program to calculate the GCD and
 * LCM of two numbers using separate methods.
 */
package Methods.extras;
import java.util.Scanner;
public class GCDLCMCalculator {
    // Method to calculate GCD
    public static long calculateGCD(long num1, long num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        while (num2 != 0) {
            long remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        return num1;
    }
    // Method to calculate LCM
    public static long calculateLCM(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        long gcd = calculateGCD(num1, num2);
        return Math.abs((num1 / gcd) * (long) num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        // Calculate GCD and LCM
        long gcd = calculateGCD(num1, num2);
        long lcm = calculateLCM(num1, num2);
        // Display results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        sc.close();
    }
}
