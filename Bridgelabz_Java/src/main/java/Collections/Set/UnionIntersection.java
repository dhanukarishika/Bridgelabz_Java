package Collections.Set;
import java.util.*;
/*
 * Q2. Union and Intersection of Two Sets
 * Find the union and intersection of two sets.
 */
public class UnionIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
        // Union: Combine all unique elements
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        // Intersection: Keep only common elements
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}