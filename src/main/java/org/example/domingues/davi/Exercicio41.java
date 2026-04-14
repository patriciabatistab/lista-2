package org.example.domingues.davi;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numSorteado = ThreadLocalRandom.current().nextInt(1, 101);
        int numPalpite;
        boolean palpiteCorreto = false;

        while (palpiteCorreto == false) {
            System.out.print("Digite um número de 1 a 100: ");
            numPalpite = scan.nextInt();
            if (numPalpite > numSorteado) {
                System.out.println("Errado! Tente um número menor");
            }
            if (numPalpite < numSorteado) {
                System.out.println("Errado! Tente um número maior");
            }
            if (numSorteado == numPalpite) {
                System.out.printf("Parabéns! O número sorteado é %d", numSorteado);
                palpiteCorreto = true;
            }
            System.out.println("\n");
        }
    }
}
