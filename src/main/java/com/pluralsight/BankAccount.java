package com.pluralsight;

public abstract class BankAccount implements Valuable {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        double withdrawn;
        if (amount > this.balance) {
            withdrawn = this.balance;
            this.balance = 0;
        } else {
            withdrawn = amount;
            this.balance -= amount;
        }
        return withdrawn;
    }

    public abstract double getBalance();

}
