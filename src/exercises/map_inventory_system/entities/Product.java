package exercises.map_inventory_system.entities;

import exercises.map_inventory_system.exceptions.DomainException;

public class Product {

    private String name;
    private String code;
    private int qty;

    public Product(String name, String code, int qty) {
        this.name = name;
        this.code = code;
        if (qty < 0) {
            throw new DomainException("CANNOT add negative value");
        }
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", qty=" + qty +
                '}';
    }
}
