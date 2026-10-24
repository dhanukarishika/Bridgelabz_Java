/*
 * Q2. Bank and Account Holders
 * Demonstrate association by linking customers
 * and banks through multiple accounts.
 */
package ObjectModeling;
import java.util.ArrayList;
class Customer {
    private final String name;
    private final ArrayList<Account> accounts;
    public Customer(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        this.name = name.trim();
        this.accounts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    void addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }
    public void viewBalance() {
        System.out.println("Customer: " + name);
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.printf("Balance: Rs. %.2f%n", account.getBalance());
            System.out.println();
        }
    }
}
class Account {
    private final String accountNumber;
    private final Bank bank;
    private final Customer customer;
    private final double balance;
    public Account(String accountNumber, Bank bank, Customer customer, double balance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        if (bank == null || customer == null) {
            throw new IllegalArgumentException("Bank and customer are required.");
        }
        if (!Double.isFinite(balance) || balance < 0) {
            throw new IllegalArgumentException("Balance must be a valid non-negative number.");
        }
        this.accountNumber = accountNumber.trim();
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public Bank getBank() {
        return bank;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getBalance() {
        return balance;
    }
}
class Bank {
    private final String name;
    private final ArrayList<Account> accounts;
    public Bank(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Bank name cannot be empty.");
        }
        this.name = name.trim();
        this.accounts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public void openAccount(Customer customer, String accountNumber, double openingBalance) {
        if (accountNumber == null || accountNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be empty.");
        }
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber.trim())) {
                throw new IllegalArgumentException("Account number already exists in this bank.");
            }
        }
        Account account = new Account(accountNumber, this, customer, openingBalance);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account " + account.getAccountNumber()
                + " opened for " + customer.getName() + " at " + name + ".");
    }
}
public class BankCustomerAssociation {
    public static void main(String[] args) {
        Bank bank1 = new Bank("City Bank");
        Bank bank2 = new Bank("National Bank");
        Customer customer1 = new Customer("Rishika");
        Customer customer2 = new Customer("Vaidehi");
        bank1.openAccount(customer1, "00101", 5000);
        bank1.openAccount(customer1, "00102", 3000);
        bank2.openAccount(customer1, "00201", 7000);
        bank1.openAccount(customer2, "00103", 4000);
        System.out.println("\nCustomer Account Balances");
        customer1.viewBalance();
        customer2.viewBalance();
    }
}