/*
 * This program simulates a bank withdrawal system with balance validation.
 * It demonstrates custom exception handling when a withdrawal amount exceeds the available balance.
 */
package ExceptionHandling.Module1;
import java.util.Scanner;
class InsufficientBanlance extends Exception {
    InsufficientBanlance(String message) {
        System.out.println(message);
    }
}
class BankOperations {
    int balance = 5000;
    // Checks the available balance before processing a withdrawal.
    public void withdraw(int amount) throws InsufficientBanlance {
        if (amount > balance) {
            // Throws a custom exception when the requested amount exceeds the balance.
            throw new InsufficientBanlance("Insufficient balance");
        }
        balance -= amount;
    }
}
public class BankTransactionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankOperations operations = new BankOperations();
        // Attempts the withdrawal and handles the specified exceptions.
        try {
            System.out.println("Enter the amount to withdraw");
            int amount = sc.nextInt();
            operations.withdraw(amount);
        } catch (IllegalArgumentException | InsufficientBanlance e) {
            System.out.println(e.getMessage());
        }
    }
}