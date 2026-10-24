/*
 * Q4. School and Students with Courses
 * Demonstrate school-student aggregation and
 * many-to-many student-course association.
 */
package ObjectModeling;

import java.util.ArrayList;

class SchoolStudent {
    private final String name;
    private final ArrayList<SchoolCourse> courses;

    public SchoolStudent(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Student name cannot be empty."
            );
        }

        this.name = name.trim();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(SchoolCourse course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }

        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void displayCourses() {
        System.out.println("Student: " + name);

        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }

        for (SchoolCourse course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class SchoolCourse {
    private final String courseName;
    private final ArrayList<SchoolStudent> students;

    public SchoolCourse(String courseName) {
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Course name cannot be empty."
            );
        }

        this.courseName = courseName.trim();
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    void addStudent(SchoolStudent student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this);
        }
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName);

        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
            return;
        }

        for (SchoolStudent student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

class School {
    private final String schoolName;
    private final ArrayList<SchoolStudent> students;

    public School(String schoolName) {
        if (schoolName == null || schoolName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "School name cannot be empty."
            );
        }

        this.schoolName = schoolName.trim();
        this.students = new ArrayList<>();
    }

    public void addStudent(SchoolStudent student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void removeStudent(SchoolStudent student) {
        students.remove(student);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName);

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (SchoolStudent student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

public class SchoolCourseSystem {
    public static void main(String[] args) {
        // Students exist independently of the school.
        SchoolStudent student1 = new SchoolStudent("Rishika");
        SchoolStudent student2 = new SchoolStudent("Vaidehi");

        SchoolCourse javaCourse = new SchoolCourse("Java");
        SchoolCourse databaseCourse = new SchoolCourse("Database");

        School school = new School("SRM School");
        school.addStudent(student1);
        school.addStudent(student2);

        student1.enrollCourse(javaCourse);
        student1.enrollCourse(databaseCourse);
        student2.enrollCourse(javaCourse);

        school.displayStudents();

        System.out.println();
        student1.displayCourses();

        System.out.println();
        student2.displayCourses();

        System.out.println();
        javaCourse.displayStudents();

        System.out.println();
        databaseCourse.displayStudents();

        school.removeStudent(student1);

        System.out.println("\nAfter Removing Rishika from the School");
        school.displayStudents();

        System.out.println("\nStudent Still Exists Independently");
        student1.displayCourses();
    }
}