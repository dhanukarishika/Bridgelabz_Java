/*
 * This program multiplies each number in a list by 2 using Java Streams.
 * It uses map() to transform each element and prints the resulting values.
 */
package Streams;
import java.util.Arrays;
import java.util.List;
public class MultiplyingNumbers {
    public static void main(String[] args) {
        // Create a list of integers to process.
        List<Integer> l = Arrays.asList(10, 20, 30, 40);
        // Multiply each number by 2 and print the results.
        l.stream()
                .map(t -> t * 2)
                .forEach(System.out::println);
    }
}