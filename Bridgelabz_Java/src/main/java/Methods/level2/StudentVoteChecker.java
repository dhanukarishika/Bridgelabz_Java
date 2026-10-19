/*
 * Program 7: Take the ages of 10 students and check
 * whether each student can vote based on age >= 18.
 */
package Methods.level2;
import java.util.Scanner;
public class StudentVoteChecker {
    // Check whether a student is eligible to vote.
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();
        // Input the ages of 10 students.
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        // Display voting eligibility for each student.
        for (int i = 0; i < ages.length; i++) {
            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        sc.close();
    }
}
