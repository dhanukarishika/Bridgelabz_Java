
package StacksAndQueues.Stack;

import java.util.Stack;

/*
 * Q2. Sort a Stack Using Recursion
 * Sort stack elements in ascending order using recursion.
 */

public class SortStackUsingRecursion {

    // Sort stack recursively
    static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();

        sortStack(stack);
        insertSorted(stack, top);
    }

    // Insert element at its correct position
    static void insertSorted(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertSorted(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
