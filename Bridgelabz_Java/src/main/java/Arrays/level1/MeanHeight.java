package Arrays.level1;
import java.util.Scanner;
/*
 * Question 6: Calculate the mean height of 11 football players
 * using an array.
 */
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define an array to store the heights of 11 players
        double[] heights = new double[11];
        double totalHeight = 0.0;
        // Read and validate each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " in cm: ");
            heights[i] = sc.nextDouble();
            if (heights[i] <= 0) {
                System.out.println("Invalid height. Please enter a positive value.");
                sc.close();
                return;
            }
            // Add the height to the total
            totalHeight += heights[i];
        }
        // Calculate the mean height
        double meanHeight = totalHeight / heights.length;
        // Display the result
        System.out.printf("Mean height of the football team: %.2f cm%n", meanHeight);
        sc.close();
    }
}