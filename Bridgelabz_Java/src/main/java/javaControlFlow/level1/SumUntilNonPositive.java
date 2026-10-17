/*
 * Question 11: Calculate the sum of entered numbers until
 * 0 or a negative number is entered, using break.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class SumUntilNonPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        // Read numbers until a non-positive number is entered
        while (true)
        {
            System.out.println("Enter a positive number: ");
            double number=sc.nextDouble();
            if (number<=0)
            {
                break;
            }
            sum+=number;
        }
        // Display the total
        System.out.println("Sum = " + sum);
        sc.close();
    }
}