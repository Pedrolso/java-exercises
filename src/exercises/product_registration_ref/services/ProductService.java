package exercises.product_registration_ref.services;

import exercises.product_registration_ref.entities.Product;
import exercises.product_registration_ref.exceptions.DomainException;

public class ProductService {

    private Product product;

    //TESTAR SEM O CONSTRUTOR PARA VER OQ ESTA FAZENDO
    public ProductService(Product product) {
        this.product = product;
    }

    public void addStock(int quantity) {
        if (quantity < 0) {
            throw new DomainException("CANNOT add negative value");
        }
        product.setQuantity(product.getQuantity() + quantity);
    }

    public void removeStock(int quantity) {
        if (quantity > product.getQuantity()) {
            throw new DomainException("CANNOT remove value greater than quantity");
        }
        if (quantity < 0) {
            throw new DomainException("CANNOT remove negative number");
        }
        product.setQuantity(product.getQuantity() - quantity);
    }
}
