package level1Questions;


import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();
        double add=num1+num2;
        double sub=num1-num2;
        double mult=num1*num2;
        System.out.println("Addition: " +add);
        System.out.println("Subtraction: " +sub);
        System.out.println("Multiplication: " +mult);
        if (num2!=0) {
            double div=num1/num2;
            System.out.println("Division: " +div);
        }
        else
        {
            System.out.println("Division is undefined because the divisor is zero");
        }
        sc.close();
    }
}
