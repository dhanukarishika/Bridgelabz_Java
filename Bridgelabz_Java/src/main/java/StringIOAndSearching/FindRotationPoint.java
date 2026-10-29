package StringIOAndSearching;
import java.util.Arrays;
/*
 * Q12. Binary Search - Find the Rotation Point
 * Find the index of the smallest element in a rotated sorted array.
 */
public class FindRotationPoint {
    // Find rotation point using Binary Search
    static int findRotationPoint(int[] arr) {
        if (arr.length == 0) return -1;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // Smallest element lies in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                // Smallest element lies in the left half
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println("Array: " + Arrays.toString(arr));
        int index = findRotationPoint(arr);
        System.out.println("Rotation Point Index: " + index);
        System.out.println("Smallest Element: " + arr[index]);
    }
}
