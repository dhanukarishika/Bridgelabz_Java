package level2Questions;

import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal=sc.nextDouble();
        System.out.print("Enter annual rate of interest (%): ");
        double rate=sc.nextDouble();
        System.out.print("Enter time in years: ");
        double time=sc.nextDouble();
        double SI=principal*rate*time/100;
        System.out.println("The Simple Interest is INR " +SI+ " for Principal INR " + principal +
                ", Rate of Interest " + rate + "% and Time " + time + " years");
        sc.close();
    }
}
