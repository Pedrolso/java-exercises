package exercises.customer_crud_system.entities;

public class Customer {

    private String name;
    private String email;
    private String city;

    public Customer() {
    }

    public Customer(String name, String email, String city) {
        this.name = name;
        this.email = email;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    //METHODS


    @Override
    public String toString() {
        return " - " + name + ", "
                + email + ", "
                + city;
    }
}
