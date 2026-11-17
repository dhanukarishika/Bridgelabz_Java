
/*
 * This program counts numbers, lowercase letters, and uppercase letters in a sentence.
 * It uses regular expressions and Matcher to find and count matching patterns.
 */

package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountUpperLowerNumber {
    public static void main(String[] args) {
        String sentence = "i am a good Boy and i am 18 years Old";
        int lower = 0, upper = 0, number = 0;

        // Create matchers to identify digits, lowercase letters, and uppercase letters.
        Matcher m = Pattern.compile("\\d+").matcher(sentence);
        Matcher m1 = Pattern.compile("[a-z]").matcher(sentence);
        Matcher m2 = Pattern.compile("[A-Z]").matcher(sentence);

        // Count each sequence of one or more digits.
        while (m.find()) {
            number++;
        }

        // Count all lowercase letters.
        while (m1.find()) {
            lower++;
        }

        // Count all uppercase letters.
        while (m2.find()) {
            upper++;
        }
        // Print the final counts.
        System.out.println("Number: " + number);
        System.out.println("Lower: " + lower);
        System.out.println("Upper: " + upper);
    }
}