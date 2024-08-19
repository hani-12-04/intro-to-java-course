package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    // Constructor to initialise the account number, balance, and overdraft limit
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Getter for overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Setter for overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double withdraw(double requested) {
        double availableBalance = getBalance() + overdraftLimit;
        if (requested > 0 && requested <= availableBalance) {
            return super.withdraw(requested); // Withdraw from base class
        }
        return 0; // Return 0 if insufficient funds or invalid amount
    }
}