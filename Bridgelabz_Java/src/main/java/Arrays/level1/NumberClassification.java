/*
 * Question 2: Classify five numbers as positive, negative, or zero.
 * For positive numbers, check whether they are even or odd.
 * Finally, compare the first and last array elements.
 */
package Arrays.level1;
import java.util.Scanner;
// Class to classify numbers and compare array elements
public class NumberClassification {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Declare an array to store five numbers
        int[] numbers = new int[5];
        // Get five numbers from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        // Classify each number
        for (int i = 0; i < numbers.length; i++) {
            // Check whether the number is positive, negative, or zero
            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is positive.");
                // Check whether the positive number is even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is even.");
                } else {
                    System.out.println(numbers[i] + " is odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
        // Compare the first and last elements of the array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last.");
        } else {
            System.out.println("The first element is less than the last.");
        }
        // Close the Scanner
        sc.close();
    }
}