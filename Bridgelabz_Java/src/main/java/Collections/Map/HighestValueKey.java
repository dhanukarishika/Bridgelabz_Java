package Collections.Map;
import java.util.*;
/*
 * Q3. Find the Key with the Highest Value
 * Find the key associated with the maximum integer value in a Map.
 */
public class HighestValueKey {
    // Find the key having the maximum value
    public static String findMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        System.out.println("Key with Highest Value: " + findMaxKey(map));
    }
}