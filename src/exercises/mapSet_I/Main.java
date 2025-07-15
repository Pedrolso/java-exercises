package exercises.mapSet_I;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();

        names.add("Pedro");
        names.add("Naomi");
        names.add("Maria");
        names.add("Pedro");

        System.out.println(names.size());
    }
}
