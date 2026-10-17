package basicJavaPrograms;

import java.util.Scanner;
public class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=n>1;
        for(int i=2;i<=n/i;i++)
        {
            if(n%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("Prime No.");
        }
        else {
            System.out.println("Not Prime");
        }
        sc.close();
    }
}
