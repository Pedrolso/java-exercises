package exercises.banking_system_transfer.services;

import exercises.banking_system_transfer.entities.Account;
import exercises.banking_system_transfer.exceptions.DomainException;

import java.util.List;

public class AccountService {

    //public AccountService(Account account) {    }

    public void transfer(Account origin, Account destination, double amount) {

        if (origin == null || destination == null) {
            throw new DomainException("One or both accounts were not found");
        }
        if (amount > origin.getBalance()) {
            throw new DomainException("Without sufficient balance for transaction");
        }
        if (amount <= 0) {
            throw new DomainException("only positive values in the transaction");
        }
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

    //Verifica se a conta e existente!
    public void addAccount(List<Account> accounts, Account newAccount) {
        for (Account acc : accounts) {
            if (acc.getNumber().equals(newAccount.getNumber())) {
                throw new DomainException("Account number already exists.");
            }
        }
        accounts.add(newAccount);
    }
}
