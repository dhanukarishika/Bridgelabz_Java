/*
 * This program demonstrates inheritance using different types of bank accounts.
 * Savings, Checking, and Fixed Deposit accounts inherit common details from BankAccount.
 */

package Inheritance;

class BankAccount{
    int account_number;
    int balance;

    // Constructor to initialize common bank account details
    BankAccount(int account_number, int balance){
        this.account_number = account_number;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount{
    int intrest_rate;

    // Calls the parent constructor and initializes the interest rate
    SavingsAccount(int account_number, int balance, int intrest_rate){
        super(account_number,balance);
        this.intrest_rate = intrest_rate;
    }

    // Displays the type of bank account
    public void displayAccountType(){
        System.out.println("This is Savings Account");
    }
}

class ChekingAccount extends BankAccount{
    int withdraw_limit;

    // Calls the parent constructor and initializes the withdrawal limit
    ChekingAccount(int account_number, int balance, int withdraw_limit){
        super(account_number,balance);
        this.withdraw_limit = withdraw_limit;
    }

    // Displays the type of bank account
    public void displayAccountType(){
        System.out.println("This is Checking Account");
    }
}

class FixedDepositLimit extends BankAccount{
    int fixed_amount;

    // Calls the parent constructor and initializes the fixed deposit amount
    FixedDepositLimit(int account_number, int balance, int fixed_amount){
        super(account_number,balance);
        this.fixed_amount = fixed_amount;
    }

    // Displays the type of bank account
    public void displayAccountType(){
        System.out.println("This is Fixed Deposit Account Account");
    }
}


public class BankAccountSystem {
    public static void main(String[] args){

        // Creating objects for different types of bank accounts
        SavingsAccount savings = new SavingsAccount(1253423,50000,2);
        ChekingAccount cheking = new ChekingAccount(42433212,43000,100000);
        FixedDepositLimit fixed_deposit = new FixedDepositLimit(432932, 90000, 5000);

        // Calling the method of each account to display its type
        savings.displayAccountType();
        System.out.println();
        cheking.displayAccountType();
        System.out.println();
        fixed_deposit.displayAccountType();
    }
}