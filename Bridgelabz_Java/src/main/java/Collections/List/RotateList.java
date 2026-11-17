package Collections.List;
import java.util.*;
/*
 * Q3. Rotate Elements in a List
 * Rotate a list to the left by a given number of positions.
 */
public class RotateList {
    // Rotate the list to the left
    public static List<Integer> rotateList(List<Integer> list, int positions) {
        List<Integer> rotated = new ArrayList<>();
        if (list.isEmpty()) {
            return rotated;
        }
        int size = list.size();
        positions = positions % size;
        // Add elements starting from the rotated position
        for (int i = 0; i < size; i++) {
            rotated.add(list.get((i + positions) % size));
        }
        return rotated;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int positions = 2;
        System.out.println("Original List: " + list);
        System.out.println("Rotated List: " + rotateList(list, positions));
    }
}