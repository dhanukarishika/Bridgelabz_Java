package Collections.Queue;
import java.util.*;
/*
 * Q2. Generate Binary Numbers Using a Queue
 * Generate the first N binary numbers as strings using a queue.
 */
public class GenerateBinaryNumbers {
    // Generate binary numbers using FIFO order
    public static List<String> generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();
        queue.add("1");
        for (int i = 0; i < n; i++) {
            String current = queue.remove();
            result.add(current);
            // Generate the next two binary numbers
            queue.add(current + "0");
            queue.add(current + "1");
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("First " + n + " Binary Numbers: " + generateBinary(n));
    }
}