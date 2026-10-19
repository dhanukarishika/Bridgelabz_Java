/*
 * Question 2: Find the youngest and tallest among Amar,
 * Akbar, and Anthony using arrays of ages and heights.
 */
package Arrays.level2;
import java.util.Scanner;
public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Store the friends' names
        String[] names = {"Amar", "Akbar", "Anthony"};
        // Create arrays to store ages and heights
        int[] ages = new int[names.length];
        double[] heights = new double[names.length];
        // Read and validate each friend's age and height
        for (int i = 0; i < names.length; i++) {
            System.out.println("\nEnter details for " + names[i] + ":");
            System.out.print("Age in years: ");
            int age = sc.nextInt();
            System.out.print("Height in cm: ");
            double height = sc.nextDouble();
            // Retry the same friend if either value is invalid
            if (age <= 0 || height <= 0) {
                System.out.println("Invalid input. Age and height must be positive.");
                i--;
                continue;
            }
            ages[i] = age;
            heights[i] = height;
        }
        // Assume the first friend is both the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;
        // Compare ages and heights to find the youngest and tallest
        for (int i = 1; i < names.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Youngest friend: " + names[youngestIndex] + ", Age: " + ages[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex] + ", Height: " + heights[tallestIndex] + " cm");
        sc.close();
    }
}
