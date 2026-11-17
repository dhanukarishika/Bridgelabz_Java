package Collections.Map;
import java.util.*;
/*
 * Q2. Invert a Map
 * Invert a map by grouping keys with the same value into a list.
 */
public class InvertMap {
    // Invert the map while handling duplicate values
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> inverted = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            // Create a list if the value is not already present
            inverted.putIfAbsent(value, new ArrayList<>());
            // Add the original key to the corresponding list
            inverted.get(value).add(entry.getKey());
        }
        return inverted;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);
        System.out.println("Original Map: " + map);
        System.out.println("Inverted Map: " + invertMap(map));
    }
}