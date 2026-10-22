/*
 * Q9. Basic Calculator
 * Write a Java program to perform addition,
 * subtraction, multiplication, and division
 * using separate methods for each operation.
 */
package Methods.extras;
import java.util.Scanner;
public class BasicCalculator {
    // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    // Method for division
    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Display calculator menu
        System.out.println("Basic Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }
        // Take two numbers as input
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double result;
        // Perform operation based on user choice
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    sc.close();
                    return;
                }
                result = divide(num1, num2);
                break;
            default:
                sc.close();
                return;
        }
        // Display result
        System.out.println("Result: " + result);
        sc.close();
    }
}
