package level2Questions;

import java.util.Scanner;
public class WeightConverter
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight=sc.nextDouble();
        double weightInKg=weight/2.2;
        System.out.println("The weight of the person in pound is "+weight+" and in kg is "+weightInKg);
        sc.close();
    }
}
