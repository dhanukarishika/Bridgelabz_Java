/*
 * Question 18: Print the multiplication table of a number
 * from 6 to 9 using a for loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        // Print the table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        sc.close();
    }
}