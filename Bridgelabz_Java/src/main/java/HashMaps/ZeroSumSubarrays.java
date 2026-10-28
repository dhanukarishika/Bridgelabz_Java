package HashMaps;
import java.util.*;
/*
 * Q1. Find All Subarrays with Zero Sum
 * Find and display all subarrays whose sum equals zero using a HashMap.
 */
public class ZeroSumSubarrays {
    // Find all zero-sum subarrays
    static void findSubarrays(int[] arr) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;
        boolean found = false;
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // Repeated prefix sum indicates a zero-sum subarray
            if (map.containsKey(sum)) {
                for (int index : map.get(sum)) {
                    System.out.println(Arrays.toString(
                            Arrays.copyOfRange(arr, index + 1, i + 1)));
                    found = true;
                }
            }
            // Store current prefix sum index
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        if (!found) {
            System.out.println("No zero-sum subarray found");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, -2, 3};
        System.out.println("Zero-Sum Subarrays:");
        findSubarrays(arr);
    }
}
