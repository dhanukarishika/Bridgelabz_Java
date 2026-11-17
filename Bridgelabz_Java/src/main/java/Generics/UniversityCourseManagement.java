package Generics;
import java.util.ArrayList;
import java.util.List;
/*
 * Q3. Multi-Level University Course Management System
 * Manage courses with different evaluation types using
 * generic classes, bounded types, and wildcards.
 */
public class UniversityCourseManagement {
    // Base class for different course types
    static abstract class CourseType {
        String name, department, evaluation;
        CourseType(String name, String department, String evaluation) {
            this.name = name;
            this.department = department;
            this.evaluation = evaluation;
        }
        @Override
        public String toString() {
            return name + " (" + department + ") - " + evaluation;
        }
    }
    static class ExamCourse extends CourseType {
        ExamCourse(String name, String department) {
            super(name, department, "Exam-Based");
        }
    }
    static class AssignmentCourse extends CourseType {
        AssignmentCourse(String name, String department) {
            super(name, department, "Assignment-Based");
        }
    }
    static class ResearchCourse extends CourseType {
        ResearchCourse(String name, String department) {
            super(name, department, "Research-Based");
        }
    }
    // Generic class to manage courses of a specific type
    static class Course<T extends CourseType> {
        private List<T> courses = new ArrayList<>();
        public void addCourse(T course) {
            courses.add(course);
        }
        public List<T> getCourses() {
            return courses;
        }
    }
    // Display courses of any evaluation type
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse("Data Structures", "CSE"));
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        assignmentCourses.addCourse(new AssignmentCourse("Digital Electronics", "ECE"));
        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse("Machine Learning", "CSE"));
        System.out.println("Exam-Based Courses:");
        displayCourses(examCourses.getCourses());
        System.out.println("\nAssignment-Based Courses:");
        displayCourses(assignmentCourses.getCourses());
        System.out.println("\nResearch-Based Courses:");
        displayCourses(researchCourses.getCourses());
    }
}