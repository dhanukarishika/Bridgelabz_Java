package HashMaps;
import java.util.HashMap;
import java.util.Arrays;
/*
 * Q5. Two Sum Problem
 * Find two indices whose elements add up to the target sum
 * using a HashMap.
 */
public class TwoSum {
    // Find indices of two numbers with target sum
    static int[] findTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            // Check if complement already exists
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Store number and its index
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Target Sum: " + target);
        System.out.println("Indices: "
                + Arrays.toString(findTwoSum(arr, target)));
    }
}
