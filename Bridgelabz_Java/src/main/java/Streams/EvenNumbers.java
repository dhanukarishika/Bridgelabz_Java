/*
 * This program demonstrates filtering even numbers using Java Streams.
 * It prints each even number and displays the total count of matching elements.
 */
package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class EvenNumbers {
    public static void main(String[] args) {
        // Create a list of integers to process using a stream.
        List<Integer> l = Arrays.asList(10, 20, 30, 40);
        // Filter even numbers, print them using peek(), and count the matches.
        long count = l.stream()
                .filter(t -> t % 2 == 0)
                .peek(System.out::println)
                .count();
        // Display the total number of even elements.
        System.out.println("total count: " + count);
    }
}