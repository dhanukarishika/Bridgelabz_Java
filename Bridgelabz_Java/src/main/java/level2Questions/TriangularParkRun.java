package level2Questions;

import java.util.Scanner;
public class TriangularParkRun {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int targetDistance = 5000;
        System.out.print("Enter 1st side in meters: ");
        double s1=sc.nextDouble();
        System.out.print("Enter 2nd side in meters: ");
        double s2=sc.nextDouble();
        System.out.print("Enter 3rd side in meters: ");
        double s3=sc.nextDouble();
        double perimeter=s1+s2+s3;
        double totRounds=targetDistance/perimeter;
        System.out.println("The total number of rounds the athlete " + "will run is " + totRounds +
                " to complete 5 km");
        sc.close();
    }
}
