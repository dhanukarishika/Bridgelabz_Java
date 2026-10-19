/*
 * Program 11: Calculate sine, cosine, and tangent
 * of an angle using the Math class.
 */
package Methods.level1;
import java.util.Scanner;
public class TrigonometricFunctions {
    // Calculate trigonometric functions for an angle in degrees.
    public static double[] calculateTrigonometricFunctions(double angle)
    {
        // Convert degrees into radians.
        double radians = Math.toRadians(angle);
        // Calculate sine, cosine, and tangent.
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the angle in degrees.
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        // Calculate the trigonometric functions.
        double[] results = calculateTrigonometricFunctions(angle);
        // Display the results.
        System.out.printf("Sine: %.4f%n", results[0]);
        System.out.printf("Cosine: %.4f%n", results[1]);
        // Tangent is undefined at 90 + 180k degrees.
        double normalizedAngle = angle % 180;
        if (Math.abs(normalizedAngle) == 90) {
            System.out.println("Tangent: Undefined");
        } else {
            System.out.printf("Tangent: %.4f%n", results[2]);
        }
        sc.close();
    }
}
