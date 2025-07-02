package exercises.banking_system_transfer;

import exercises.banking_system_transfer.entities.Account;
import exercises.banking_system_transfer.services.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Account> accountList = new ArrayList<>();
        int menu;
        do {
            System.out.println(
                    "1 - Adicionar cliente\n" +
                            "2 - Listar todos\n" +
                            "3 - Transfer"
            );
            menu = sc.nextInt();
            switch (menu) {

                case 1:
                    sc.nextLine();
                    //Cadastro
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Account number: ");
                    int number = sc.nextInt();
                    System.out.print("Balance: ");
                    double balance = sc.nextDouble();
                    sc.nextLine();

                    Account account = new Account(name, number, balance);
                    accountList.add(account);
                    break;

                case 2:
                    //Opcao transferir
                    //System.out.print("Name: ");
                    //String name1 = sc.nextLine();
                    System.out.print("Account numbernum: ");
                    int num = sc.nextInt();
                    System.out.print("Account number: ");
                    int number1 = sc.nextInt();

                    AccountService accountService = new AccountService();

                    Account origin = accountService.findAccountByNumber(accountList, num);
                    Account destino = accountService.findAccountByNumber(accountList, number1);

                    System.out.println("Amount to transfer: ");
                    double transfer = sc.nextDouble();
                    accountService.transfer(origin, destino, transfer);
                    break;
            }
        }
        while (menu != 0);
        AccountService accountService = new AccountService();
        accountService.list(accountList);
        sc.close();
    }
}
