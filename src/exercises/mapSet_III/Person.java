package exercises.mapSet_III;

public class Person {

    private String name;
    private String idNumber;
    private int age;
    private String phone;

    public Person(String name, String idNumber, int age, String phone) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ", "
                + idNumber + ", "
                + age + ", "
                + phone + "\n";
    }
}
