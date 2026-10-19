/*
 * Program 10: Calculate wind chill temperature
 * using temperature and wind speed.
 */
package Methods.level1;
import java.util.Scanner;
public class WindChill {
    // Calculate wind chill using the given formula.
    public static double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74
                + 0.6215 * temperature
                + (0.4275 * temperature - 35.75)
                * Math.pow(windSpeed, 0.16);
        return windChill;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get temperature and wind speed from the user.
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();
        System.out.print("Enter wind speed in miles per hour: ");
        double windSpeed = sc.nextDouble();
        // Validate the inputs.
        if (windSpeed < 0) {
            System.out.println("Invalid input. Wind speed cannot be negative.");
            sc.close();
            return;
        }
        // Calculate and display wind chill.
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is %.2f°F.%n", windChill);
        sc.close();
    }
}
