package level2Questions;

import java.util.Scanner;
class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit=sc.nextDouble();
        double celsiusResult=(fahrenheit-32)*5.0/9.0;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");
        sc.close();
    }
}
