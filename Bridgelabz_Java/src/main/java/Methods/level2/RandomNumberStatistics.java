
/*
 * Program 12: Generate five random four-digit numbers
 * and calculate their average, minimum, and maximum.
 */
package Methods.level2;
public class RandomNumberStatistics {
    // Generate an array of random four-digit numbers.
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    // Find the average, minimum, and maximum.
    // Return them in a double array.
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            minimum = Math.min(minimum, numbers[i]);
            maximum = Math.max(maximum, numbers[i]);
        }
        double average = sum / numbers.length;
        return new double[]{average, minimum, maximum};
    }

    public static void main(String[] args) {
        // Generate five random four-digit numbers.
        int[] numbers = generate4DigitRandomArray(5);
        System.out.println("Generated four-digit numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Calculate statistics.
        double[] statistics = findAverageMinMax(numbers);
        System.out.println("Average: " + statistics[0]);
        System.out.println("Minimum: " + statistics[1]);
        System.out.println("Maximum: " + statistics[2]);
    }
}
