
package LinkedList.Single;

/*
 * Q1. Singly Linked List: Student Record Management
 * Add, delete, search, display, and update student records.
 */

public class StudentRecordManagement {

    // Node to store student details
    static class Student {
        int rollNo, age;
        String name, grade;
        Student next;

        Student(int rollNo, String name, int age, String grade) {
            this.rollNo = rollNo;
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    }

    static Student head = null, tail = null;

    // Add at beginning
    static void addBeginning(int roll, String name, int age, String grade) {
        Student newNode = new Student(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
        if (tail == null) tail = newNode;
    }

    // Add at end
    static void addEnd(int roll, String name, int age, String grade) {
        Student newNode = new Student(roll, name, age, grade);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Add at specific position (1-based)
    static void addPosition(int pos, int roll, String name, int age, String grade) {
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            addBeginning(roll, name, age, grade);
            return;
        }

        Student temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        Student newNode = new Student(roll, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) tail = newNode;
    }

    // Delete by roll number
    static void delete(int roll) {
        if (head == null) return;

        if (head.rollNo == roll) {
            Student deleted = head;
            head = head.next;
            if (head == null) tail = null;
            deleted.next = null;
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != roll)
            temp = temp.next;

        if (temp.next != null) {
            Student deleted = temp.next;
            temp.next = deleted.next;
            if (deleted == tail) tail = temp;
            deleted.next = null;
        }
    }

    // Search by roll number
    static void search(int roll) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    static void updateGrade(int roll, String grade) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == roll) {
                temp.grade = grade;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    static void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " | " + temp.name + " | "
                    + temp.age + " | " + temp.grade);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addBeginning(101, "Rishika", 21, "A");
        addEnd(102, "Vaidehi", 21, "B");
        addPosition(2, 103, "Ananya", 20, "C");

        display();
        search(102);
        updateGrade(103, "A");
        delete(101);

        System.out.println("\nUpdated Records:");
        display();
    }
}
