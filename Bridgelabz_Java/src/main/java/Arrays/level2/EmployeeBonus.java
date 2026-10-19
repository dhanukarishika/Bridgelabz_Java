/*
 * Question 1: Calculate employee bonuses based on years of
 * service and display total old salary, bonus, and new salary.
 */
package Arrays.level2;
import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Define the number of employees and required arrays
        int employeeCount = 10;
        double[] salaries = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];
        double[] bonuses = new double[employeeCount];
        double[] newSalaries = new double[employeeCount];
        // Initialize totals
        double totalOldSalary = 0.0;
        double totalBonus = 0.0;
        double totalNewSalary = 0.0;
        // Read and validate employee details
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.print("Enter monthly salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double service = sc.nextDouble();
            // Validate inputs and retry the same employee if invalid
            if (salary <= 0 || service < 0) {
                System.out.println("Invalid input. Salary must be positive and service years cannot be negative.");
                i--;
                continue;
            }
            salaries[i] = salary;
            yearsOfService[i] = service;
        }
        // Calculate each employee's bonus and new salary
        for (int i = 0; i < salaries.length; i++) {
            double bonusRate;
            if (yearsOfService[i] > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }
            bonuses[i] = salaries[i] * bonusRate;
            newSalaries[i] = salaries[i] + bonuses[i];
            // Update overall totals
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }
        // Display each employee's salary details
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < salaries.length; i++) {
            System.out.printf(
                    "Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                    i + 1, salaries[i], bonuses[i], newSalaries[i]
            );
        }
        // Display company totals
        System.out.printf("%nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
        sc.close();
    }
}
