
/*
 * Program 1: Generate the heights of 11 football players
 * and find their mean, shortest, and tallest heights.
 */
package Methods.level3;
public class FootballTeamHeights {

    // Generate a random height between 150 cm and 250 cm.
    public static int generateRandomHeight() {
        return (int) (Math.random() * 101) + 150;
    }

    // Find the sum of all player heights.
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    // Calculate the mean height.
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Find the shortest player height.
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        return shortest;
    }

    // Find the tallest player height.
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Store the heights of 11 football players.
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = generateRandomHeight();
        }
        // Display the generated heights.
        System.out.println("Football Team Player Heights:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        // Calculate and display the results.
        System.out.println("\nTotal height: " + calculateSum(heights) + " cm");
        System.out.printf("Mean height: %.2f cm%n", calculateMean(heights));
        System.out.println("Shortest height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest height: " + findTallestHeight(heights) + " cm");
    }
}
