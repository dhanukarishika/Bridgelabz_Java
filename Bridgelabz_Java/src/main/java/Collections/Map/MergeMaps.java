package Collections.Map;
import java.util.*;
/*
 * Q4. Merge Two Maps
 * Merge two maps by adding values of common keys.
 */
public class MergeMaps {
    // Merge maps and sum values for duplicate keys
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1,
                                                 Map<String, Integer> map2) {
        Map<String, Integer> merged = new LinkedHashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            // Add values if the key already exists
            merged.put(key, merged.getOrDefault(key, 0) + entry.getValue());
        }
        return merged;
    }
    public static void main(String[] args) {
        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        Map<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Merged Map: " + mergeMaps(map1, map2));
    }
}