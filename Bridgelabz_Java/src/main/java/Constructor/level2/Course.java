/*
 * Q2. Online Course Management
 * Create a Course class with course details and a shared
 * institute name that can be updated using a class method.
 */
package Constructor.level2;
public class Course {
    private String courseName;
    private int duration;
    private double fee;

    private static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        setCourseName(courseName);
        setDuration(duration);
        setFee(fee);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Course name cannot be empty."
            );
        }
        this.courseName = courseName.trim();
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException(
                    "Duration must be positive."
            );
        }
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if (!Double.isFinite(fee) || fee < 0) {
            throw new IllegalArgumentException(
                    "Fee must be a valid non-negative number."
            );
        }
        this.fee = fee;
    }
    public static String getInstituteName() {
        return instituteName;
    }
    public static void updateInstituteName(String newInstituteName) {
        if (newInstituteName == null || newInstituteName.trim().isEmpty()) {
            throw new IllegalArgumentException("Institute name cannot be empty.");
        }
        instituteName = newInstituteName.trim();
    }
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.printf("Fee: Rs. %.2f%n", fee);
    }
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 12, 15000);
        Course course2 = new Course("Data Structures", 8, 10000);
        System.out.println("Before Updating Institute Name");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        Course.updateInstituteName("BridgeLabz Training Institute");
        System.out.println("\nAfter Updating Institute Name");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}