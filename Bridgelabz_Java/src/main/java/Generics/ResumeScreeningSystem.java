package Generics;
import java.util.*;
/*
 * Q5. AI-Driven Resume Screening System
 * Screen resumes for different job roles using generic
 * classes, bounded types, methods, and wildcards.
 */
public class ResumeScreeningSystem {
    // Base class for all job roles
    static abstract class JobRole {
        String title;
        int minExperience;
        JobRole(String title, int minExperience) {
            this.title = title;
            this.minExperience = minExperience;
        }
    }
    static class SoftwareEngineer extends JobRole {
        SoftwareEngineer() {
            super("Software Engineer", 2);
        }
    }
    static class DataScientist extends JobRole {
        DataScientist() {
            super("Data Scientist", 2);
        }
    }
    static class ProductManager extends JobRole {
        ProductManager() {
            super("Product Manager", 3);
        }
    }
    // Generic resume class restricted to valid job roles
    static class Resume<T extends JobRole> {
        String candidateName;
        int experience;
        T role;
        Resume(String candidateName, int experience, T role) {
            this.candidateName = candidateName;
            this.experience = experience;
            this.role = role;
        }
    }
    // Generic method to screen a candidate
    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        String result = resume.experience >= resume.role.minExperience
                ? "Shortlisted" : "Rejected";
        System.out.println(resume.candidateName + " - "
                + resume.role.title + ": " + result);
    }
    // Wildcard method to display different job roles
    public static void displayRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println(role.title + " (Minimum "
                    + role.minExperience + " years)");
        }
    }
    public static void main(String[] args) {
        List<JobRole> roles = Arrays.asList(
                new SoftwareEngineer(),
                new DataScientist(),
                new ProductManager()
        );
        System.out.println("Available Job Roles:");
        displayRoles(roles);
        Resume<SoftwareEngineer> r1 = new Resume<>("Alice", 3, new SoftwareEngineer());
        Resume<DataScientist> r2 = new Resume<>("Bob", 1, new DataScientist());
        Resume<ProductManager> r3 = new Resume<>("Carol", 4, new ProductManager());
        System.out.println("\nResume Screening Results:");
        screenResume(r1);
        screenResume(r2);
        screenResume(r3);
    }
}