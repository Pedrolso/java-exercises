package exercises.customer_crud_system.service;

import exercises.customer_crud_system.entities.Customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class CustomerService {

    private List<Customer> customerList = new ArrayList<>();

    public void create(Customer customer) {
        for (Customer e : customerList) {
            if (customer.getName().equalsIgnoreCase(e.getName())) {
                System.out.println("Person with the name -" + customer.getName() + "- already exists");
                return;
            }
        }
        customerList.add(customer);
    }

    public void listAll() {
        for (Customer e : customerList) {
            System.out.println(e);
        }
    }

    public String updateEmail(String name, String email) {
        for (Customer e : customerList) {
            if (e.getName().equalsIgnoreCase(name)) {
                e.setEmail(email);
                return "Email update to: " + email;
            }
        }
        return "Name not found: " + name;
    }

    public String delete(String name) {
        Iterator<Customer> customerIterator = customerList.iterator();

        while (customerIterator.hasNext()) {
            Customer c = customerIterator.next();

            if (c.getName().equalsIgnoreCase(name)) {
                customerIterator.remove();
                return "Deleted";
            }
        }
        return "Name not found";
    }
}
