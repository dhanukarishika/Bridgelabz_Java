/*
 * Question 6: Write a program to create a calculator using
 * switch...case for addition, subtraction, multiplication, and division.
 */
package javaControlFlow.level3;
import java.util.Scanner;
// Class to perform basic arithmetic operations
public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Get the first number from the user
        System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
        // Get the second number from the user
        System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
        // Get the arithmetic operator from the user
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = sc.next();
        // Perform the operation based on the operator
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        // Close the Scanner
        sc.close();
    }
}