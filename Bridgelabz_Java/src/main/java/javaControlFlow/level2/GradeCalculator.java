/*
 * Question 3: Calculate average marks, grade, and remarks
 * based on marks in Physics, Chemistry, and Maths.
 */
package javaControlFlow.level2;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        // Create Scanner and read subject marks
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks (out of 100): ");
        double physicsMarks = sc.nextDouble();
        System.out.print("Enter Chemistry marks (out of 100): ");
        double chemistryMarks = sc.nextDouble();
        System.out.print("Enter Maths marks (out of 100): ");
        double mathsMarks = sc.nextDouble();
        // Validate marks
        if (physicsMarks < 0 || physicsMarks > 100
                || chemistryMarks < 0 || chemistryMarks > 100
                || mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid marks. Enter marks from 0 to 100.");
        } else {
            // Calculate average percentage
            double averageMark = (physicsMarks + chemistryMarks + mathsMarks) / 3;
            // Determine grade and remarks
            String grade;
            String remarks;
            if (averageMark >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (averageMark >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (averageMark >= 60) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (averageMark >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (averageMark >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }
            // Display average, grade, and remarks
            System.out.printf("Average Mark: %.2f%%%n", averageMark);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);
        }
        // Close Scanner
        sc.close();
    }
}