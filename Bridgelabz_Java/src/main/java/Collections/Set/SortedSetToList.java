package Collections.Set;
import java.util.*;
/*
 * Q4. Convert a Set to a Sorted List
 * Convert a HashSet of integers into a sorted list in ascending order.
 */
public class SortedSetToList {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        // Convert HashSet to ArrayList
        List<Integer> list = new ArrayList<>(set);
        // Sort elements in ascending order
        Collections.sort(list);
        System.out.println("Original Set: " + set);
        System.out.println("Sorted List: " + list);
    }
}