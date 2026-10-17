package javaProgrammingElement.level1;


import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double centimetersPerInch=2.54;
        System.out.print("Enter base in inches: ");
        double base=sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double height=sc.nextDouble();
        double areaInches=0.5*base*height;
        double baseCm=base*centimetersPerInch;
        double heightCm=height*centimetersPerInch;
        double areaCm=0.5*baseCm*heightCm;
        System.out.println("Triangle area in square inches is " +areaInches);
        System.out.println("Triangle area in square centimeters is " +areaCm);
        sc.close();
    }
}
