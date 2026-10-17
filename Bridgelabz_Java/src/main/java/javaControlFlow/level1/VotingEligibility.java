/*
 * Question 5: Check whether a person is eligible to vote.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        // Get the person's age
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        // Check voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        }
        else
        {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        // Close the Scanner
        sc.close();
    }
}
