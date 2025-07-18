package exercises.Customer_registration_exercise.entities;

public class Person {
    private String name;
    private String email;
    private Integer age;

    public Person() {
    }

    public Person(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //METHODS

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    @Override
    public String toString() {
        return "Name " + name +", Email " + email +", Age=" + age;
    }
}
