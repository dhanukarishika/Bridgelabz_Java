package Sorting;
import java.util.Arrays;
/*
 * Q2. Insertion Sort - Sort Employee IDs
 * Sort employee IDs in ascending order using Insertion Sort.
 */
public class InsertionSortEmployeeIDs {
    // Sort employee IDs using Insertion Sort
    static void insertionSort(int[] ids) {
        int n = ids.length;
        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;
            // Shift larger elements to the right
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            // Insert element at correct position
            ids[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] ids = {105, 102, 108, 101, 104};
        System.out.println("Original Employee IDs: " + Arrays.toString(ids));
        insertionSort(ids);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(ids));
    }
}
