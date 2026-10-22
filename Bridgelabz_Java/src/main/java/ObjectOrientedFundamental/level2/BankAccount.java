/*
 * Q2. Simulate an ATM
 * Create a BankAccount class with methods to deposit,
 * withdraw, and display the current balance.
 */
package ObjectOrientedFundamental.level2;
import java.util.Scanner;
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Opening balance must be a valid non-negative number.");
        }
        this.balance = balance;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        this.accountHolder = accountHolder.trim();
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        this.accountNumber = accountNumber.trim();
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Deposit amount must be a positive number.");
            return;
        }
        if (!Double.isFinite(balance + amount)) {
            System.out.println("Deposit amount is too large.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited: Rs. %.2f%n", amount);
    }
    public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            System.out.println("Withdrawal amount must be a positive number.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.printf("Withdrawn: Rs. %.2f%n", amount);
    }
    public void displayBalance() {
        System.out.printf("Current Balance: Rs. %.2f%n", balance);
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter account holder name: ");
            String accountHolder = scanner.nextLine();
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();
            System.out.print("Enter opening balance: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Opening balance must be a number.");
                return;
            }
            double balance = scanner.nextDouble();
            try {
                BankAccount account = new BankAccount(accountHolder, accountNumber, balance);
                int choice=0;
                do {
                    System.out.println("\nATM Menu");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Display Balance");
                    System.out.println("4. Exit");
                    System.out.print("Enter your choice: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Please enter an integer choice.");
                        scanner.next();
                        continue;
                    }
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            if (scanner.hasNextDouble()) {
                                account.deposit(scanner.nextDouble());
                            } else {
                                System.out.println("Amount must be a number.");
                                scanner.next();
                            }
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            if (scanner.hasNextDouble()) {
                                account.withdraw(scanner.nextDouble());
                            } else {
                                System.out.println("Amount must be a number.");
                                scanner.next();
                            }
                            break;
                        case 3:
                            account.displayBalance();
                            break;
                        case 4:
                            System.out.println("Thank you for using the ATM.");
                            break;
                        default:
                            System.out.println("Please choose from 1 to 4.");
                    }
                } while (choice != 4);
            } catch (IllegalArgumentException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}