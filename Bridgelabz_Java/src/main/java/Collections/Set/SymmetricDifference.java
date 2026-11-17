package Collections.Set;
import java.util.*;
/*
 * Q3. Symmetric Difference
 * Find elements present in either set but not in both.
 */
public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        Set<Integer> result = new HashSet<>(set1);
        // Remove common elements and add uncommon elements
        for (int num : set2) {
            if (result.contains(num)) {
                result.remove(num);
            } else {
                result.add(num);
            }
        }
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Symmetric Difference: " + result);
    }
}