package Collections.Set;
import java.util.*;
/*
 * Q1. Check if Two Sets Are Equal
 * Compare two sets to check whether they contain the same elements.
 */
public class SetEquality {
    // Check equality regardless of element order
    public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
        return set1.equals(set2);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println("Are both sets equal? " + areSetsEqual(set1, set2));
    }
}