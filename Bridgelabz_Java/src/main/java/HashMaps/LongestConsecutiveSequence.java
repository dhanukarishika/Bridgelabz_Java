package HashMaps;
import java.util.HashMap;
/*
 * Q3. Longest Consecutive Sequence
 * Find the length of the longest consecutive sequence
 * in an unsorted array using a HashMap.
 */
public class LongestConsecutiveSequence {
    // Find longest consecutive sequence
    static int findLongest(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        // Store array elements in HashMap
        for (int num : arr) {
            map.put(num, true);
        }
        int longest = 0;
        for (int num : map.keySet()) {
            // Start counting only from the beginning of a sequence
            if (num == Integer.MIN_VALUE || !map.containsKey(num - 1)) {
                int current = num;
                int count = 0;
                while (map.containsKey(current)) {
                    count++;
                    if (current == Integer.MAX_VALUE) break;
                    current++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: "
                + findLongest(arr));
    }
}
