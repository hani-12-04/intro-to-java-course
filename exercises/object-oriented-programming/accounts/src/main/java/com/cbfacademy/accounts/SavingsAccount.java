package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    private double interestRate;

    // Constructor to initialise the account number, balance, and interest rate
    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method to apply interest to the balance
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest); // Using deposit to update balance
    }

    // Getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Setter for interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}