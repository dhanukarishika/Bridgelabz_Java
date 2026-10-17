package javaProgrammingElement.level1;

import java.util.Scanner;
public class FeesCalculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student fee:");
        double fee=sc.nextDouble();
        System.out.println("Enter discount percent:");
        double discountPer=sc.nextDouble();
        double discount=fee*discountPer/100;
        double finalFee=fee-discount;
        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
        sc.close();
    }
}
