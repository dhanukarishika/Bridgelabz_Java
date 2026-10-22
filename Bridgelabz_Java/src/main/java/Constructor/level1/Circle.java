/*
 * Q2. Circle Constructor Chaining
 * Create a Circle class using constructor chaining
 * to initialize default and user-provided radius values.
 */
package Constructor.level1;
import java.util.Scanner;
public class Circle {
    private double radius;
    public Circle() {
        this(1.0);
    }
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
    public void displayDetails() {
        System.out.printf("Radius: %.2f%n", radius);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Circle defaultCircle = new Circle();
            System.out.println("Circle Using Default Constructor");
            defaultCircle.displayDetails();
            System.out.print("\nEnter radius for another circle: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Radius must be a number.");
                return;
            }
            double radius = scanner.nextDouble();
            try {
                Circle customCircle = new Circle(radius);
                System.out.println("\nCircle Using Parameterized Constructor");
                customCircle.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}