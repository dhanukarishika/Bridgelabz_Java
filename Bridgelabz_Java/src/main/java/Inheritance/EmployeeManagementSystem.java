/*
 * This program demonstrates inheritance and access modifiers in Java.
 * Different employee roles inherit common employee details and display their specific information.
 */

package Inheritance;

class Employee{
    protected int id;
    public String name;
    private double salary;

    // Constructor to initialize employee details
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Displays the common details of an employee
    public void displsyDetails(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

class Manager extends Employee{
    int teamsize;

    // Calls the parent constructor and initializes team size
    Manager(int id, String name, double salary, int teamsize){
        super(id,name,salary);
        this.teamsize = teamsize;
    }

    // Displays employee details along with manager-specific details
    public void displayDetails(){
        super.displsyDetails();
        System.out.println("team Size: "+teamsize);
    }
}

class Developer extends Employee{
    String programminf_language = "JAVA";

    // Calls the parent constructor and initializes the programming language
    Developer(int id, String name, double salary, String programminf_language){
        super(id,name,salary);
        this.programminf_language = programminf_language;
    }

    // Displays employee details along with developer-specific details
    public void displayDetails(){
        super.displsyDetails();
        System.out.println("Programming Language: "+programminf_language);
    }
}

class Intern extends Employee{
    int duration;

    // Calls the parent constructor and initializes internship duration
    Intern(int id, String name, double salary, int duration){
        super(id,name,salary);
        this.duration = duration;
    }

    // Displays employee details along with intern-specific details
    public void displayDetails(){
        super.displsyDetails();
        System.out.println("Duration: "+duration);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args){

        // Creating objects for different employee roles
        Employee employee = new Employee(122,"charan",120000);
        Manager manager = new Manager(133,"Venkatesh",550000,10);
        Developer developer = new Developer(177,"Akhil",125000,"java");
        Intern intern = new Intern(111,"Vishruth",50000,10);

        // Displaying details of each employee
        employee.displsyDetails();
        System.out.println();
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}