/*
 * Question 7: Calculate students' percentages and grades
 * using separate arrays for marks, percentages, and grades.
 */
package Arrays.level2;
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        if (numberOfStudents <= 0) {
            System.out.println("Invalid input. Number of students must be positive.");
            sc.close();
            return;
        }
        // Create arrays to store subject marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        // Read and validate marks for each student
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter Physics marks (0-100): ");
            int physics = sc.nextInt();
            System.out.print("Enter Chemistry marks (0-100): ");
            int chemistry = sc.nextInt();
            System.out.print("Enter Maths marks (0-100): ");
            int maths = sc.nextInt();
            // Retry the same student if any mark is invalid
            if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
                System.out.println("Invalid marks. Enter values from 0 to 100.");
                i--;
                continue;
            }
            marks[i][0] = physics;
            marks[i][1] = chemistry;
            marks[i][2] = maths;
        }
        // Calculate percentages and assign grades
        for (int i = 0; i < marks.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = totalMarks / 3.0;
            // Grade ranges used for this example

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        // Display marks, percentages, and grades
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d, "
                            + "Percentage = %.2f%%, Grade = %s%n", i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentages[i],
                    grades[i]
            );
        }
        sc.close();
    }
}
