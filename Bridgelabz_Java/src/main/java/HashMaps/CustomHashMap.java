package HashMaps;
/*
 * Q4. Implement a Custom Hash Map
 * Implement insertion, deletion, and retrieval using
 * an array of linked lists for collision handling.
 */
public class CustomHashMap {
    // Node to store key-value pairs
    static class Node {
        int key;
        String value;
        Node next;
        Node(int key, String value, Node next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    static final int SIZE = 10;
    Node[] buckets = new Node[SIZE];
    // Calculate hash index
    int hash(int key) {
        return Math.floorMod(key, SIZE);
    }
    // Insert or update a key-value pair
    void put(int key, String value) {
        int index = hash(key);
        Node temp = buckets[index];
        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        // Insert at beginning of linked list
        buckets[index] = new Node(key, value, buckets[index]);
    }
    // Retrieve value using key
    String get(int key) {
        int index = hash(key);
        Node temp = buckets[index];
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }
    // Delete key-value pair
    void remove(int key) {
        int index = hash(key);
        Node temp = buckets[index], prev = null;
        while (temp != null) {
            if (temp.key == key) {
                if (prev == null)
                    buckets[index] = temp.next;
                else
                    prev.next = temp.next;
                temp.next = null;
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, "Apple");
        map.put(11, "Banana");
        map.put(2, "Orange");
        System.out.println("Key 1: " + map.get(1));
        System.out.println("Key 11: " + map.get(11));
        System.out.println("Key 2: " + map.get(2));
        map.put(1, "Mango");
        System.out.println("\nUpdated Key 1: " + map.get(1));
        map.remove(11);
        System.out.println("Key 11 After Deletion: " + map.get(11));
    }
}
