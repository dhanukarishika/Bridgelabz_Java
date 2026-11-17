package Collections.Queue;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Q4. Implement a Stack Using Queues
 * Implement push, pop, and top operations using two queues.
 */
public class StackUsingQueues {
    static class MyStack {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        // Insert an element at the top of the stack
        public void push(int value) {
            queue2.add(value);
            // Move existing elements behind the new element
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }
            // Swap the two queues
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }
        // Remove the top element
        public int pop() {
            return queue1.remove();
        }
        // Return the top element without removing it
        public int top() {
            return queue1.element();
        }
    }
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top Element: " + stack.top());
        System.out.println("Popped Element: " + stack.pop());
        System.out.println("Top After Pop: " + stack.top());
    }
}