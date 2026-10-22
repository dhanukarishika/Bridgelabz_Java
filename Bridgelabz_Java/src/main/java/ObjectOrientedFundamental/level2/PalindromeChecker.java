/*
 * Q3. Check Palindrome String
 * Create a PalindromeChecker class with text and
 * methods to check and display its palindrome status.
 */
package ObjectOrientedFundamental.level2;
import java.util.Scanner;
public class PalindromeChecker {
    private String text;
    public PalindromeChecker(String text) {
        setText(text);
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty.");
        }
        this.text = text;
    }
    public boolean isPalindrome() {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            char leftCharacter = Character.toLowerCase(text.charAt(left));
            char rightCharacter = Character.toLowerCase(text.charAt(right));
            if (leftCharacter != rightCharacter) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String text = scanner.nextLine();
            try {
                PalindromeChecker checker = new PalindromeChecker(text);
                checker.displayResult();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}