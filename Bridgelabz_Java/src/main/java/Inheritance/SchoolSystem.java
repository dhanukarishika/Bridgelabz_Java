/*
 * This program demonstrates hierarchical inheritance in Java using a school system.
 * Teacher, Student, and Staff inherit common details from the Person class and have their own roles.
 */

package Inheritance;

import javax.security.auth.Subject;

class Person{
    String name;
    int age;

    // Constructor to initialize common person details
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person{
    String subject;

    // Calls the parent constructor and initializes the teacher's subject
    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    // Displays the role of the teacher
    public void displayRole(){
        System.out.println("I am Tecaher");
    }
}

class Student extends Person{
    char grade;

    // Calls the parent constructor and initializes the student's grade
    Student(String name, int age, char grade){
        super(name, age);
        this.grade = grade;
    }

    // Displays the role of the student
    public void displayRole(){
        System.out.println("I am Student");
    }
}

class Staff extends Person{
    int salary;

    // Calls the parent constructor and initializes the staff salary
    Staff(String name, int age, int salary){
        super(name, age);
        this.salary = salary;
    }

    // Displays the role of the staff member
    public void displayRole(){
        System.out.println("I am Staff");
    }
}


public class SchoolSystem {
    public static void main(String[] args){

        // Creating objects for different roles in the school
        Teacher teacher = new Teacher("prasanna",45,"maths");
        Student student = new Student("akhil",20,'O');
        Staff staff = new Staff("Ravi",30,20000);

        // Calling the role method for each school member
        teacher.displayRole();
        System.out.println();
        student.displayRole();
        System.out.println();
        staff.displayRole();
    }
}