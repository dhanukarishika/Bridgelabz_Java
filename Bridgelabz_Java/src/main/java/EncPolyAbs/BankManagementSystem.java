/*
  This program demonstrates abstraction, inheritance, polymorphism and interfaces in a Bank Management System.
  It manages savings and current accounts with deposits, withdrawals, interest and loan eligibility.
 */

package EncPolyAbs;

import java.util.ArrayList;
import java.util.List;

// Abstract class containing common properties and methods for bank accounts
abstract class BankAccount{
    int account_number;
    String holder_name;
    private double balance;

    BankAccount(int account_number, String holder_name, double balance){
        // this keyword refers to the current object
        this.account_number = account_number;
        this.holder_name = holder_name;
        this.balance = balance;
    }

    // Adds the given amount to the account balance
    void deposit(double amount){
        balance += amount;
    }

    // Checks the balance and withdraws the amount if it is valid
    void withdraw(double amount){
        if(balance >= amount && amount > 0){
            System.out.println("Withdraw Amount: " + amount);
            balance -= amount;
            System.out.println("Current balance: " + balance);
        }else{
            System.out.println("Amount should be greater than 0(zero) or amount should not be negative");
        }
    }

    // Abstract method that must be implemented by child classes
    abstract void calculateInterest();

}

// Interface containing loan-related methods
interface Lonable{
    public String applyForLoan();
    public void calculateLoanEligibility();
}

// SavingsAccount inherits BankAccount and implements Lonable
class SavingsAccount extends BankAccount implements Lonable{

    double yearly_income;
    boolean isEligibility;
    int principle;
    double annual_interest;
    int years;
    double interest;
    double credit_score;
    int age;
    List<BankAccount> accounts;

    SavingsAccount(int account_number, String name, double balance, double yearly_income, int principle, double annual_interest, int years, double credit_score, int age){
        super(account_number,name,balance);

        this.yearly_income = yearly_income;
        this.principle = principle;
        this.annual_interest = annual_interest;
        this.years = years;
        this.credit_score = credit_score;
        this.age = age;

        // Creates a list to store bank accounts
        this.accounts = new ArrayList<>();
    }

    // Adds a savings account to the list
    public void addAccount(SavingsAccount account){
        accounts.add(account);
    }

    // Overrides the deposit method to validate the amount
    @Override
    void deposit(double amount){
        if(amount < 0){
            System.out.println("Amount should be greater than zero(0)");
        }else{
            super.deposit(amount);
        }
    }

    // Calls the withdraw method of the parent class
    @Override
    void withdraw(double amount){
        super.withdraw(amount);
    }

    // Calculates interest using principal, interest rate and years
    @Override
    void calculateInterest() {
        interest = principle * annual_interest * years;
    }

    // Returns the loan approval status
    public String applyForLoan(){
        if(isEligibility){
            return "Loan Approved";
        }else{
            return "Loan Not Approved";
        }
    }

    // Checks whether the customer satisfies all loan eligibility conditions
    public void calculateLoanEligibility(){
        if(age >= 18 && yearly_income > 500000 && credit_score >= 80){
            isEligibility = true;
        }
    }

    // Displays savings account details
    public void displayAccountDetails(){
        System.out.println("Savings Accounts");

        // Iterates through all accounts stored in the list
        for(BankAccount account : accounts){
            System.out.println("Account Number: " + account.account_number);
            System.out.println("Account holder: " + account.holder_name);
            System.out.println("Yearly Income: " + yearly_income);
            System.out.println("Total Interest: " + interest);
            System.out.println("Loan Eligibility: " + isEligibility);
            System.out.println("Loan Status: " + applyForLoan());
            System.out.println();
        }

    }

}

// CurrentAccount inherits BankAccount and implements Lonable
class CurrentAccount extends BankAccount implements Lonable{

    double yearly_income;
    boolean isEligibility;
    int principle;
    double annual_interest;
    int years;
    double interest;
    double credit_score;
    int age;
    List<BankAccount> accounts;

    CurrentAccount(int account_number, String name, double balance, double yearly_income, int principle, double annual_interest, int years, double credit_score, int age){
        super(account_number,name,balance);

        this.yearly_income = yearly_income;
        this.principle = principle;
        this.annual_interest = annual_interest;
        this.years = years;
        this.credit_score = credit_score;
        this.age = age;

        // Creates a list to store bank accounts
        this.accounts = new ArrayList<>();
    }

    // Adds a current account to the list
    public void addAccount(CurrentAccount account){
        accounts.add(account);
    }

    // Overrides the deposit method to validate the amount
    @Override
    void deposit(double amount){
        if(amount < 0){
            System.out.println("Amount should be greater than zero(0)");
        }else{
            super.deposit(amount);
        }
    }

    // Calls the withdraw method of the parent class
    @Override
    void withdraw(double amount){
        super.withdraw(amount);
    }

    // Calculates interest using principal, interest rate and years
    @Override
    void calculateInterest() {
        interest = principle * annual_interest * years;
    }

    // Returns the loan approval status
    public String applyForLoan(){
        if(isEligibility){
            return "Loan Approved";
        }else{
            return "Loan Not Approved";
        }
    }

    // Checks whether the customer satisfies all loan eligibility conditions
    public void calculateLoanEligibility(){
        if(age >= 18 && yearly_income > 500000 && credit_score >= 80){
            isEligibility = true;
        }
    }

    // Displays current account details
    public void displayAccountDetails(){
        System.out.println("Current Accounts");

        // Iterates through all accounts stored in the list
        for(BankAccount account : accounts){
            System.out.println("Account Number: " + account.account_number);
            System.out.println("Account holder: " + account.holder_name);
            System.out.println("Yearly Income: " + yearly_income);
            System.out.println("Total Interest: " + interest);
            System.out.println("Loan Eligibility: " + isEligibility);
            System.out.println("Loan Status: " + applyForLoan());
            System.out.println();
        }

    }
}

// Main class for creating and managing bank account objects
public class BankManagementSystem {
    public static void main(String[] args){

        // Creates a savings account object
        SavingsAccount account = new SavingsAccount(4823,"Akhil",50000,1500000,2500,25,5,80,18);

        // Adds the savings account to the account list
        account.addAccount(account);

        // Deposits money into the savings account
        account.deposit(50000);

        // Calculates the interest for the account
        account.calculateInterest();

        // Checks the loan application status
        account.applyForLoan();

        // Calculates loan eligibility based on customer details
        account.calculateLoanEligibility();

        // Displays the savings account details
        account.displayAccountDetails();


        // Creates a current account object
        CurrentAccount currentAccount = new CurrentAccount(5894,"Charan",90000,15094092,5832,12,3,95,20);

        // Adds the current account to the account list
        currentAccount.addAccount(currentAccount);

        // Deposits money into the current account
        currentAccount.deposit(80000);

        // Calculates the interest for the account
        currentAccount.calculateInterest();

        // Checks the loan application status
        currentAccount.applyForLoan();

        // Calculates loan eligibility based on customer details
        currentAccount.calculateLoanEligibility();

        // Displays the current account details
        currentAccount.displayAccountDetails();

    }
}