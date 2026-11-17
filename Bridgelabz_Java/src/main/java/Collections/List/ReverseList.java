package Collections.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
/*
 * Q1. Reverse a List
 * Reverse an ArrayList and LinkedList without built-in reverse methods.
 */
public class ReverseList {
    // Reverse ArrayList using a backward loop
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }
    // Reverse LinkedList by inserting elements at the beginning
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int num : list) {
            reversed.addFirst(num);
        }
        return reversed;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));
        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
}