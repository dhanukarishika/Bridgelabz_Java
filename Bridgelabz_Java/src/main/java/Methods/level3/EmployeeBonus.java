
/*
 * Program 11: Calculate the bonus and revised salary
 * for ten employees based on their years of service.
 */
package Methods.level3;

public class EmployeeBonus {

    // Generate a random five-digit salary.
    public static int generateSalary() {
        return (int) (Math.random() * 90000) + 10000;
    }

    // Generate random years of service from 1 to 10.
    public static int generateServiceYears() {
        return (int) (Math.random() * 10) + 1;
    }

    // Calculate the bonus based on years of service.
    public static double calculateBonus(double salary, int years) {
        if (years > 5) {
            return salary * 0.05;
        } else {
            return salary * 0.02;
        }
    }

    public static void main(String[] args) {
        int numberOfEmployees = 10;

        // Column 0: salary, Column 1: service years.
        int[][] employeeData = new int[numberOfEmployees][2];

        // Column 0: bonus, Column 1: revised salary.
        double[][] bonusData = new double[numberOfEmployees][2];

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        // Generate employee data and calculate bonuses.
        for (int i = 0; i < numberOfEmployees; i++) {
            employeeData[i][0] = generateSalary();
            employeeData[i][1] = generateServiceYears();

            double salary = employeeData[i][0];
            int years = employeeData[i][1];

            double bonus = calculateBonus(salary, years);
            double newSalary = salary + bonus;

            bonusData[i][0] = bonus;
            bonusData[i][1] = newSalary;

            totalOldSalary += salary;
            totalBonus += bonus;
            totalNewSalary += newSalary;
        }

        // Display employee salary details.
        System.out.println("Employee Salary Report");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n",
                "Employee", "Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.printf("%-10d %-12d %-12d %-12.2f %-12.2f%n",
                    i + 1,
                    employeeData[i][0],
                    employeeData[i][1],
                    bonusData[i][0],
                    bonusData[i][1]);
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f%n",
                "Total", totalOldSalary, "",
                totalBonus, totalNewSalary);
    }
}
