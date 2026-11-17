package Collections.List;
import java.util.*;
/*
 * Q4. Remove Duplicates While Preserving Order
 * Remove duplicate elements from a list without changing their order.
 */
public class RemoveDuplicates {
    // Remove duplicates while maintaining insertion order
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> unique = new LinkedHashSet<>(list);
        return new ArrayList<>(unique);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + list);
        System.out.println("List without duplicates: " + removeDuplicates(list));
    }
}