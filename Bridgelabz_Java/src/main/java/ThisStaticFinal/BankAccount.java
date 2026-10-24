/*
 * Q1. Bank Account System
 * Demonstrate static, this, final, and instanceof
 * using bank account details.
 */
package ThisStaticFinal;
public class BankAccount {
    private static String bankName = "Bridge Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final String accountNumber;
    public BankAccount(String accountHolderName, String accountNumber) {
        if (accountHolderName == null
                || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        this.accountHolderName = accountHolderName.trim();
        this.accountNumber = accountNumber.trim();
        totalAccounts++;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be empty.");
        }
        this.accountHolderName = accountHolderName.trim();
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Rishika Dhanuka", "00123456789");
        BankAccount account2 = new BankAccount("Vaidehi Mishra", "00987654321");
        Object[] accounts = {account1, account2, "Not a bank account"};
        for (Object object : accounts) {
            if (object instanceof BankAccount) {
                BankAccount account = (BankAccount) object;
                account.displayDetails();
            } else {
                System.out.println("The object is not a BankAccount.");
            }
            System.out.println();
        }
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
    }
}