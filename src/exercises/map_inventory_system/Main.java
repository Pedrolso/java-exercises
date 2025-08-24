package exercises.map_inventory_system;

import exercises.map_inventory_system.entities.Product;
import exercises.map_inventory_system.exceptions.DomainException;
import exercises.map_inventory_system.services.ProductService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProductService productService = new ProductService();
        try {
            int menu;
            do {
                System.out.println("Select an option:");
                System.out.println(
                        "1 - Add product\n" +
                                "2 - Update quantity\n" +
                                "3 - List\n" +
                                "4 - Search by code\n" +
                                "0 - Exit"
                );

                menu = scanner.nextInt();
                switch (menu) {
                    case 1:
                        scanner.nextLine();
                        System.out.print("Product name: ");
                        String name = scanner.nextLine();
                        System.out.print("Product code: ");
                        String code = scanner.nextLine();
                        System.out.print("Quantity: ");
                        int qtd = scanner.nextInt();

                        Product product = new Product(name, code, qtd);
                        productService.addProduct(product);
                        break;

                    case 2:
                        scanner.nextLine();

                        System.out.println("Product Code: ");
                        String productCode = scanner.nextLine();
                        System.out.print("new quantity: ");
                        int qtdNew = scanner.nextInt();

                        productService.updateProduct(productCode, qtdNew);
                        break;

                    case 3:
                        System.out.println(productService);
                        break;

                    case 4:
                        scanner.nextLine();

                        System.out.print("Code: ");
                        String searchCode = scanner.nextLine();

                        Product found = productService.searchByCode(searchCode);
                        if (found != null) {
                            System.out.println(found);
                        } else {
                            System.out.println("Invalid Code");
                        }
                        break;

                }
            } while (menu != 0);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values only.");
        } catch (DomainException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}