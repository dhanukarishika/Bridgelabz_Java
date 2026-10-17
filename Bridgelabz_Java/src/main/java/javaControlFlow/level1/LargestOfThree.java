/*
 * Question 3: Check which of three numbers is the largest.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        // Read three numbers from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();
        // Check which number is the largest
        boolean isFirstLargest = number1 >= number2 && number1 >= number3;
        boolean isSecondLargest = number2 >= number1 && number2 >= number3;
        boolean isThirdLargest = number3 >= number1 && number3 >= number2;
        // Display the results
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        // Close the Scanner
        sc.close();
    }
}
