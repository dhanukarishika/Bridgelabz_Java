/*
 * Q1. University Management System
 * Demonstrate public, protected, and private members
 * using Student and its subclass PostgraduateStudent.
 */
package Constructor.level3;
public class Student {
    public String rollNumber;
    protected String name;
    private double CGPA;
    public Student(String rollNumber, String name, double CGPA) {
        if (rollNumber == null || rollNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Roll number cannot be empty.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.rollNumber = rollNumber.trim();
        this.name = name.trim();
        setCGPA(CGPA);
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        if (!Double.isFinite(CGPA) || CGPA < 0 || CGPA > 10) {
            throw new IllegalArgumentException(
                    "CGPA must be between 0 and 10."
            );
        }
        this.CGPA = CGPA;
    }
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent("PG101", "Rishika Dhanuka", 8.5);
        System.out.println("Student Details");
        student.displayDetails();
        // Public members can be accessed directly.
        System.out.println("\nPublic Roll Number: " + student.rollNumber);
        student.setCGPA(9.0);
        System.out.println("\nAfter Updating CGPA");
        student.displayDetails();
    }
}
class PostgraduateStudent extends Student {
    public PostgraduateStudent(String rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        // The subclass can directly access the protected name.
        System.out.println("Name: " + name);
        // Private CGPA is accessed through its public getter.
        System.out.printf("CGPA: %.2f%n", getCGPA());
    }
}