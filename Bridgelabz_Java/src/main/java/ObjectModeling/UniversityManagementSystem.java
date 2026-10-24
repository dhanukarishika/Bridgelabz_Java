/*
 * Q8. University Management System
 * Model student enrollment and professor assignments
 * using association and aggregation.
 */
package ObjectModeling;

import java.util.ArrayList;

class Student {
    private final String name;
    private final ArrayList<Course> courses;

    public Student(String name) {
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

    public void enrollCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }

        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);
        }
    }

    public void displayCourses() {
        System.out.println("Courses Enrolled by " + name + ":");

        if (courses.isEmpty()) {
            System.out.println("No courses enrolled.");
            return;
        }

        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Professor {
    private final String name;
    private final ArrayList<Course> courses;

    public Professor(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Professor name cannot be empty."
            );
        }

        this.name = name.trim();
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    void removeCourse(Course course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses Taught by " + name + ":");

        if (courses.isEmpty()) {
            System.out.println("No courses assigned.");
            return;
        }

        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

class Course {
    private final String courseName;
    private final ArrayList<Student> students;
    private Professor professor;

    public Course(String courseName) {
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

    void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (!students.contains(student)) {
            students.add(student);
            student.enrollCourse(this);
        }
    }

    public void assignProfessor(Professor professor) {
        if (professor == null) {
            throw new IllegalArgumentException("Professor cannot be null.");
        }

        if (this.professor != null) {
            this.professor.removeCourse(this);
        }

        this.professor = professor;
        professor.addCourse(this);
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: "
                + (professor == null ? "Not assigned" : professor.getName()));

        System.out.println("Enrolled Students:");

        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        }

        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

class University {
    private final String name;
    private final ArrayList<Course> courses;

    public University(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "University name cannot be empty."
            );
        }

        this.name = name.trim();
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException("Course cannot be null.");
        }

        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    public void displayDetails() {
        System.out.println("University: " + name);

        for (Course course : courses) {
            System.out.println();
            course.displayDetails();
        }
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Rishika");
        Student student2 = new Student("Vaidehi");

        Professor professor1 = new Professor("Dr. Priya");
        Professor professor2 = new Professor("Dr. Karthik");

        Course javaCourse = new Course("Java");
        Course databaseCourse = new Course("Database");

        student1.enrollCourse(javaCourse);
        student1.enrollCourse(databaseCourse);
        student2.enrollCourse(javaCourse);

        javaCourse.assignProfessor(professor1);
        databaseCourse.assignProfessor(professor2);

        // Courses are created independently and added to the university.
        University university = new University("SRM");
        university.addCourse(javaCourse);
        university.addCourse(databaseCourse);

        university.displayDetails();

        System.out.println();
        student1.displayCourses();

        System.out.println();
        professor1.displayCourses();
    }
}