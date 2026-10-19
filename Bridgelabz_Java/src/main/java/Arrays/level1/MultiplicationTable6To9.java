package Arrays.level1;

import java.util.Scanner;

/*
 * Question 5: Print the multiplication results of a number
 * for multipliers from 6 to 9 using an array.
 */
public class MultiplicationTable6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the number from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Validate the input
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            sc.close();
            return;
        }
        // Define the multiplier range and result array
        int startMultiplier = 6;
        int endMultiplier = 9;
        int tableSize = endMultiplier - startMultiplier + 1;
        int[] multiplicationResult = new int[tableSize];
        // Calculate and store multiplication results
        for (int index = 0; index < multiplicationResult.length; index++) {
            int multiplier = startMultiplier + index;
            multiplicationResult[index] = number * multiplier;
        }
        // Display the multiplication table using the array
        for (int index = 0; index < multiplicationResult.length; index++) {
            int multiplier = startMultiplier + index;
            System.out.println(number + " * " + multiplier + " = "
                    + multiplicationResult[index]);
        }
        sc.close();
    }
}