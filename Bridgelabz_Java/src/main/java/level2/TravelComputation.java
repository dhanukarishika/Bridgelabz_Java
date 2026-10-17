package level2Questions;

import java.util.Scanner;
class TravelComputation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter traveler's name: ");
        String name=sc.nextLine();
        System.out.print("Enter starting city: ");
        String fromCity=sc.nextLine();
        System.out.print("Enter intermediate city: ");
        String viaCity=sc.nextLine();
        System.out.print("Enter destination city: ");
        String toCity=sc.nextLine();
        System.out.print("Enter distance from starting to intermediate city (miles): ");
        double distanceFromToVia=sc.nextDouble();
        System.out.print("Enter distance from intermediate to destination (miles): ");
        double distanceViaToFinalCity=sc.nextDouble();
        System.out.print("Enter hours for first journey: ");
        int hoursFirst=sc.nextInt();
        System.out.print("Enter minutes for first journey: ");
        int minutesFirst=sc.nextInt();
        System.out.print("Enter hours for second journey: ");
        int hoursSecond=sc.nextInt();
        System.out.print("Enter minutes for second journey: ");
        int minutesSecond=sc.nextInt();
        int timeFromToVia=hoursFirst*60+minutesFirst;
        int timeViaToFinalCity=hoursSecond*60+minutesSecond;
        double totalDistance=distanceFromToVia+distanceViaToFinalCity;
        int totalTime=timeFromToVia+timeViaToFinalCity;
        int totalHours=totalTime/60;
        int remainingMinutes=totalTime%60;
        System.out.println("Travel details for " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + "\nTotal distance: " + totalDistance + " miles" +
                "\nTotal travel time: " + totalHours + " hours and " + remainingMinutes + " minutes");
        sc.close();
    }
}
