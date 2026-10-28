
package StacksAndQueues.Queue;

import java.util.Stack;

/*
 * Q1. Implement a Queue Using Stacks
 * Implement enqueue and dequeue operations using two stacks.
 */

public class QueueUsingStacks {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    // Add element to queue
    static void enqueue(int value) {
        stack1.push(value);
        System.out.println("Enqueued: " + value);
    }

    // Remove element from queue
    static Integer dequeue() {

        // Transfer elements if second stack is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);

        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());

        enqueue(40);

        System.out.println("Dequeued: " + dequeue());
        System.out.println("Dequeued: " + dequeue());

        dequeue();
    }
}
