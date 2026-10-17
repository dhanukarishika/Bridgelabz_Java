package javaProgrammingElement.basicJavaPrograms;

import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int orig=n;
        int rev=0;
        while(n!=0)
        {
            int d=n%10;
            rev=rev*10+d;
            n/=10;
        }
        if(rev==orig)
        {
            System.out.println("Palindrome No.");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
