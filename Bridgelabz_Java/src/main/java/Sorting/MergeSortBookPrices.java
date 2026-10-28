package Sorting;
import java.util.Arrays;
/*
 * Q3. Merge Sort - Sort Book Prices
 * Sort book prices in ascending order using Merge Sort.
 */
public class MergeSortBookPrices {
    // Divide array into two halves recursively
    static void mergeSort(double[] prices, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(prices, left, mid);
        mergeSort(prices, mid + 1, right);
        merge(prices, left, mid, right);
    }
    // Merge two sorted halves
    static void merge(double[] prices, int left, int mid, int right) {
        double[] temp = new double[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        // Compare and merge elements
        while (i <= mid && j <= right) {
            if (prices[i] <= prices[j]) {
                temp[k++] = prices[i++];
            } else {
                temp[k++] = prices[j++];
            }
        }
        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = prices[i++];
        }
        while (j <= right) {
            temp[k++] = prices[j++];
        }
        // Copy sorted elements back to original array
        for (i = 0; i < temp.length; i++) {
            prices[left + i] = temp[i];
        }
    }
    public static void main(String[] args) {
        double[] prices = {499.50, 299.00, 699.00, 199.50, 399.00};
        System.out.println("Original Book Prices: " + Arrays.toString(prices));
        mergeSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Book Prices: " + Arrays.toString(prices));
    }
}
