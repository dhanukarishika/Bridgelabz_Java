/*
 * Q2. Compute Area of a Circle
 * Create a Circle class with radius and methods
 * to calculate and display its area and circumference.
 */
package ObjectOrientedFundamental.level1;
import java.util.Scanner;
public class Circle {
    private double radius;
    public Circle(double radius) {
        setRadius(radius);
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException("Radius must be a valid positive number.");
        }
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public void displayDetails() {
        System.out.printf("%nRadius: %.2f%n", radius);
        System.out.printf("Area: %.2f square units%n", calculateArea());
        System.out.printf("Circumference: %.2f units%n",
                calculateCircumference());
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the radius: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Radius must be a number.");
                return;
            }
            double radius = scanner.nextDouble();
            try {
                Circle circle = new Circle(radius);
                circle.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}