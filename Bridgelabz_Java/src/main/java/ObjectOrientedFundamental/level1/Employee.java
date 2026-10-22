/*
 * Q1. Display Employee Details
 * Create an Employee class with name, id, and salary,
 * and add a method to display the details.
 */
package ObjectOrientedFundamental.level1;
import java.util.Scanner;
public class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        setName(name);
        setId(id);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name.trim();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive.");
        }
        this.id = id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException(
                    "Salary must be a valid non-negative number."
            );
        }
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Salary: %.2f%n", salary);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter employee ID: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Employee ID must be an integer.");
                return;
            }
            int id = scanner.nextInt();
            System.out.print("Enter employee salary: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Salary must be a number.");
                return;
            }
            double salary = scanner.nextDouble();
            try {
                Employee employee = new Employee(name, id, salary);
                employee.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}