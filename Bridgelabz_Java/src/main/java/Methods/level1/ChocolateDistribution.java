/*
 * Program 9: Distribute chocolates equally among children
 * and find the remaining chocolates using a method.
 */
package Methods.level1;
import java.util.Scanner;
public class ChocolateDistribution {
    // Calculate the quotient and remainder.
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number of chocolates and children.
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();
        // Validate the inputs.
        if (numberOfChocolates < 0 || numberOfChildren <= 0) {
            System.out.println("Invalid input. Chocolates cannot be negative, " + "and the number of children must be positive.");
            sc.close();
            return;
        }
        // Calculate chocolates per child and remaining chocolates.
        int[] results = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
        // Display the results.
        System.out.println("Each child gets: " + results[0] + " chocolates");
        System.out.println("Remaining chocolates: " + results[1]);
        sc.close();
    }
}
