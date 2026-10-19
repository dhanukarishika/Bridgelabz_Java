/*
 * Question 1: Check whether 10 students are eligible to vote
 * based on their ages.
 */
package Arrays.level1;
import java.util.Scanner;
// Class to check voting eligibility of students
public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Declare an array to store the ages of 10 students
        int[] ages = new int[10];
        // Get the ages of all students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        // Check the voting eligibility of each student
        for (int i = 0; i < ages.length; i++) {
            // Validate the student's age
            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i]
                        + " can vote.");
            } else {
                System.out.println("The student with age " + ages[i]
                        + " cannot vote.");
            }
        }
        // Close the Scanner
        sc.close();
    }
}