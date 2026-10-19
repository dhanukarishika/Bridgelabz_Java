/*
 * Program 6: Calculate the sum of the first n natural numbers
 * using a loop and a method.
 */
package Methods.level1;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    // Calculate the sum of natural numbers using a loop.
    public static long calculateSum(int number) {
        long sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number from the user.
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Validate the input.
        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive integer.");
            sc.close();
            return;
        }
        // Calculate and display the sum.
        long sum = calculateSum(number);
        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
        sc.close();
    }
}
