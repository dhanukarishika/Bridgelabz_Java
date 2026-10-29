package StringIOAndSearching;
/*
 * Q1. Reverse a String Using StringBuilder
 * Reverse a given string using the reverse() method.
 */
public class ReverseStringUsingStringBuilder {
    // Reverse string using StringBuilder
    static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));
    }
}
