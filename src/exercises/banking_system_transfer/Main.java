package exercises.banking_system_transfer;

import exercises.banking_system_transfer.entities.Account;
import exercises.banking_system_transfer.exceptions.DomainException;
import exercises.banking_system_transfer.services.AccountService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Account> accountList = new ArrayList<>();
        AccountService accountServiceList = new AccountService();
        try {
            int menu;
            do {
                System.out.println("Select an option:");
                System.out.println(
                        "1 - Add customer\n" +
                                "2 - List\n" +
                                "3 - Transfer\n" +
                                "0 - Exit"
                );
                menu = sc.nextInt();
                switch (menu) {

                    case 1:
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Account number: ");
                        int number = sc.nextInt();
                        System.out.print("Balance: ");
                        double balance = sc.nextDouble();
                        sc.nextLine();

                        Account account = new Account(name, number, balance);
                        accountServiceList.addAccount(accountList, account);
                        break;

                    case 2:
                        accountServiceList.list(accountList);
                        System.out.println();
                        break;

                    case 3:
                        System.out.print("Account number FROM: ");
                        int num = sc.nextInt();
                        System.out.print("Account number TO: ");
                        int number1 = sc.nextInt();

                        AccountService accountService = new AccountService();

                        Account origin = accountService.findAccountByNumber(accountList, num);
                        Account destino = accountService.findAccountByNumber(accountList, number1);

                        System.out.print("Amount to transfer: ");
                        double transfer = sc.nextDouble();
                        accountService.transfer(origin, destino, transfer);
                        break;
                }
            }
            while (menu != 0);
            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
