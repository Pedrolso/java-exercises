package exercises.customer_registration_system_filter_name;

import exercises.customer_registration_system_filter_name.entities.Customer;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerService {

    public void showAll(List<Customer> customerList) {
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    public void filterbycity(List<Customer> customerList, String city) {
        boolean found = false;
        for (Customer e : customerList) {
            if (e.getCity().equals(city)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("no cities found");
        }
    }

    public void firstLetter(List<Customer> customerList, String letter) {
        boolean found = false;
        for (Customer e : customerList) {
            if (e.getName().startsWith(letter)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No person starts with this letter");
        }
    }

    public void cidadeIgual(List<Customer> customerList, String cidade) {
        customerList.stream().filter(customer -> customer.getCity().equals(cidade))
                .forEach(customer -> System.out.println(customer));

        List<Customer> filtrados =
                customerList.stream().filter(customer -> customer.getCity().equals(cidade))
                        .collect(Collectors.toList());

        if (filtrados.isEmpty()) {
            System.out.println("Cidade não encontrada: " + cidade);
        } else {
            filtrados.forEach(System.out::println);
        }
    }

}
