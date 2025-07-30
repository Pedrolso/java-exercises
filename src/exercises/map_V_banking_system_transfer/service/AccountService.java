package exercises.map_V_banking_system_transfer.service;

import exercises.banking_system_transfer.exceptions.DomainException;
import exercises.map_V_banking_system_transfer.entities.Account;

import java.util.Map;

public class AccountService {

    public void addAccount(Map<Integer, Account> accountMap, Account newAccount) {
        if (accountMap.containsKey(newAccount.getNumber())) {
            System.out.println("Account number already exists");
        } else {
            accountMap.put(newAccount.getNumber(), newAccount);
        }
    }

    public void transfer(Map<Integer, Account> accountTransfer, int fromNumber, int toNumber, double amount) {
        Account origin = accountTransfer.get(fromNumber);
        Account to = accountTransfer.get(toNumber);

        if (origin == to) {
            throw new DomainException("Source and destination account must be different");
        }
        if (origin == null || to == null) {
            throw new DomainException("One or both accounts were not found");
        }
        if (amount > origin.getBalance()) {
            throw new DomainException("Without sufficient balance for transaction");
        }
        if (amount <= 0) {
            throw new DomainException("only positive values in the transaction");
        }

        origin.withdraw(amount);
        to.deposit(amount);
    }

}
