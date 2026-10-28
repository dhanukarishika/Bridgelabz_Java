
package HashMaps;

import java.util.HashMap;

/*
 * Q2. Check for a Pair with Given Sum
 * Check whether two elements add up to the target sum using a HashMap.
 */

public class PairWithGivenSum {

    // Check if a pair with target sum exists
    static boolean findPair(int[] arr, int target) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;

            // Check if the required number already exists
            if (map.containsKey(complement)) {
                return true;
            }

            map.put(num, true);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        System.out.println("Target Sum: " + target);
        System.out.println("Pair Exists: " + findPair(arr, target));
    }
}
