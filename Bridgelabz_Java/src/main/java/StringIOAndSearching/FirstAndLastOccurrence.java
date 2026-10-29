package StringIOAndSearching;
import java.util.Arrays;
/*
 * Q15. Binary Search - Find First and Last Occurrence
 * Find the first and last indices of a target in a sorted array.
 * Return -1 if the target is not found.
 */
public class FirstAndLastOccurrence {
    // Find first occurrence using Binary Search
    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Continue searching left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    // Find last occurrence using Binary Search
    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Continue searching right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Target: " + target);
        System.out.println("First Occurrence: " + findFirst(arr, target));
        System.out.println("Last Occurrence: " + findLast(arr, target));
    }
}