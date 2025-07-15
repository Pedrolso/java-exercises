package exercises.mapSet_III;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Esta falando que uma String sera a CHAVE da clase Person
        Map<String, Person> people = new HashMap<>();
        //
        Set<String> ids = new HashSet<>();

        int opc;

        do {
            System.out.println("Select an option:");
            System.out.println(
                    "1 - Add customer\n" +
                            "2 - List\n" +
                            "0 - Exit"
            );

            opc = sc.nextInt();
            switch (opc) {

                case 1:
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("ID Number: ");
                    String idNumber = sc.nextLine();

                    if (ids.contains(idNumber)) {
                        System.out.println("Invalid ID!");
                    } else {
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Phone: ");
                        String phone = sc.nextLine();

                        Person person = new Person(name, idNumber, age, phone);
                        people.put(idNumber, person);// esta adicionando "idNumber como chave" do person
                        ids.add(idNumber);//guarda no set para verificar que nao tenha outra ID igual

                    }
                    break;

                case 2:
                    System.out.println(people);
                    break;
            }
        } while (opc != 0);
    }
}

