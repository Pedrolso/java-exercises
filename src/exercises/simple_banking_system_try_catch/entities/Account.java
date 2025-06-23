package exercises.simple_banking_system_try_catch.entities;

import exercises.simple_banking_system_try_catch.exceptions.DomainException;

public class Account {

    private String holder;
    private int number;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(String holder, int number, double balance, double withdrawLimit) {
        this.holder = holder;
        this.number = number;
        if (balance < 0) {
            throw new DomainException("Initial balance cannot be negative.");
        }
        if (withdrawLimit < 0) {
            throw new DomainException("Withdraw limit cannot be negative.");
        }
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    //METHODS
    public void deposit(double amount) {
        balance = getBalance() + amount;
    }

    public void withdraw(double withdraw) {
        if (withdraw > balance) {
            throw new DomainException("Withdraw amount exceeds current balance.");
        }
        if (withdraw > withdrawLimit) {
            throw new DomainException("Withdraw amount exceeds the allowed limit.");
        }
        if (withdraw < 0) {
            throw new DomainException("Withdraw amount must be a positive number.");
        }
        if (withdraw <= withdrawLimit && withdraw <= balance) {
            balance = getBalance() - withdraw;
        }
    }

    @Override
    public String toString() {
        return holder + ", "
                + number + ", "
                + balance + ", "
                + withdrawLimit;
    }
}
