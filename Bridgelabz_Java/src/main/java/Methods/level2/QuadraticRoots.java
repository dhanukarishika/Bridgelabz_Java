
/*
 * Program 11: Find the roots of a quadratic equation
 * using its coefficients a, b, and c.
 */
package Methods.level2;
import java.util.Scanner;
public class QuadraticRoots {
    // Calculate and display the roots of a quadratic equation.
    public static void findRoots(double a, double b, double c) {
        // Calculate the discriminant.
        double discriminant = (b * b) - (4 * a * c);
        // Find the roots based on the discriminant.
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Both roots are equal: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / Math.abs(2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the coefficients.
        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();
        // A quadratic equation requires a non-zero coefficient of x^2.
        if (a == 0) {
            System.out.println(
                    "Invalid input. Coefficient a must not be zero.");
        } else {
            findRoots(a, b, c);
        }
        sc.close();
    }
}
