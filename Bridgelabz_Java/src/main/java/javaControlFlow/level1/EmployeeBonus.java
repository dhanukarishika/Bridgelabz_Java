/*
 * Question 17: Calculate a 5% bonus if an employee has
 * more than 5 years of service.
 */
package javaControlFlow.level1;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read salary and years of service
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();
        // Calculate bonus
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
            System.out.println("Total salary: " + (salary + bonus));
        }
        else {
            System.out.println("No bonus.");
        }
        sc.close();
    }
}