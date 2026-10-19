
package Arrays.level2;

import java.util.Scanner;

// Question 8: Calculate students' percentages and grades using a 2D array.
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of students.
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents <= 0) {
            System.out.println("Invalid number of students.");
            sc.close();
            return;
        }

        // Store Physics, Chemistry, and Maths marks in a 2D array.
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks for each student.
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.println("Enter Physics marks (0-100):");
            marks[i][0] = sc.nextInt();

            System.out.println("Enter Chemistry marks (0-100):");
            marks[i][1] = sc.nextInt();

            System.out.println("Enter Maths marks (0-100):");
            marks[i][2] = sc.nextInt();
            // Validate marks and repeat input for the same student if invalid.
            boolean validMarks = true;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 0 || marks[i][j] > 100) {
                    validMarks = false;
                    break;
                }
            }
            if (!validMarks) {
                System.out.println(
                        "Invalid marks! Enter marks between 0 and 100 again."
                );
                i--;
                continue;
            }
            // Calculate the percentage.
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = totalMarks / (double) marks[i].length;
            // Assign grades according to the given guidelines.
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
        // Display marks, percentages, and grades.
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%%n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
        }
        sc.close();
    }
}
