/*
 * Program 9: Input five numbers, check whether each
 * number is positive or negative, check positive
 * numbers for even or odd, and compare the first
 * and last elements of the array.
 */
package Methods.level2;
import java.util.Scanner;
public class NumberArrayAnalysis {

    // Check whether a number is positive.
    public static boolean isPositive(int number) {
        return number > 0;
    }
    // Check whether a number is even.
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    // Compare two numbers.
    // Return 1 if number1 > number2, 0 if equal, -1 if smaller.
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        // Input five numbers.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        // Check each number using the required methods.
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (isPositive(number)) {
                System.out.print(number + " is positive and ");
                if (isEven(number)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
        // Compare the first and last array elements.
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        if (result == 1) {
            System.out.println("First element is greater than the last.");
        } else if (result == -1) {
            System.out.println("First element is less than the last.");
        } else {
            System.out.println("First and last elements are equal.");
        }
        sc.close();
    }
}
