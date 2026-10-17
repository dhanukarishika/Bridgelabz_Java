/*
 * Question 7: Check whether a given date falls in spring season.
 * Spring season: March 20 to June 20.
 */
package javaControlFlow.level1;
public class SpringSeason {
    public static void main(String[] args) {
        // Read month and day from command-line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        // Check whether the date falls in spring season
        if ((month == 3 && day >= 20 && day <= 31) || month == 4 || month == 5 || (month == 6 && day >= 1 && day <= 20))
        {
            System.out.println("Its a Spring Season");
        }
        else {
            System.out.println("Not a Spring Season");
        }
    }
}
