/*
 * Q1. Simulate Student Report
 * Create a Student class with name, rollNumber, and marks,
 * and methods to calculate the grade and display details.
 */
package ObjectOrientedFundamental.level2;
import java.util.Scanner;
public class Student {
    private String name;
    private String rollNumber;
    private double marks;
    public Student(String name, String rollNumber, double marks) {
        setName(name);
        setRollNumber(rollNumber);
        setMarks(marks);
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
    public String getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(String rollNumber) {
        if (rollNumber == null || rollNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Roll number cannot be empty.");
        }
        this.rollNumber = rollNumber.trim();
    }
    public double getMarks() {
        return marks;
    }
    public void setMarks(double marks) {
        if (!Double.isFinite(marks) || marks < 0 || marks > 100) {
            throw new IllegalArgumentException(
                    "Marks must be between 0 and 100."
            );
        }
        this.marks = marks;
    }
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else if (marks >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
    public void displayDetails() {
        System.out.println("\nStudent Report");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.printf("Marks: %.2f / 100%n", marks);
        System.out.println("Grade: " + calculateGrade());
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter roll number: ");
            String rollNumber = scanner.nextLine();
            System.out.print("Enter marks (0-100): ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Marks must be a number.");
                return;
            }
            double marks = scanner.nextDouble();
            try {
                Student student = new Student(name, rollNumber, marks);
                student.displayDetails();
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}