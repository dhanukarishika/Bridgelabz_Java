
/*
 * Program 2: Create a substring using charAt() and
 * compare it with the built-in substring() method.
 */
package Strings.level1;
import java.util.Scanner;
public class SubstringComparison {
    // Create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }
    // Compare two strings using charAt()
    public static boolean compareStrings(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) != text2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Validate substring indexes
        if (start < 0 || end > text.length() || start > end) {
            System.out.println("Invalid substring indexes.");
        } else {
            String customSubstring = createSubstring(text, start, end);
            String builtInSubstring = text.substring(start, end);
            System.out.println("Using charAt(): " + customSubstring);
            System.out.println("Using substring(): " + builtInSubstring);
            System.out.println("Both results match: " + compareStrings(customSubstring, builtInSubstring));
        }
        sc.close();
    }
}
