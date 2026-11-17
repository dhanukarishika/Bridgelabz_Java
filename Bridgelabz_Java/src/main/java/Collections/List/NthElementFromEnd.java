package Collections.List;
import java.util.*;
/*
 * Q5. Find the Nth Element from the End
 * Find the Nth element from the end of a LinkedList
 * without calculating its size.
 */
public class NthElementFromEnd {
    // Find the Nth element using two iterators
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();
        if (n <= 0) {
            return null;
        }
        // Move the first iterator n positions ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                return null;
            }
            first.next();
        }
        // Move both iterators until the first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;
        System.out.println("LinkedList: " + list);
        System.out.println("Nth Element from End: " + findNthFromEnd(list, n));
    }
}