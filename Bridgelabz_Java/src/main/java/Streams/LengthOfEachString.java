/*
 * This program calculates the length of each string using Java Streams.
 * It uses the Function interface and map() to transform strings into their lengths.
 */
package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
public class LengthOfEachString {
    public static void main(String[] args) {
        // Create a list containing names.
        List<String> list = Arrays.asList("rishika","dhanuka");
        // Define a function that returns the length of a given string.
        Function<String, Integer> f = new Function<String, Integer>() {
            public Integer apply(String word) {
                return word.length();
            }
        };
        // Calculate and print the length of each string in the list.
        list.stream()
                .map(f)
                .forEach(System.out::println);
    }
}