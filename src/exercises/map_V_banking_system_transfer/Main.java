package exercises.map_V_banking_system_transfer;


import exercises.banking_system_transfer.exceptions.DomainException;
import exercises.map_V_banking_system_transfer.entities.Account;
import exercises.map_V_banking_system_transfer.service.AccountService;

import java.util.*;
// Usando o map para validar se nao havera numero repetido na criacao da conta e para listar.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<Integer, Account> accountMap = new HashMap<>();
        AccountService accountService = new AccountService();
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
                        accountService.addAccount(accountMap, account);
                        break;

                    case 2:
                        System.out.println(accountMap);
                        break;

                    case 3:
                        System.out.println("Account number - FROM ");
                        int num1 = sc.nextInt();
                        System.out.println("Account number - TO ");
                        int num2 = sc.nextInt();
                        System.out.println("Amount transfer ");
                        double amount = sc.nextDouble();
                        accountService.transfer(accountMap, num1, num2, amount);
                        break;

                }
            } while (menu != 0);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}