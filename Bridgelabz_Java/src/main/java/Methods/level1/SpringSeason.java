/*
 * Program 5: Check whether a given month and day
 * fall within the spring season.
 */
package Methods.level1;
import java.util.Scanner;
public class SpringSeason {

    // Check whether the date falls in the spring season.
    public static boolean isSpringSeason(int month, int day) {
        if (month < 1 || month > 12)
        {
            return false;
        }
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        } else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        } else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        } else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the month and day from the user.
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        // Check the date and display the result.
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
        sc.close();
    }
}