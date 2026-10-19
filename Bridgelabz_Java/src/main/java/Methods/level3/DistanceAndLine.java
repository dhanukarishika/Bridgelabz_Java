
/*
 * Program 9: Calculate the Euclidean distance between two points
 * and find the slope and y-intercept of the line joining them.
 */
package Methods.level3;

import java.util.Scanner;

public class DistanceAndLine {

    // Calculate Euclidean distance between two points.
    public static double calculateDistance(double x1, double y1,
                                           double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2)
                + Math.pow(y2 - y1, 2));
    }

    // Return the slope and y-intercept of the line.
    public static double[] findLineEquation(double x1, double y1,
                                            double x2, double y2) {
        double[] result = new double[2];

        // A vertical line has an undefined slope.
        if (x1 == x2) {
            result[0] = Double.NaN;
            result[1] = Double.NaN;
            return result;
        }

        double slope = (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;

        result[0] = slope;
        result[1] = intercept;

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.printf("Euclidean Distance: %.2f%n", distance);

        if (x1 == x2) {
            System.out.println("Equation of line: x = " + x1);
            System.out.println("Slope and y-intercept are undefined.");
        } else {
            System.out.printf("Slope: %.2f%n", line[0]);
            System.out.printf("Y-intercept: %.2f%n", line[1]);
            System.out.printf("Equation of line: y = %.2fx + %.2f%n",
                    line[0], line[1]);
        }

        sc.close();
    }
}
