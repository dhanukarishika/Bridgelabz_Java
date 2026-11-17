package Collections.Queue;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Q1. Reverse a Queue
 * Reverse queue elements using only queue operations.
 */
public class ReverseQueue {
    // Reverse the queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        int element = queue.remove();
        // Recursively reverse the remaining elements
        reverseQueue(queue);
        // Add the removed element at the end
        queue.add(element);
    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}