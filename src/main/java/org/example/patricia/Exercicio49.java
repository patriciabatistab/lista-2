package org.example.patricia;

public class Exercicio49 {
    public static void main(String[] args) {
        
        long anteriorAtual = 0;
        long atual = 1;
        long soma = 0;
        for (int i = 1; i <= 50; i++) {
            soma = atual + anteriorAtual;
            System.out.println(atual);
            anteriorAtual = atual;
            atual = soma;
        }
    }
}
