package exercises.product_registration_ref;

import exercises.product_registration_ref.entities.Product;
import exercises.product_registration_ref.exceptions.DomainException;
import exercises.product_registration_ref.services.ProductService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(name, price, quantity);

            System.out.println(product);
            ProductService productService = new ProductService(product);

            System.out.println(" ------------------- ");

            System.out.println("How much would you like to add to the quantity?");
            int quantityAdd = sc.nextInt();
            productService.addStock(quantityAdd);
            System.out.println("How much would you like to remove from the quantity?");
            int quantityRemove = sc.nextInt();
            productService.removeStock(quantityRemove);

            System.out.println(" ------------------- ");

            System.out.println(product);

        } catch (InputMismatchException e) {
            System.out.println("Only number! ");

        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }
}
