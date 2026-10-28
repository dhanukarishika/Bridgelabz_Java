
package StacksAndQueues.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

/*
 * Q4. Sliding Window Maximum
 * Find the maximum element in every window of size k using a deque.
 */

public class SlidingWindowMaximum {

    // Find maximum in each sliding window
    static int[] findMaximum(int[] arr, int k) {
        int n = arr.length;

        if (k <= 0 || k > n) return new int[0];

        int[] result = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            // Remove indices outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove indices of smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Store maximum after first window is formed
            if (i >= k - 1) {
                result[i - k + 1] = arr[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Window Size: " + k);
        System.out.println("Maximums: " + Arrays.toString(findMaximum(arr, k)));
    }
}
