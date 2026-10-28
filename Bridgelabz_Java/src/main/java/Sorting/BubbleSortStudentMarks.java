package Sorting;
import java.util.Arrays;
/*
 * Q1. Bubble Sort - Sort Student Marks
 * Sort student marks in ascending order using Bubble Sort.
 */
public class BubbleSortStudentMarks {
    // Sort marks using Bubble Sort
    static void bubbleSort(int[] marks) {
        int n = marks.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            // Compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap elements
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }
            // Stop if array is already sorted
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] marks = {85, 72, 90, 65, 78};
        System.out.println("Original Marks: " + Arrays.toString(marks));
        bubbleSort(marks);
        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }
}
