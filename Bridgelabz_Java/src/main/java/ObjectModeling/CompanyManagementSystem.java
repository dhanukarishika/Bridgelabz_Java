/*
 * Q3. Company and Departments
 * Demonstrate composition through company-owned
 * departments and department-owned employees.
 */
package ObjectModeling;

import java.util.ArrayList;

class Company {
    private final String companyName;
    private final ArrayList<Department> departments;
    private boolean deleted;

    public Company(String companyName) {
        if (companyName == null || companyName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Company name cannot be empty."
            );
        }

        this.companyName = companyName.trim();
        this.departments = new ArrayList<>();
        this.deleted = false;
    }

    public void addDepartment(String departmentName) {
        checkActive();

        if (departmentName == null || departmentName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Department name cannot be empty."
            );
        }

        if (findDepartment(departmentName) != null) {
            throw new IllegalArgumentException("Department already exists.");
        }

        departments.add(new Department(departmentName.trim()));
    }

    public void addEmployee(String departmentName, int employeeId,
                            String employeeName) {
        checkActive();

        Department department = findDepartment(departmentName);

        if (department == null) {
            throw new IllegalArgumentException("Department not found.");
        }

        if (employeeId <= 0) {
            throw new IllegalArgumentException(
                    "Employee ID must be positive."
            );
        }

        if (employeeName == null || employeeName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Employee name cannot be empty."
            );
        }

        department.addEmployee(employeeId, employeeName.trim());
    }

    private Department findDepartment(String departmentName) {
        if (departmentName == null) {
            return null;
        }

        for (Department department : departments) {
            if (department.name.equalsIgnoreCase(departmentName.trim())) {
                return department;
            }
        }

        return null;
    }

    private void checkActive() {
        if (deleted) {
            throw new IllegalStateException("Company has been deleted.");
        }
    }

    public void displayDetails() {
        if (deleted) {
            System.out.println("Company has been deleted.");
            System.out.println("No departments or employees remain.");
            return;
        }

        System.out.println("Company: " + companyName);

        for (Department department : departments) {
            department.displayDetails();
        }
    }

    public void deleteCompany() {
        checkActive();

        for (Department department : departments) {
            department.employees.clear();
        }

        departments.clear();
        deleted = true;

        System.out.println("Company and its internal records removed.");
    }

    private static class Department {
        private final String name;
        private final ArrayList<Employee> employees;

        private Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        private void addEmployee(int employeeId, String employeeName) {
            employees.add(new Employee(employeeId, employeeName));
        }

        private void displayDetails() {
            System.out.println("\nDepartment: " + name);

            for (Employee employee : employees) {
                employee.displayDetails();
            }
        }

        private static class Employee {
            private final int id;
            private final String name;

            private Employee(int id, String name) {
                this.id = id;
                this.name = name;
            }

            private void displayDetails() {
                System.out.println("Employee ID: " + id
                        + ", Name: " + name);
            }
        }
    }
}

public class CompanyManagementSystem {
    public static void main(String[] args) {
        Company company = new Company("Akhil Technology");

        company.addDepartment("HR");
        company.addDepartment("Development");

        company.addEmployee("HR", 101, "Rishika");
        company.addEmployee("Development", 102, "Vaidehi");
        company.addEmployee("Development", 103, "Akhil");

        company.displayDetails();

        System.out.println("\nDeleting Company");
        company.deleteCompany();

        System.out.println();
        company.displayDetails();
    }
}