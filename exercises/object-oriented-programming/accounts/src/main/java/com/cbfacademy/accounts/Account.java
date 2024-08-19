package com.cbfacademy.accounts;

public class Account {
    // Private member variables
    private int accountNumber;
    private double balance;

    // Constructor to initialise the account number and balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit funds into the account
    public double deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return balance;
    }

    // Method to withdraw funds from the account
    public double withdraw(double requested) {
        if (requested > 0 && requested <= balance) {
            balance -= requested;
            return requested;
        }
        return 0; // Return 0 if insufficient funds or invalid amount
    }
}