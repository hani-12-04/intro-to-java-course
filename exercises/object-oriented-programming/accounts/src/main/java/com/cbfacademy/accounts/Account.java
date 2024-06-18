package com.cbfacademy.accounts;

public class Account {

private int accountNumber;
private double balance;

public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
    
}

// return the current account balance
public double getBalance(){
    return this.balance;
}

// return account number
public int getAccountNumber(){
    return this.accountNumber;
}

// desposit the funds to the account and return the new balance
public double deposit(double amount){
    this.balance += amount;
    return this.balance;
}

// withdraw funds from the account and returns the requested amount or 0 if the account has an insufficient balance
public double withdraw(double requested){
    if (requested < 0 || this.balance < requested){
        return 0;
    } else {
        this.balance -= requested;
        return requested;
    }
    
}
}

