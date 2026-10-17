package level1Questions;

import java.util.Scanner;
class PurchasePrice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter unit price in INR: ");
        double unitPrice=sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty=sc.nextInt();
        double totPrice=unitPrice*qty;
        System.out.println("The total purchase price is INR " + totPrice + " if the quantity is " + qty +
                " and unit price is INR " + unitPrice);
        sc.close();
    }
}
