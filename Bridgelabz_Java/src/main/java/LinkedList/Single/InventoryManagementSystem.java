
package LinkedList.Single;

/*
 * Q4. Singly Linked List: Inventory Management System
 * Add, remove, update, search, calculate total value, and sort items.
 */

public class InventoryManagementSystem {

    // Node to store item details
    static class Item {
        String name;
        int id, quantity;
        double price;
        Item next;

        Item(String name, int id, int quantity, double price) {
            this.name = name;
            this.id = id;
            this.quantity = quantity;
            this.price = price;
        }
    }

    static Item head = null, tail = null;
    static int size = 0;

    // Add item at beginning
    static void addBeginning(String name, int id, int quantity, double price) {
        Item newNode = new Item(name, id, quantity, price);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = newNode;
        size++;
    }

    // Add item at end
    static void addEnd(String name, int id, int quantity, double price) {
        Item newNode = new Item(name, id, quantity, price);

        if (head == null) head = tail = newNode;
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Add item at specific position (1-based)
    static void addPosition(int pos, String name, int id, int quantity, double price) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addBeginning(name, id, quantity, price);
            return;
        }

        if (pos == size + 1) {
            addEnd(name, id, quantity, price);
            return;
        }

        Item temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;

        Item newNode = new Item(name, id, quantity, price);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    // Remove item by ID
    static void removeItem(int id) {
        if (head == null) return;

        if (head.id == id) {
            Item deleted = head;
            head = head.next;
            if (head == null) tail = null;
            deleted.next = null;
            size--;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.id != id)
            temp = temp.next;

        if (temp.next != null) {
            Item deleted = temp.next;
            temp.next = deleted.next;
            if (deleted == tail) tail = temp;
            deleted.next = null;
            size--;
        }
    }

    // Search item by ID
    static Item searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    // Search item by name
    static void searchByName(String name) {
        Item temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                showItem(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) System.out.println("Item not found");
    }

    // Update item quantity
    static void updateQuantity(int id, int quantity) {
        Item item = searchById(id);

        if (item != null) item.quantity = quantity;
        else System.out.println("Item not found");
    }

    // Calculate total inventory value
    static double totalValue() {
        double total = 0;
        Item temp = head;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }
        return total;
    }

    // Swap item data while keeping links unchanged
    static void swap(Item a, Item b) {
        String name = a.name;
        a.name = b.name;
        b.name = name;

        int id = a.id;
        a.id = b.id;
        b.id = id;

        int quantity = a.quantity;
        a.quantity = b.quantity;
        b.quantity = quantity;

        double price = a.price;
        a.price = b.price;
        b.price = price;
    }

    // Sort by name or price in ascending/descending order
    static void sort(String field, boolean ascending) {
        if (!field.equalsIgnoreCase("name") &&
                !field.equalsIgnoreCase("price")) return;

        for (Item i = head; i != null; i = i.next) {
            for (Item j = i.next; j != null; j = j.next) {

                int compare = field.equalsIgnoreCase("name")
                        ? i.name.compareToIgnoreCase(j.name)
                        : Double.compare(i.price, j.price);

                if ((ascending && compare > 0) ||
                        (!ascending && compare < 0)) {
                    swap(i, j);
                }
            }
        }
    }

    // Display item details
    static void showItem(Item item) {
        System.out.println(item.id + " | " + item.name + " | "
                + item.quantity + " | " + item.price);
    }

    // Display all items
    static void display() {
        Item temp = head;
        while (temp != null) {
            showItem(temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addBeginning("Laptop", 101, 2, 50000);
        addEnd("Mouse", 102, 5, 500);
        addPosition(2, "Keyboard", 103, 3, 1200);

        System.out.println("Inventory:");
        display();

        System.out.println("\nSearch by ID:");
        Item item = searchById(102);
        if (item != null) showItem(item);

        System.out.println("\nSearch by Name:");
        searchByName("Keyboard");

        updateQuantity(102, 8);
        System.out.println("\nTotal Value: " + totalValue());

        sort("name", true);
        System.out.println("\nSorted by Name (Ascending):");
        display();

        sort("price", false);
        System.out.println("\nSorted by Price (Descending):");
        display();

        removeItem(101);
        System.out.println("\nAfter Deletion:");
        display();
    }
}
