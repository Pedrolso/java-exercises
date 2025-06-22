package exercises.age_try_catch.entities;

import exercises.age_try_catch.exceptions.DomainException;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        if (age < 0) {
            throw new DomainException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
