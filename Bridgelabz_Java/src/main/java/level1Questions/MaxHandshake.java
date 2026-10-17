package level1Questions;

import java.util.Scanner;
class MaxHandshake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents=sc.nextInt();
        int totHandshakes=numberOfStudents*(numberOfStudents-1) /2;
        System.out.println("The maximum number of handshakes is " + totHandshakes);
        sc.close();
    }
}
