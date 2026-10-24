/*
 * Q5. University with Faculties and Departments
 * Demonstrate composition with departments
 * and aggregation with independent faculty members.
 */
package ObjectModeling;
import java.util.ArrayList;
class Faculty {
    private final String name;
    public Faculty(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Faculty name cannot be empty.");
        }
        this.name = name.trim();
    }
    public String getName() {
        return name;
    }
    public void displayDetails() {
        System.out.println("Faculty: " + name);
    }
}
class FacultyUniversity {
    private final String name;
    private final ArrayList<Department> departments;
    private final ArrayList<Faculty> facultyMembers;
    private boolean deleted;
    public FacultyUniversity(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("University name cannot be empty.");
        }
        this.name = name.trim();
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
        this.deleted = false;
    }
    private void checkActive() {
        if (deleted) {
            throw new IllegalStateException("University has been deleted.");
        }
    }
    public void addDepartment(String departmentName) {
        checkActive();
        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty.");
        }
        for (Department department : departments) {
            if (department.name.equalsIgnoreCase(departmentName.trim())) {
                throw new IllegalArgumentException("Department already exists.");
            }
        }
        departments.add(new Department(departmentName.trim()));
    }
    public void addFaculty(Faculty faculty) {
        checkActive();
        if (faculty == null) {
            throw new IllegalArgumentException("Faculty cannot be null.");
        }
        if (!facultyMembers.contains(faculty)) {
            facultyMembers.add(faculty);
        }
    }
    public void displayDetails() {
        if (deleted) {
            System.out.println("University has been deleted.");
            System.out.println("No departments remain.");
            return;
        }
        System.out.println("University: " + name);
        System.out.println("\nDepartments:");
        if (departments.isEmpty()) {
            System.out.println("No departments available.");
        }
        for (Department department : departments) {
            System.out.println("- " + department.name);
        }
        System.out.println("\nFaculty Members:");
        if (facultyMembers.isEmpty()) {
            System.out.println("No faculty members registered.");
        }
        for (Faculty faculty : facultyMembers) {
            faculty.displayDetails();
        }
    }
    public void deleteUniversity() {
        checkActive();
        departments.clear();
        facultyMembers.clear();
        deleted = true;
        System.out.println("University records and departments removed.");
    }
    private static class Department {
        private final String name;
        private Department(String name) {
            this.name = name;
        }
    }
}
public class UniversityDepartmentSystem {
    public static void main(String[] args) {
        // Faculty members are created independently.
        Faculty faculty1 = new Faculty("Dr. Priya");
        Faculty faculty2 = new Faculty("Dr. Karthik");
        FacultyUniversity university = new FacultyUniversity("SRM Institute of Science and Technology");
        // Departments are created internally by the university.
        university.addDepartment("Computer Science");
        university.addDepartment("Mathematics");
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.displayDetails();
        System.out.println("\nDeleting University");
        university.deleteUniversity();
        System.out.println();
        university.displayDetails();
        System.out.println("\nFaculty Members Still Exist Independently");
        faculty1.displayDetails();
        faculty2.displayDetails();
    }
}