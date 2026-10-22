/*
 * Q4. Employee Records
 * Demonstrate access modifiers using Employee
 * and its subclass Manager.
 */
package Constructor.level3;
public class Employee {
    public String employeeID;
    protected String department;
    private double salary;
    public Employee(String employeeID, String department, double salary) {
        if (employeeID == null || employeeID.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee ID cannot be empty.");
        }
        if (department == null || department.trim().isEmpty()) {
            throw new IllegalArgumentException("Department cannot be empty.");
        }
        this.employeeID = employeeID.trim();
        this.department = department.trim();
        setSalary(salary);
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException("Salary must be a valid non-negative number.");
        }
        this.salary = salary;
    }
    public static void main(String[] args) {
        Manager manager = new Manager("EMP101", "Finance", 60000);
        System.out.println("Manager Details");
        manager.displayDetails();
        // Public members can be accessed directly.
        System.out.println("\nPublic Employee ID: " + manager.employeeID);
        manager.setSalary(65000);
        System.out.println("\nAfter Updating Salary");
        manager.displayDetails();
    }
}
class Manager extends Employee {
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        // The subclass can directly access the protected department.
        System.out.println("Department: " + department);
        // Private salary is accessed through its public getter.
        System.out.printf("Salary: Rs. %.2f%n", getSalary());
    }
}