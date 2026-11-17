package Collections.Queue;
/*
 * Q5. Circular Buffer Simulation
 * Implement a fixed-size circular queue that overwrites
 * the oldest element when the buffer becomes full.
 */
public class CircularBuffer {
    static class Buffer {
        int[] arr;
        int front = 0;
        int size = 0;
        Buffer(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be positive");
            }
            arr = new int[capacity];
        }
        // Insert an element, overwriting the oldest if full
        public void add(int value) {
            int index = (front + size) % arr.length;
            arr[index] = value;
            if (size == arr.length) {
                front = (front + 1) % arr.length;
            } else {
                size++;
            }
        }
        // Display elements in queue order
        public void display() {
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[(front + i) % arr.length]);
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        Buffer buffer = new Buffer(3);
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        System.out.print("Initial Buffer: ");
        buffer.display();
        buffer.add(4);
        System.out.print("After Inserting 4: ");
        buffer.display();
    }
}
