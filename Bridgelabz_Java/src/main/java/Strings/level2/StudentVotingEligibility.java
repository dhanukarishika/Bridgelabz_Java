/*
 * Program 8: Generate random two-digit ages for
 * 10 students and check their voting eligibility.
 * Display the results in a tabular format.
 */
package Strings.level2;
import java.util.Scanner;
public class StudentVotingEligibility {
    // Method to generate random two-digit ages
    public static int[] generateStudentAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }
    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }
        return result;
    }
    // Method to display results in tabular format
    public static void displayVotingEligibility(String[][] data) {
        System.out.printf("%-15s %-15s %-20s%n", "Student", "Age", "Can Vote");
        System.out.println("----------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            int age = Integer.parseInt(data[i][0]);
            boolean canVote = Boolean.parseBoolean(data[i][1]);
            System.out.printf("%-15d %-15d %-20b%n", i + 1, age, canVote);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of students
        int numberOfStudents = 10;
        // Generate random ages
        int[] ages = generateStudentAges(numberOfStudents);
        // Check voting eligibility
        String[][] votingResults = checkVotingEligibility(ages);
        // Display results
        displayVotingEligibility(votingResults);
        sc.close();
    }
}
