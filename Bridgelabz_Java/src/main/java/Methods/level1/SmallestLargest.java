/*
 * Program 7: Find the smallest and largest of three numbers
 * using a single method.
 */
package Methods.level1;
import java.util.Scanner;
public class SmallestLargest {
    // Find and return the smallest and largest numbers.
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;
        // Compare the second number.
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number2 > largest) {
            largest = number2;
        }
        // Compare the third number.
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number3 > largest) {
            largest = number3;
        }
        return new int[]{smallest, largest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get three numbers from the user.
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        // Call the method to find the smallest and largest.
        int[] results = findSmallestAndLargest(number1, number2, number3);
        // Display the results.
        System.out.println("Smallest number: " + results[0]);
        System.out.println("Largest number: " + results[1]);
        sc.close();
    }
}
