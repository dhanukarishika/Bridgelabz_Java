/*
 * This program finds the string with the maximum length from a list.
 * It uses Java Streams and a Comparator to identify the longest string.
 */
package Streams;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
public class MaxLengthOfString {
    public static void main(String[] args) {
        // Create a list containing strings to compare.
        List<String> li = Arrays.asList("rishika", "dhanuka");
        // Find the string with the greatest length and convert the result to a String.
        String word = String.valueOf(li.stream().max(Comparator.comparingInt(String::length)));
        // Print the result.
        System.out.println(word);
    }
}