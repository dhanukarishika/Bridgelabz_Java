/*
 * This program finds all numbers present in a given sentence.
 * It uses regular expressions and Matcher to identify and print each number.
 */
package RegularExpressions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FindNumbers {
    public static void main(String[] args) {
        String sen = "i am 21 years old and i was born in 2005";
        // Compile a regular expression that matches one or more digits.
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(sen);
        // Find and print each matching number in the sentence.
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}