package javaProgrammingElement.level2;

import java.util.Scanner;
public class DivideChocolates
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates=sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren=sc.nextInt();
        if (numberOfChildren>0 && numberOfChocolates>=0)
        {
            int chocPerChild=numberOfChocolates/numberOfChildren;
            int remainingChoc=numberOfChocolates%numberOfChildren;
            System.out.println("The number of chocolates each child " + "gets is " + chocPerChild +
                    " and the number of remaining chocolates are " + remainingChoc);
        }
        else {
            System.out.println("enter a positive number of children and a non-negative number of chocolates");
        }
        sc.close();
    }
}
