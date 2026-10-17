package level2Questions;

import java.util.Scanner;
public class QuotientRemainder {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no.:");
        double num1=sc.nextDouble();
        System.out.println("Enter 2nd no.:");
        double num2=sc.nextDouble();
        if(num2!=0)
        {
            double quotient=num1/num2;
            double remainder=num1%num2;
            System.out.println("The Quotient is " + quotient +" and Remainder is " + remainder +
                    " of two numbers " + num1 + " and " + num2);
        }
        else {
            System.out.println("Division by zero is not allowed");
        }
        sc.close();
    }
}
