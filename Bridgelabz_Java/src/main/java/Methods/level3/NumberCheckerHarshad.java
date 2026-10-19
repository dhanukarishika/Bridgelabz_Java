
/*
 * Program 3: Calculate the sum and sum of squares of
 * digits, check Harshad numbers, and find digit frequency.
 */
package Methods.level3;
import java.util.Scanner;
public class NumberCheckerHarshad {
    // Count the digits in a number.
    public static int countDigits(int number) {
        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }
    // Store the digits in an array in their original order.
    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    // Calculate the sum of the digits.
    public static int calculateDigitSum(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i];
        }
        return sum;
    }
    // Calculate the sum of the squares of the digits.
    public static double calculateSumOfSquares(int[] digits) {
        double sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += Math.pow(digits[i], 2);
        }
        return sum;
    }
    // Check whether the number is a Harshad number.
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = calculateDigitSum(digits);
        return sum != 0 && number % sum == 0;
    }
    // Create a 2D array containing each digit and its frequency.
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10];
        // Count the occurrences of each digit.
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        // Store digit in column 0 and frequency in column 1.
        int distinctCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                distinctCount++;
            }
        }
        int[][] digitFrequency = new int[distinctCount][2];
        int row = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                digitFrequency[row][0] = i;
                digitFrequency[row][1] = frequency[i];
                row++;
            }
        }
        return digitFrequency;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Invalid input. Enter a non-negative integer.");
            sc.close();
            return;
        }
        // Get the digits and calculate their properties.
        int[] digits = getDigits(number);
        System.out.println("Sum of digits: "
                + calculateDigitSum(digits));

        System.out.println("Sum of squares of digits: "
                + calculateSumOfSquares(digits));

        System.out.println("Harshad number: "
                + isHarshadNumber(number, digits));

        // Display the frequency of each digit.
        int[][] digitFrequency = findDigitFrequency(digits);

        System.out.println("\nDigit\tFrequency");

        for (int i = 0; i < digitFrequency.length; i++) {
            System.out.println(digitFrequency[i][0] + "\t"
                    + digitFrequency[i][1]);
        }

        sc.close();
    }
}
