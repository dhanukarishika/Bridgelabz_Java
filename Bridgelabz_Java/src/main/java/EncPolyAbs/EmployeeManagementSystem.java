/*
  This program demonstrates abstraction, inheritance, encapsulation and method overriding in an Employee Management System.
  It manages full-time and part-time employees using setters, getters and salary calculation methods.
 */

package EncPolyAbs;

// Abstract class containing common employee details and methods
abstract class Employee{
    int emp_id;
    String name;
    double base_salary;

    // Setter method to assign employee ID
    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;
    }

    // Setter method to assign employee name
    public void setName(String name){
        this.name = name;
    }

    // Setter method to assign base salary
    public void setBase_salary(double base_salary){
        this.base_salary = base_salary;
    }

    // Getter method to return employee ID
    public int getEmp_id(){
        return emp_id;
    }

    // Getter method to return employee name
    public String getName(){
        return name;
    }

    // Getter method to return base salary
    public double getBase_salary(){
        return base_salary;
    }

    // Abstract method that must be implemented by child classes
    abstract void calculateSalary();

    // Displays the common employee details
    public void displayDetails(){
        System.out.println("Emp id: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + base_salary);
    }

}

// FullTimeEmployee inherits from Employee
class FullTimeEmployee extends Employee{
    int salary;

    FullTimeEmployee(int salary){
        // Assigns the fixed salary to the employee
        this.salary = salary;
    }

    // Implements the abstract salary calculation method
    public void calculateSalary(){
        System.out.println("This is Full time Employee class, salary is fixed: " + salary);
    }
}

// PartTimeEmployee inherits from Employee
class PartTimeEmployee extends Employee{
    int salary;
    int hours;

    PartTimeEmployee(int salary, int hours){
        // Initializes salary and working hours
        this.salary = salary;
        this.hours = hours;
    }

    // Calculates salary based on salary per hour and working hours
    public void calculateSalary(){
        System.out.println("Total salary of an Part time Employee");
        System.out.println("Salary: " + (salary * hours));
    }
}

// Interface defining department-related operations
interface Department{
    void assignDepartment();
    void getDepartmentDetails();
}

// Main class for managing employee objects
public class EmployeeManagementSystem {
    public static void main(String[] args){

        // Creates a full-time employee object
        FullTimeEmployee full_time = new FullTimeEmployee(43000);

        // Creates a part-time employee object
        PartTimeEmployee part_time = new PartTimeEmployee(5000,5);

        // Assigns details to the full-time employee
        full_time.setName("Akhil");
        full_time.setEmp_id(34321431);
        full_time.setBase_salary(40000);

        // Assigns details to the part-time employee
        part_time.setEmp_id(8687646);
        part_time.setName("charan");
        part_time.setBase_salary(3000);

        // Calculates and displays the full-time employee salary
        full_time.calculateSalary();

        // Gets the employee ID using the getter method
        int id = full_time.getEmp_id();
        System.out.println("id: " + id);

        // Gets the employee name using the getter method
        String name = full_time.getName();
        System.out.println("name: " + name);

        // Gets the base salary using the getter method
        double salary = full_time.getBase_salary();
        System.out.println("Salary: " + salary);

        System.out.println();

        // Calculates and displays the part-time employee salary
        part_time.calculateSalary();

        // Gets the part-time employee name
        String name1 = part_time.getName();
        System.out.println("Name: " + name1);

        // Gets the part-time employee ID
        int id1 = part_time.getEmp_id();
        System.out.println("id: " + id1);

        // Gets the part-time employee base salary
        double salary1 = part_time.getBase_salary();
        System.out.println("Sa1ary: " + salary1);

    }
}