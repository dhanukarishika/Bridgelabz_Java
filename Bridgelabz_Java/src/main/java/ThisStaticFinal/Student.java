/*
 * Q5. University Student Management
 * Demonstrate static, this, final, and instanceof
 * using student details and grade updates.
 */
package ThisStaticFinal;
public class Student {
    private static String universityName = "SRM Institute of Science and Technology";
    private static int totalStudents = 0;
    private String name;
    private final String rollNumber;
    private String grade;
    public Student(String name, String rollNumber, String grade) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        if (rollNumber == null || rollNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Roll number cannot be empty.");
        }
        if (grade == null || grade.trim().isEmpty()) {
            throw new IllegalArgumentException("Grade cannot be empty.");
        }
        this.name = name.trim();
        this.rollNumber = rollNumber.trim();
        this.grade = grade.trim();
        totalStudents++;
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
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        if (grade == null || grade.trim().isEmpty()) {
            throw new IllegalArgumentException("Grade cannot be empty.");
        }
        this.grade = grade.trim();
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    public void displayDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student student1 = new Student("Rishika Dhanuka", "SRM101", "B");
        Student student2 = new Student("Vaidehi Mishra", "SRM102", "A");
        Object[] students = {student1, student2, "Not a student"};
        System.out.println("Student Details");
        for (Object object : students) {
            System.out.println();
            if (object instanceof Student) {
                Student student = (Student) object;
                student.displayDetails();
            } else {
                System.out.println("The object is not a Student.");
            }
        }
        Object objectToUpdate = student1;
        if (objectToUpdate instanceof Student) {
            Student student = (Student) objectToUpdate;
            student.setGrade("A");
            System.out.println("\nAfter Updating Grade");
            student.displayDetails();
        }
        System.out.println();
        Student.displayTotalStudents();
    }
}