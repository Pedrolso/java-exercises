package exercises.age_try_catch;

import exercises.age_try_catch.entities.Person;
import exercises.age_try_catch.exceptions.DomainException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();

            Person person= new Person(name, age);

            System.out.println(person);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Age must be an integer.");

        } catch (DomainException e) {
            System.out.println("Error " + e.getMessage());

        }
    }
}