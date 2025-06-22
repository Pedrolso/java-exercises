package exercises.Customer_registration_exercise;

import exercises.Customer_registration_exercise.entities.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Person person1 = new Person("Pedro", "pedro@gmail.com", 32);
        Person person2 = new Person("Maria", "maria@gmail.com", 5);
        Person person3 = new Person("Joao", "joao@gmail.com", 27);
        Person person4 = new Person("Joao", "joao@gmail.com", 7);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        System.out.println("--- +=18 ---");

        for (Person e : personList) {
            if (e.isOfLegalAge()) {
                System.out.println(e);
            }
        }
        System.out.println("--- Under 18 ---");
        for (Person e : personList) {
            if (!e.isOfLegalAge()) {
                System.out.println(e);
            }
        }
    }
}
