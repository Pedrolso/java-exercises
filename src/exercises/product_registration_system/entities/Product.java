package exercises.product_registration_system.entities;

public class Product {

    private String name;
    private String category;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, String category, double price, int quantity) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //METHODS

    public boolean isAvailable() {
        return this.quantity > 0;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return " - " + name +
                " | " + category +
                " | $: " + price +
                " | " + quantity + " units";
    }
}
