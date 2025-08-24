package exercises.map_inventory_system.services;

import exercises.map_inventory_system.entities.Product;
import exercises.map_inventory_system.exceptions.DomainException;

import java.util.HashMap;
import java.util.Map;

public class ProductService {

    private Map<String, Product> productMap = new HashMap<>();

    public Product addProduct(Product product) {
        if (productMap.containsKey(product.getCode())) {
            throw new DomainException("Code already exists, try another.");
        } else {
            productMap.put(product.getCode(), product);// produto esta sendo guardado na chave"product.getCode()"
            return product;
        }
    }

    public void updateProduct(String code, int newQtd) {
        Product product = productMap.get(code);

        if (product == null) {
            throw new DomainException("The code does not exist.");
        }
        if (newQtd < 0) {
            throw new DomainException("You cannot update quantity with a negative number");
        }
        product.setQty(newQtd);

    }

    public Product searchByCode(String code) {
        return productMap.get(code);
    }

    @Override
    public String toString() {
        if (productMap.isEmpty()) {
            return "No product found";
        }
        StringBuilder sb = new StringBuilder("Products:\n"); //Certificar oq faz
        for (Product product : productMap.values()) {
            sb.append(product).append("\n");
        }
        return sb.toString();
    }
}