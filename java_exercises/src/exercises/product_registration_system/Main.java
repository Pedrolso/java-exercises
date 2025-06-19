package exercises.product_registration_system;

import exercises.product_registration_system.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Product product1 = new Product("Keyboard", "Electronic", 150, 10);
        Product product2 = new Product("Chair", "Furniture", 320, 0);
        Product product3 = new Product("Monitor", "Electronic", 700, 5);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (Product e : products) {
            System.out.println(e);
        }

        System.out.println("---- AVAILABLE ----");

        for (Product e : products) {
            if (e.isAvailable()) {

                System.out.println(e);
            }
        }

        double total = 0;
        for (Product e : products) {
            total = total + e.totalValueInStock();
        }

        System.out.println();
        System.out.println("Total value in stock: $ " + total);
    }
}
