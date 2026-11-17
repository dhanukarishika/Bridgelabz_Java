/*
 * This program filters numbers greater than 20 and multiplies them by 2.
 * It uses Java Streams to process and print the resulting values.
 */
package Streams;
import java.util.Arrays;
import java.util.List;
public class SelectAndMultiply {
    public static void main(String[] args) {
        // Create a list of integers.
        List<Integer> list = Arrays.asList(10, 50, 20, 70, 45);
        // Select numbers greater than 20, multiply them by 2, and print the results.
        list.stream()
                .filter(t -> t > 20)
                .map(t -> t * 2)
                .forEach(System.out::println);
    }
}