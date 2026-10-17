/*
 * Question 8: Print a countdown from the entered number to 1
 * using a while loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class CountdownWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the starting number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Print countdown
        while (number >= 1) {
            System.out.println(number);
            number--;
        }
        sc.close();
    }
}