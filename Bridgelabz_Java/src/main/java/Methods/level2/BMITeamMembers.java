/*
 * Program 10: Calculate and display the height, weight,
 * BMI, and weight status of 10 team members using a
 * two-dimensional array.
 */
package Methods.level2;
import java.util.Scanner;
public class BMITeamMembers {
    // Calculate BMI using weight in kg and height in meters.
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeters = heightCm / 100.0;
        return weight / (heightMeters * heightMeters);
    }
    // Determine weight status using standard adult BMI categories.
    public static String[] findWeightStatus(double[][] personData)
    {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++)
        {
            double bmi = personData[i][2];
            if (bmi < 18.5)
            {
                status[i] = "Underweight";
            }
            else if (bmi < 25.0)
            {
                status[i] = "Normal";
            }
            else if (bmi < 40.0)
            {
                status[i] = "Overweight";
            }
            else
            {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPersons = 10;
        // Columns: weight (kg), height (cm), and BMI.
        double[][] personData = new double[numberOfPersons][3];
        // Input weight and height, then calculate BMI.
        for (int i = 0; i < personData.length; i++)
        {
            System.out.println("Team member " + (i + 1));
            System.out.print("Enter weight in kg: ");
            personData[i][0] = sc.nextDouble();
            System.out.print("Enter height in cm: ");
            personData[i][1] = sc.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0)
            {
                System.out.println("Weight and height must be positive.");
                sc.close();
                return;
            }
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }
        // Determine weight status for all team members.
        String[] weightStatus = findWeightStatus(personData);
        // Display the results.
        System.out.println("\nBMI Report");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s%n", "Member", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < personData.length; i++)
        {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s%n", i + 1, personData[i][0], personData[i][1],
                    personData[i][2], weightStatus[i]);
        }
        sc.close();
    }
}