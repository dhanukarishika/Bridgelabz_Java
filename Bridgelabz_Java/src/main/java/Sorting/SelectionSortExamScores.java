package Sorting;
import java.util.Arrays;
/*
 * Q5. Selection Sort - Sort Exam Scores
 * Sort exam scores in ascending order using Selection Sort.
 */
public class SelectionSortExamScores {
    // Sort scores using Selection Sort
    static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the minimum element
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap minimum element with current element
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] scores = {85, 62, 90, 73, 55, 88};
        System.out.println("Original Exam Scores: " + Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }
}
