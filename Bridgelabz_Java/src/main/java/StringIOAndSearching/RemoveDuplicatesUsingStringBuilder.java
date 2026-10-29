package StringIOAndSearching;
import java.util.HashSet;
/*
 * Q2. Remove Duplicates from a String Using StringBuilder
 * Remove duplicate characters while maintaining their original order.
 */
public class RemoveDuplicatesUsingStringBuilder {
    // Remove duplicate characters
    static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char ch : str.toCharArray()) {
            // Append only characters that have not appeared before
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "programming";
        System.out.println("Original String: " + str);
        System.out.println("Without Duplicates: " + removeDuplicates(str));
    }
}
