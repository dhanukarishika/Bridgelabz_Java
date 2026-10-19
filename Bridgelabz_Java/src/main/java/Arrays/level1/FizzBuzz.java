/*
 * Question 10: Store FizzBuzz results from 0 to a given
 * positive number in a String array and display them.
 */
package Arrays.level1;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the upper limit
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Invalid input. Please enter a number greater than 0.");
            sc.close();
            return;
        }
        // Create an array to store results from 0 to number
        String[] fizzBuzzResults = new String[number + 1];
        // Generate and store FizzBuzz results
        for (int i = 0; i < fizzBuzzResults.length; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResults[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzzResults[i] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzzResults[i] = "Buzz";
            } else {
                fizzBuzzResults[i] = String.valueOf(i);
            }
        }
        // Display the stored results with positions
        for (int i = 0; i < fizzBuzzResults.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzzResults[i]);
        }
        sc.close();
    }
}