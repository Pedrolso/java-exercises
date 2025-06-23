package exercises.simple_banking_system_try_catch;


import exercises.simple_banking_system_try_catch.entities.Account;
import exercises.simple_banking_system_try_catch.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Inital balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(holder, number, initialBalance, withdrawLimit);

            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            account.withdraw(withdraw);

            System.out.print("Account: " + account);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input: ");

        } catch (DomainException e) {
            System.out.println("Error domain: " + e.getMessage());
        }

        sc.close();
    }
}