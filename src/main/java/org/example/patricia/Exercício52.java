package org.example.patricia;

public class Exercício52 {
    public static void main(String[] args) {

        long somaTotal = 0;
        for (int i = 1; i < 64; i++) {
            if (i == 1){
                somaTotal += 1;
                continue;
            }
            somaTotal *= 2;
        }

        System.out.printf("""
                Grãos de Arroz: %,d%n
                Sacos de Arroz: %,d%n
                """, somaTotal, (somaTotal / 64));
    }
}
