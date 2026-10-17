package basicJavaPrograms;

import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int c= 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        System.out.println("Number of vowels = " + c);
        sc.close();
    }
}
