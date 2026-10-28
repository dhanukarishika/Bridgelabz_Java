package Sorting;
import java.util.Arrays;
/*
 * Q6. Heap Sort - Sort Job Applicants by Salary
 * Sort expected salaries in ascending order using Heap Sort.
 */
public class HeapSortJobApplicants {
    // Sort salaries using Heap Sort
    static void heapSort(int[] salaries) {
        int n = salaries.length;
        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        // Extract maximum and place at end
        for (int i = n - 1; i > 0; i--) {
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            heapify(salaries, i, 0);
        }
    }
    // Maintain Max Heap property
    static void heapify(int[] arr, int n, int root) {
        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        // Swap and heapify if root is not largest
        if (largest != root) {
            int temp = arr[root];
            arr[root] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    public static void main(String[] args) {
        int[] salaries = {45000, 60000, 35000, 75000, 50000};
        System.out.println("Original Salaries: " + Arrays.toString(salaries));
        heapSort(salaries);
        System.out.println("Sorted Salaries: " + Arrays.toString(salaries));
    }
}
