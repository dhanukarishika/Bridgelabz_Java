package StringIOAndSearching;
import java.util.Arrays;
/*
 * Q10. Linear Search - Search for the First Negative Number
 * Find the index of the first negative number in an array.
 * Return -1 if no negative number is found.
 */
public class FirstNegativeNumber {
    // Find the first negative number using Linear Search
    static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // Return index when a negative number is found
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, -5, 40, -8};
        System.out.println("Array: " + Arrays.toString(arr));
        int index = findFirstNegative(arr);
        System.out.println("First Negative Number Index: " + index);
    }
}
