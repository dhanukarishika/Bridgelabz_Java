/*
 * This program identifies students who have passing marks using Java Streams.
 * It filters the marks list and prints only the values greater than or equal to 45.
 */
package Streams;
import java.util.Arrays;
import java.util.List;
public class PassingStudents {
    public static void main(String[] args) {
        // Create a list containing students' marks.
        List<Integer> list = Arrays.asList(35, 60, 45, 90, 72, 25);
        // Filter and print marks that are greater than or equal to 45.
        list.stream()
                .filter(t -> t >= 45)
                .forEach(System.out::println);
    }
}