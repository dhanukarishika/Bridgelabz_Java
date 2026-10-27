
package LinkedList.Double;

/*
 * Q8. Doubly Linked List: Text Editor Undo/Redo
 * Add text states, undo, redo, display text,
 * and maintain a maximum history of 10 states.
 */

public class TextEditorUndoRedo {

    // Node to store text state
    static class State {
        String text;
        State prev, next;

        State(String text) {
            this.text = text;
        }
    }

    static final int MAX_HISTORY = 10;
    static State head = new State("");
    static State tail = head, current = head;
    static int count = 1;

    // Add new text state
    static void addState(String text) {

        // Clear redo history after a new action
        State temp = current.next;

        while (temp != null) {
            State next = temp.next;
            temp.prev = temp.next = null;
            temp = next;
            count--;
        }

        current.next = null;
        tail = current;

        State newNode = new State(text);
        newNode.prev = current;
        current.next = newNode;
        current = tail = newNode;
        count++;

        // Remove oldest state if history exceeds limit
        if (count > MAX_HISTORY) {
            State old = head;
            head = head.next;
            head.prev = null;
            old.next = null;
            count--;
        }
    }

    // Undo to previous state
    static void undo() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Undo successful");
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo to next state
    static void redo() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Redo successful");
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current text
    static void display() {
        System.out.println("Current Text: " + current.text);
    }

    public static void main(String[] args) {
        addState("Hello");
        addState("Hello World");
        addState("Hello World!");

        System.out.println("After Typing:");
        display();

        System.out.println("\nFirst Undo:");
        undo();
        display();

        System.out.println("\nSecond Undo:");
        undo();
        display();

        System.out.println("\nRedo:");
        redo();
        display();

        System.out.println("\nNew Text Action:");
        addState("Hello Java");
        display();

        System.out.println("\nRedo After New Action:");
        redo();
        display();
    }
}
