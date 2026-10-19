/*
 * Question 4: Store up to 10 positive numbers in an array
 * or stop when the user enters zero or a negative number.
 * Display the numbers and their sum.
 */
package Arrays.level1;
import java.util.Scanner;
// Class to store numbers and calculate their sum
public class NumberArraySum {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Declare an array to store up to 10 positive numbers
        double[] numbers = new double[10];
        // Initialize variables for the total and array index
        double total = 0.0;
        int index = 0;
        // Accept numbers until the limit is reached or a stopping value is entered
        while (true) {
            // Stop if the array is full
            if (index == numbers.length) {
                System.out.println("Maximum limit of 10 numbers reached.");
                break;
            }
            // Get a number from the user
            System.out.print("Enter a positive number (0 or negative to stop): ");
            double number = sc.nextDouble();
            // Stop if the user enters zero or a negative number
            if (number <= 0) {
                break;
            }
            // Store the positive number in the array
            numbers[index] = number;
            index++;
        }
        // Display the entered numbers and calculate their sum
        System.out.println("\nEntered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        // Display the total sum
        System.out.println("Sum of numbers: " + total);
        // Close the Scanner
        sc.close();
    }
}