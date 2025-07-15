package exercises.mapSet_II;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, String> mapValue = new HashMap<>();

        mapValue.put("map", "Treasure map");
        mapValue.put("set", "Hero set");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        if (mapValue.containsKey(word)) {
            System.out.println("Meaning: " + mapValue.get(word));
        } else {
            System.out.println("Word not found");
        }
    }
}
