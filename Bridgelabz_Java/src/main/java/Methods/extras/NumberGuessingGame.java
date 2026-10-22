/*
 * Q1. Number Guessing Game
 * Write a Java program where the computer guesses
 * a number between 1 and 100 using user feedback.
 */
package Methods.extras;
import java.util.Scanner;
public class NumberGuessingGame {
    // Method to generate a random guess
    public static int generateGuess(int low, int high) {
        return low + (int) (Math.random() * (high - low + 1));
    }
    // Method to receive feedback from the user
    public static String getFeedback(Scanner sc) {
        System.out.print("Is the guess High, Low, or Correct? ");
        return sc.nextLine().trim().toLowerCase();
    }
    // Method to update the guessing range
    public static int[] updateRange(int low, int high, int guess, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        int attempts = 0;
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess your number!");
        while (low <= high) {
            // Generate a random guess
            int guess = generateGuess(low, high);
            attempts++;
            System.out.println("\nComputer's Guess: " + guess);
            // Receive feedback
            String feedback = getFeedback(sc);
            if (feedback.equals("correct")) {
                System.out.println("I guessed your number!");
                System.out.println("Total Attempts: " + attempts);
                break;
            }
            if (!feedback.equals("high") && !feedback.equals("low")) {
                System.out.println("Invalid feedback! Try again.");
                attempts--;
                continue;
            }
            // Update range based on feedback
            int[] range = updateRange(low, high, guess, feedback);
            low = range[0];
            high = range[1];
            if (low > high) {
                System.out.println("Your feedback is inconsistent!");
            }
        }
        sc.close();
    }
}
