/*
 * Program 10: Generate random marks for students in
 * Physics, Chemistry, and Maths. Calculate total,
 * average, percentage, and grade, and display the
 * results in a tabular format.
 */
package Strings.level2;
import java.util.Scanner;
public class StudentGradeCalculator {
    // Method to generate random two-digit marks for PCM
    public static int[][] generateStudentMarks(int numberOfStudents) {
        int[][] marks = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return marks;
    }
    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    // Method to calculate grade based on percentage
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else if (percentage >= 40) {
            return "E";
        } else {
            return "R";
        }
    }
    // Method to generate grades for all students
    public static String[][] calculateStudentGrades(double[][] results) {
        String[][] grades = new String[results.length][2];
        for (int i = 0; i < results.length; i++) {
            grades[i][0] = String.valueOf(i + 1);
            grades[i][1] = calculateGrade(results[i][2]);
        }
        return grades;
    }
    // Method to display student scorecard
    public static void displayScorecard(int[][] marks,
                                        double[][] results,
                                        String[][] grades) {
        System.out.println("\nStudent Scorecard:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-12s %-8s%n",
                "Student", "Physics", "Chemistry", "Maths",
                "Total", "Average", "Percentage", "Grade");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8s%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        if (numberOfStudents <= 0) {
            System.out.println("Number of students must be positive.");
            sc.close();
            return;
        }
        // Generate random PCM marks
        int[][] marks = generateStudentMarks(numberOfStudents);
        // Calculate total, average, and percentage
        double[][] results = calculateResults(marks);
        // Calculate grades
        String[][] grades = calculateStudentGrades(results);
        // Display scorecard
        displayScorecard(marks, results, grades);
        sc.close();
    }
}