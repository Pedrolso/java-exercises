package exercises.banking_system_transfer.entities;

import java.util.List;

public class Account {

    private String holder;
    private Integer number;
    private Double balance;

    public Account(String holder, Integer number, Double balance) {
        this.holder = holder;
        this.number = number;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    //METHODS
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }



    @Override
    public String toString() {
        return holder + ", "
                + number + ", "
                + balance;
    }
}
