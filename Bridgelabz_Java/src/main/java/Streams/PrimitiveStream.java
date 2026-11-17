package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;
public class PrimitiveStream {
    public static void main(String[] args) {
        List<String> s = Arrays.asList("Prabhas", "Mahesh", "Charan", "Allu Arjun", "Balaya", "Jr NTR");
        s.stream().map(t -> t.toUpperCase()).skip(3).distinct().limit(5).forEach(System.out::println);
    }
}