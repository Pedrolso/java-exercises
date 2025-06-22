package exercises.customer_registration_system_filter_name;

import exercises.customer_registration_system_filter_name.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Customer> customers = new ArrayList<>();
        CustomerService customerService = new CustomerService();

        Customer customer1 = new Customer("Pedro", "pedro@gmail.com", "Dublin");
        Customer customer2 = new Customer("Maria", "maria@gmail.com", "Cork");
        Customer customer3 = new Customer("Naomi", "naomi@gmail.com", "Bray");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        customerService.showAll(customers);

        System.out.println();
        customerService.filterbycity(customers,"Bray");

        System.out.println();
        customerService.firstLetter(customers,"P"); //Se colocar uma segunda letra ele vai dar nao encontrado.

        System.out.println("------Stream------");
        customerService.cidadeIgual(customers,"Codrk");
    }
}
