package exercises.mapSet_IV;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Criar o mapa para contar
        Map<String, Integer> contagem = new HashMap<>();

        // Entrada da frase
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        // Separar a frase por espaço (cada palavra)
        String[] palavras = frase.split(" ");

        // Percorrer cada palavra
        for (String palavra : palavras) {
            // Se a palavra já existe no mapa, incrementar +1
            if (contagem.containsKey(palavra)) {
                contagem.put(palavra, contagem.get(palavra) + 1);
            } else {
                contagem.put(palavra, 1); // Senão, adiciona com valor 1
            }
        }

        // Mostrar o resultado
        System.out.println("Contagem de palavras:");
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}
