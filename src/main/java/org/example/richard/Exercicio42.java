package org.example.richard;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio42 {
    public static void main(String[] args) {
        System.out.println("40 grupos para sorteio:");

        for (int i = 1; i <= 40; i++) {
            int[] grupo = new int[3];
            for (int j = 0; j < 3; j++) {
                grupo[j] = ThreadLocalRandom.current().nextInt(0, 60);
            }
            Arrays.sort(grupo);

            System.out.printf("Grupo %d: %d, %d, %d\n", i, grupo[0], grupo[1], grupo[2]);
        }
    }
}
