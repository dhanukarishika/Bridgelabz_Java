/*
 * Question 6: Print numbers from 0 to the given positive integer.
 * Print Fizz for multiples of 3, Buzz for multiples of 5,
 * and FizzBuzz for multiples of both using a while loop.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        // Create Scanner and read the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        // Validate the input
        if (number < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Print FizzBuzz results from 0 to the number
            int i = 0;
            while (i <= number) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        // Close Scanner
        sc.close();
    }
}