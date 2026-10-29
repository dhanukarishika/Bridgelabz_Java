package StringIOAndSearching;
import java.util.Arrays;
/*
 * Q13. Binary Search - Find the Peak Element
 * Find an element greater than its neighbors using Binary Search.
 */
public class FindPeakElement {
    // Find peak element using Binary Search
    static int findPeak(int[] arr) {
        if (arr.length == 0) return -1;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // Search right half if elements are increasing
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                // Search left half for a peak
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        System.out.println("Array: " + Arrays.toString(arr));
        int index = findPeak(arr);
        System.out.println("Peak Element Index: " + index);
        System.out.println("Peak Element: " + arr[index]);
    }
}
