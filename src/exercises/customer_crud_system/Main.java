package exercises.customer_crud_system;

import exercises.customer_crud_system.entities.Customer;
import exercises.customer_crud_system.service.CustomerService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerService customerService = new CustomerService();

        try {
            int menu;
            do {
                System.out.println(
                        "1 - Adicionar cliente\n" +
                                "2 - Listar todos\n" +
                                "3 - Atualizar Cliente\n" +
                                "4 - Deletar\n" +
                                "0 - Sair"
                );
                menu = sc.nextInt();
                switch (menu) {

                    case 1:
                        System.out.println("Iniciou 1");
                        sc.nextLine();
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();
                        System.out.print("City: ");
                        String city = sc.nextLine();

                        Customer customer = new Customer(name, email, city);
                        customerService.create(customer);
                        break;

                    case 2:
                        System.out.println("Iniciou 2");
                        customerService.listAll();
                        System.out.println();
                        break;

                    case 3:
                        System.out.print("Customer who wants to update Email: ");
                        System.out.print("Customer name: ");
                        sc.nextLine();
                        String nameUpdate = sc.nextLine();
                        System.out.print("New Email: ");
                        String newEmail = sc.nextLine();
                        System.out.println(customerService.updateEmail(nameUpdate, newEmail));
                        break;

                    case 4:
                        System.out.print("Who do you want to delete? ");
                        sc.nextLine();
                        String nameDelete = sc.nextLine();
                        customerService.delete(nameDelete);
                        break;
                    case 0:
                        break;

                    default:
                        System.out.println("Opcao errada tente novamente");
                        break;
                }
            }

            while (menu != 0);
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("erro");
        }
    }
}
