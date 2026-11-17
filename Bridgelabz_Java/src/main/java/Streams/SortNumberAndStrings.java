/*
 * This program sorts a list of numbers and a list of strings in ascending order.
 * It uses Java Streams and sorted() to arrange and print the elements.
 */
package Streams;
import java.util.Arrays;
import java.util.List;
public class SortNumberAndStrings {
    public static void main(String[] args) {
        // Create lists of integers and strings.
        List<Integer> list = Arrays.asList(10, 30, 20, 40);
        List<String> words = Arrays.asList("rishika","dhanuka");
        // Sort the numbers in ascending order and print them.
        list.stream()
                .sorted()
                .forEach(System.out::println);
        // Sort the strings alphabetically and print them.
        words.stream()
                .sorted()
                .forEach(System.out::println);
    }
}