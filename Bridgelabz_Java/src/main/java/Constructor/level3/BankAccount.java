/*
 * Q3. Bank Account Management
 * Demonstrate access modifiers using BankAccount
 * and its subclass SavingsAccount.
 */
package Constructor.level3;
public class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        this.accountNumber = accountNumber.trim();
        this.accountHolder = accountHolder.trim();
        setBalance(balance);
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Balance must be a valid non-negative number.");
        }
        this.balance = balance;
    }
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("00123456789", "Rishika Dhanuka", 5000);
        System.out.println("Savings Account Details");
        account.displayDetails();
        // Public members can be accessed directly.
        System.out.println("\nPublic Account Number: " + account.accountNumber);
        account.setBalance(6500);
        System.out.println("\nAfter Updating Balance");
        account.displayDetails();
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        // The subclass can directly access the protected accountHolder.
        System.out.println("Account Holder: " + accountHolder);
        // Private balance is accessed through its public getter.
        System.out.printf("Balance: Rs. %.2f%n", getBalance());
    }
}