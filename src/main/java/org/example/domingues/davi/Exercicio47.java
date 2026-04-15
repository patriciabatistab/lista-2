package org.example.domingues.davi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        List<Paciente> pacientes = new ArrayList<>();

        String nome = "";
        String sexo;
        double peso;
        int idade;
        double altura;

        int count = 1;

        while (true) {
            System.out.println("CADASTRO PACIENTE " + count);

            System.out.print("Nome: ");
            nome = inputString.nextLine();

            if(nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Sexo: ");
            sexo = inputString.nextLine();

            System.out.print("Peso: ");
            peso = inputNumber.nextDouble();

            System.out.print("Altura: ");
            altura = inputNumber.nextDouble();

            System.out.print("Idade: ");
            idade = inputNumber.nextInt();

            pacientes.add(new Paciente(nome, sexo, peso, idade, altura));
            count++;
        }

        Relatorio relatorio = new Relatorio(pacientes);

        System.out.println(relatorio);
    }

    static class Paciente {
        String nome;
        String sexo;
        Double peso;
        Integer idade;
        Double altura;

        public Paciente(String nome, String sexo, Double peso, Integer idade, Double altura) {
            this.nome = nome;
            this.sexo = sexo;
            this.peso = peso;
            this.idade = idade;
            this.altura = altura;
        }

        @Override
        public String toString() {
            return "Paciente{" +
                    "nome='" + nome + '\'' +
                    ", sexo='" + sexo + '\'' +
                    ", peso=" + peso +
                    ", idade=" + idade +
                    ", altura=" + altura +
                    '}';
        }
    }

    static class Relatorio {
        Integer quantidadePacientes;
        Double mediaIdadeHomens;
        Long quantidadeMulheresPadrao;
        Long quantidadePessoasJovens;
        String nomePacienteMaisVelho;
        String nomeMulherMaisBaixa;

        public Relatorio(List<Paciente> pacientes) {
            this.quantidadePacientes = pacientes.size();
            this.mediaIdadeHomens = pacientes.stream()
                    .filter((paciente -> paciente.sexo.equals("m")))
                    .map((paciente -> paciente.idade))
                    .reduce(Integer::sum).orElseThrow().doubleValue()
                    /pacientes.stream()
                    .filter((paciente -> paciente.sexo.equals("m"))).count();
            this.quantidadeMulheresPadrao = pacientes.stream()
                    .filter((paciente -> paciente.sexo.equals("f")))
                    .filter((mulher) -> mulher.altura >= 1.60 && mulher.altura <= 1.70)
                    .filter((mulher) -> mulher.peso > 70.0)
                    .count();
            this.quantidadePessoasJovens = pacientes.stream()
                    .filter((paciente) -> paciente.idade >= 18 && paciente.idade <= 25)
                    .count();
            this.nomePacienteMaisVelho = pacientes.stream()
                    .max(Comparator.comparing(paciente -> paciente.idade))
                    .get().nome;
            this.nomeMulherMaisBaixa = pacientes.stream()
                    .min(Comparator.comparing((paciente) -> paciente.altura))
                    .get().nome;
        }

        @Override
        public String toString() {
            return "Relatorio{" +
                    "quantidadePacientes=" + quantidadePacientes +
                    ", mediaIdadeHomens=" + mediaIdadeHomens +
                    ", quantidadeMulheresPadrao=" + quantidadeMulheresPadrao +
                    ", quantidadePessoasJovens=" + quantidadePessoasJovens +
                    ", nomePacienteMaisVelho='" + nomePacienteMaisVelho + '\'' +
                    ", nomeMulherMaisBaixa='" + nomeMulherMaisBaixa + '\'' +
                    '}';
        }
    }
}
