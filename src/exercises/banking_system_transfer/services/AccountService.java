package exercises.banking_system_transfer.services;

import exercises.banking_system_transfer.entities.Account;

import java.util.List;

public class AccountService {

    //public AccountService(Account account) {    }

    public void transfer(Account origin, Account destination, double amount) {
        origin.withdraw(amount);
        destination.deposit(amount);
    }

    public Account findAccountByNumber(List<Account> accounts, int number) {
        for (Account acc : accounts) {
            if (acc.getNumber() == number) {
                return acc;
            }
        }
        return null; // se não achar a conta
    }

    public void list(List<Account> accounts) {
        for (Account e : accounts) {
            System.out.println(e);
        }
    }
}
