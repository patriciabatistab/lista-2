package org.example.patricia;

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutosTotal = 100;
        int extraMin = 50;
        double saldo = 0.0;

        while(true) {
            System.out.println("Fale qual tipo de operadora você fez a ligação(Digite 'Sair' para sair do programa) ");
            System.out.println("'V' - Vai-Vai | 'O' - Outras Operadoras | 'F' - Telefone Fixo");
            String operadora = scanner.nextLine();

            if (operadora.equalsIgnoreCase("Sair") || !(operadora.equalsIgnoreCase("O") || operadora.equalsIgnoreCase("V") || operadora.equalsIgnoreCase("F"))) {
                break;
            }

            System.out.print("Informe a quantidade de minutos na ligação: ");
            int minutosEntrada = scanner.nextInt();
            scanner.nextLine();

            int minutos = minutosEntrada;
            double cobranca = (operadora.equalsIgnoreCase("V"))? 0.20 : 0.65;

            if (minutosTotal >= minutos || (operadora.equalsIgnoreCase("F") && minutos / 2 <= minutosTotal)){
                if (operadora.equalsIgnoreCase("F")){
                    minutosTotal -= minutos / 2;

                } else {
                    minutosTotal -= minutos;
                }
                minutos = 0;

            } else if (minutosTotal > 0){
                minutos -= minutosTotal;
                minutosTotal = 0;
                if (operadora.equalsIgnoreCase("V")){
                    if (extraMin >= minutos){
                        extraMin -= minutos;
                        minutos = 0;

                    } else {
                        minutos -= extraMin;
                        extraMin = 0;
                    }
                }
                if (minutos > 0) {
                    saldo += minutos * cobranca;
                }

            } else if(extraMin > 0 && operadora.equalsIgnoreCase("V")){
                if (extraMin >= minutos){
                    extraMin -= minutos;
                    minutos = 0;

                } else {
                    minutos -= extraMin;
                    extraMin = 0;
                    saldo += minutos * cobranca;
                }

            } else {
                saldo += minutos * cobranca;
            }

            String nomeOperadora = "";
            switch (operadora.toUpperCase()){
                case "V" -> nomeOperadora = "Vai-Vai";
                case "O" -> nomeOperadora = "Outra Operadora";
                case "F" -> nomeOperadora = "Telefone Fixo";
            }

            System.out.printf("""
                    
                    ----------------------------------------------------------------------
                    Ligação feita com o(a) %s com a duração de %d minutos.
                    
                    Minutos do plano retante de %d com extra para a Vai-Vai de ainda %d
                    Saldo atual de %.2f
                    ----------------------------------------------------------------------

                    """, nomeOperadora, minutosEntrada, minutosTotal, extraMin, saldo);
        }
    }
}
