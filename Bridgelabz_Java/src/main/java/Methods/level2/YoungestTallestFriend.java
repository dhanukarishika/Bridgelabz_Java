/*
 * Program 8: Find the youngest and tallest among
 * Amar, Akbar, and Anthony using their ages and heights.
 */
package Methods.level2;
import java.util.Scanner;
public class YoungestTallestFriend {
    // Find the name of the youngest friend.
    public static String findYoungestFriend(String[] names, int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    // Find the name of the tallest friend.
    public static String findTallestFriend(String[] names, double[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        // Input each friend's age and height.
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }
        // Display the youngest and tallest friends.
        String youngest = findYoungestFriend(names, ages);
        String tallest = findTallestFriend(names, heights);
        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
        sc.close();
    }
}
