package Sorting;
import java.util.Arrays;
/*
 * Q4. Quick Sort - Sort Product Prices
 * Sort product prices in ascending order using Quick Sort.
 */
public class QuickSortProductPrices {
    // Sort array recursively using Quick Sort
    static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }
    // Partition array around pivot
    static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            // Move smaller elements to the left
            if (prices[j] <= pivot) {
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        // Place pivot at its correct position
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        return i + 1;
    }
    public static void main(String[] args) {
        double[] prices = {1200.50, 799.99, 2500.00, 499.00, 999.50};
        System.out.println("Original Product Prices: " + Arrays.toString(prices));
        quickSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Product Prices: " + Arrays.toString(prices));
    }
}