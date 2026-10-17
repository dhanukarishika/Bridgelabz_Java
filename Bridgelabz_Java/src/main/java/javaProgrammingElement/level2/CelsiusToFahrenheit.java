package javaProgrammingElement.level2;

import java.util.Scanner;
class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius=sc.nextDouble();
        double fahrenheitResult=(celsius * 9.0 / 5.0) + 32;
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");
        sc.close();
    }
}
