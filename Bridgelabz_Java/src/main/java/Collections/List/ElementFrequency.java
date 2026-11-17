package Collections.List;
import java.util.*;
/*
 * Q2. Find Frequency of Elements
 * Count the frequency of each string in a list using a Map.
 */
public class ElementFrequency {
    // Count occurrences of each element
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequency = new LinkedHashMap<>();
        for (String word : list) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        return frequency;
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println("Original List: " + list);
        System.out.println("Frequencies: " + countFrequency(list));
    }
}