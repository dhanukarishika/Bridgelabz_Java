/*
 * This program calculates the square of each number in a list using Java Streams.
 * It uses the Function interface and map() to transform each number into its square.
 */
package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
public class SquaresOfNumbers {
    public static void main(String[] args) {
        // Create a list of integers.
        List<Integer> list = Arrays.asList(10, 50, 20, 40);
        // Define a function that returns the square of a number.
        Function<Integer, Integer> number = new Function<>() {
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };
        // Calculate and print the square of each number.
        list.stream()
                .map(number)
                .forEach(System.out::println);

    }
}