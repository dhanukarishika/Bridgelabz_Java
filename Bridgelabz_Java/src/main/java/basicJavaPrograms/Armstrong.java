package basicJavaPrograms;

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n, c = 0, sum = 0;
        int temp = n;
        if (n < 0) {
            System.out.println("Not an Armstrong No.");
        } else {
            do {
                c++;
                temp /= 10;
            } while (temp != 0);
            temp = n;
            while (temp != 0) {
                int d = temp % 10;
                sum += (int) Math.pow(d, c);
                temp /= 10;
            }
            if (sum == m) {
                System.out.println("Armstrong No.");
            } else {
                System.out.println("Not an Armstrong No.");
            }
        }
        sc.close();
    }
}
