/*
 * This program converts all names in a list to uppercase using Java Streams.
 * It uses map() to transform each name and prints the results.
 */
package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Salaries {
    public static void main(String[] args) {
        // Create a list of names.
        List<String> l = Arrays.asList("Rishika","dhanuka");
        // Convert each name to uppercase and print it.
        l.stream()
                .map(name -> name.toUpperCase())
                .forEach(System.out::println);
    }
}