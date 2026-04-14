package org.example.patricia;

import java.util.List;

public class Exercicio46 {

    public static void main(String[] args) {
        int homens = 0;
        int mulheres = 0;
        int[] idades = new int[200];
        String[] genero = new String[200];

        List<String> generoList = List.of("H", "M");

        for (int i = 0; i < idades.length; i++) {
            idades[i] = (int)((Math.random() * 22) + 8);

            genero[i] = generoList.get((int)(Math.random() * generoList.size()));
        }

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18){
               if (genero[i].equals("M")){
                   mulheres++;
               } else {
                   homens++;
               }
            }
        }
        System.out.println("Quantidade de mulheres: " + mulheres);
        System.out.println("Quantidade de homens: " + homens);
    }
}
