package Sorting;
import java.util.Arrays;
/*
 * Q7. Counting Sort - Sort Student Ages
 * Sort student ages ranging from 10 to 18 using Counting Sort.
 */
public class CountingSortStudentAges {
    // Sort ages using Counting Sort
    static void countingSort(int[] ages) {
        int min = 10, max = 18;
        int[] count = new int[max - min + 1];
        int[] output = new int[ages.length];
        // Count frequency of each age
        for (int age : ages) {
            count[age - min]++;
        }
        // Calculate cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // Place elements in correct positions
        for (int i = ages.length - 1; i >= 0; i--) {
            int index = ages[i] - min;
            output[count[index] - 1] = ages[i];
            count[index]--;
        }
        // Copy sorted ages to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 10, 14, 12, 16};
        System.out.println("Original Ages: " + Arrays.toString(ages));
        countingSort(ages);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));
    }
}
