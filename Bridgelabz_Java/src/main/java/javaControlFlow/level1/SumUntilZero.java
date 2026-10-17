/*
 * Question 10: Calculate the sum of numbers entered by the user
 * until 0 is entered, using a while loop.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class SumUntilZero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        double number;
        // Read and add numbers until 0 is entered
        System.out.print("Enter a number (0 to stop): ");
        number=sc.nextDouble();
        while (number!=0)
        {
            sum+=number;
            System.out.print("Enter a number (0 to stop): ");
            number=sc.nextDouble();
        }
        // Display the total
        System.out.println("Sum = " + sum);
        sc.close();
    }
}