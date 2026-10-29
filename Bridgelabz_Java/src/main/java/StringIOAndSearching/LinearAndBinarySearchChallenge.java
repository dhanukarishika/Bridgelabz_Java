package StringIOAndSearching;
import java.util.Arrays;
/*
 * Q16. Challenge Problem - Linear and Binary Search
 * Find the first missing positive integer using Linear Search
 * and search for a target in a sorted array using Binary Search.
 */
public class LinearAndBinarySearchChallenge {
    // Find first missing positive integer
    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];
        // Mark positive numbers present in the array
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }
        // Find the first missing positive number
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return n + 1;
    }
    // Search target using Binary Search
    static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 7, 2};
        int target = 4;
        System.out.println("Original Array: " + Arrays.toString(arr));
        // Linear Search for first missing positive number
        System.out.println("First Missing Positive: "
                + firstMissingPositive(arr));
        // Sort array before Binary Search
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("Target Index: " + binarySearch(arr, target));
    }
}
