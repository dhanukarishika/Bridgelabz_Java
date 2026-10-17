package level1Questions;

import java.util.Scanner;
class FeetDistanceConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int feetPerYard=3;
        int yardsPerMile=1760;
        int feetPerMile = feetPerYard * yardsPerMile;
        System.out.print("Enter distance in feet: ");
        double distanceInFeet=sc.nextDouble();
        double distanceInYards=distanceInFeet/feetPerYard;
        double distanceInMiles=distanceInFeet/feetPerMile;
        System.out.println("Distance in yards is " +distanceInYards);
        System.out.println("Distance in miles is " +distanceInMiles);
        sc.close();
    }
}
