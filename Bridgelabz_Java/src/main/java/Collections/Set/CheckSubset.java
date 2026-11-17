package Collections.Set;
import java.util.*;
/*
 * Q5. Find Subsets
 * Check whether one set is a subset of another set.
 */
public class CheckSubset {
    // Check if all elements of set1 are present in set2
    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Is Set 1 a subset of Set 2? " + isSubset(set1, set2));
    }
}