/*
 * Question 3: Create a multiplication table of a number
 * using an array to store the results.
 */
package Arrays.level1;
import java.util.Scanner;
// Class to generate a multiplication table using an array
public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get a number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Declare an array to store multiplication results
        int[] multiplicationTable = new int[10];
        // Calculate and store the multiplication results from 1 to 10
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = number * (i + 1);
        }
        // Display the multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = "
                    + multiplicationTable[i]);
        }
        // Close the Scanner
        sc.close();
    }
}