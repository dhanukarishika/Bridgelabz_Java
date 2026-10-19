
/*
 * Program 10: Check whether three points are collinear
 * using slopes and calculate the area of the triangle
 * formed by the three points.
 */
package Methods.level3;

import java.util.Scanner;

public class CollinearityAndTriangleArea {

    // Calculate the slope between two points.
    public static double calculateSlope(double x1, double y1,
                                        double x2, double y2) {
        if (x1 == x2) {
            return Double.POSITIVE_INFINITY;
        }

        return (y2 - y1) / (x2 - x1);
    }

    // Check whether three points lie on the same straight line.
    public static boolean areCollinear(double x1, double y1,
                                       double x2, double y2,
                                       double x3, double y3) {
        double area = calculateTriangleArea(
                x1, y1, x2, y2, x3, y3);

        return Math.abs(area) < 1e-9;
    }

    // Calculate the area using the coordinate formula.
    public static double calculateTriangleArea(double x1, double y1,
                                               double x2, double y2,
                                               double x3, double y3) {
        return Math.abs(
                x1 * (y2 - y3)
                        + x2 * (y3 - y1)
                        + x3 * (y1 - y2)
        ) / 2.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 and y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        double slopeAB = calculateSlope(x1, y1, x2, y2);
        double slopeBC = calculateSlope(x2, y2, x3, y3);

        System.out.println("Slope AB: " + slopeAB);
        System.out.println("Slope BC: " + slopeBC);

        if (areCollinear(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The three points are collinear.");
            System.out.println("Triangle area: 0.0");
        } else {
            System.out.println("The three points are not collinear.");

            double area = calculateTriangleArea(
                    x1, y1, x2, y2, x3, y3);

            System.out.printf("Triangle area: %.2f%n", area);
        }

        sc.close();
    }
}
