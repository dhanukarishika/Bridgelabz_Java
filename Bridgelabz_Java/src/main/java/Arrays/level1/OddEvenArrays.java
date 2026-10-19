/*
 * Question 7: Store odd and even numbers from 1 to a given
 * natural number in separate arrays and display them.
 */
package Arrays.level1;
import java.util.Scanner;
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get and validate the upper limit
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Invalid input. Please enter a natural number greater than 0.");
            sc.close();
            return;
        }
        // Create arrays to store even and odd numbers
        int[] evenNumbers = new int[number / 2];
        int[] oddNumbers = new int[(number + 1) / 2];
        int evenIndex = 0;
        int oddIndex = 0;
        // Separate numbers into even and odd arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        // Display even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenNumbers.length; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        // Display odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}