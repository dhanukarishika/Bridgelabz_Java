/*
 * Q3. Employee Management System
 * Demonstrate static, this, final, and instanceof
 * using employee details and a shared employee counter.
 */
package ThisStaticFinal;

public class Employee {
    private static String companyName = "BridgeLabz";
    private static int totalEmployees = 0;

    private String name;
    private final String id;
    private String designation;

    public Employee(String name, String id, String designation) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be empty.");
        }

        if (designation == null || designation.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Designation cannot be empty."
            );
        }

        this.name = name.trim();
        this.id = id.trim();
        this.designation = designation.trim();
        totalEmployees++;
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

    public String getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        if (designation == null || designation.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Designation cannot be empty."
            );
        }
        this.designation = designation.trim();
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "Rishika Dhanuka", "EMP101", "Software Developer"
        );
        Employee employee2 = new Employee(
                "Vaidehi Mishra", "EMP102", "Test Engineer"
        );

        Object[] employees = {
                employee1, employee2, "Not an employee"
        };

        for (Object object : employees) {
            if (object instanceof Employee) {
                Employee employee = (Employee) object;
                employee.displayDetails();
            } else {
                System.out.println("The object is not an Employee.");
            }
            System.out.println();
        }

        Employee.displayTotalEmployees();
    }
}