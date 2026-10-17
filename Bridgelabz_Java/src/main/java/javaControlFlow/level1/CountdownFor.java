/*
 * Question 9: Print a countdown from the entered number to 1
 * using a for loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the starting number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Print countdown
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}