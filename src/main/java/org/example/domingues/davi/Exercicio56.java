package org.example.domingues.davi;

import java.util.*;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do primeiro candidato: ");
        Candidato candidato1 = new Candidato(sc.nextLine());

        System.out.println("Nome do segundo candidato: ");
        Candidato candidato2 = new Candidato(sc.nextLine());

        System.out.println("Nome do terceiro candidato: ");
        Candidato candidato3 = new Candidato(sc.nextLine());

        Votacao votacao = new Votacao(List.of(candidato1, candidato2, candidato3));

        while (votacao.isVigente()) {
            sc.reset();
            System.out.printf("""
                    ------------- SIMULAÇÃO DE URNA ---------------
                    Selecionar uma das ações a seguir:
                    
                    1. Votar em %s
                    2. Votar em %s
                    3. Votar em %s
                    4. Votar em branco
                    
                    5. Finalizar votações
                    
                    """, candidato1.getNome(), candidato2.getNome(), candidato3.getNome());
            int opcao = sc.nextInt();
            switch (opcao) {
                case 1: {
                    votacao.votar(1);
                    break;
                }
                case 2: {
                    votacao.votar(2);
                    break;
                }
                case 3: {
                    votacao.votar(3);
                    break;
                }
                case 4: {
                    votacao.votarEmBranco();
                    break;
                }
                case 5: {
                    votacao.encerrar();
                    break;
                }
                default: {
                    break;
                }
            }
        }

        System.out.printf("""
                RESULTADO DA VOTAÇÃO
                
                Candidato 1 (%s): %d (%.2f)
                Candidato 2 (%s): %d (%.2f)
                Candidato 3 (%s): %d (%.2f)
                
                Votos em branco:  %d  %.2f)
                
                VENCEDOR: %s
                """,
                candidato1.getNome(), candidato1.getVotos(), votacao.getPorcentagem(1),
                candidato2.getNome(), candidato2.getVotos(), votacao.getPorcentagem(2),
                candidato3.getNome(), candidato3.getVotos(), votacao.getPorcentagem(3),
                votacao.getVotosBranco(), votacao.getPorcentagem(),
                votacao.nomeVencedor()
        );
    }

    private static class Votacao {
        private List<Candidato> candidatos;
        private int votosBranco;
        private boolean vigente;
        private long totalVotos;

        public Votacao(List<Candidato> candidatos) {
            this.candidatos = candidatos;
            this.votosBranco = 0;
            this.vigente = true;
            this.totalVotos = 0;
        }

        public void votarEmBranco() {
            this.votosBranco++;
            this.totalVotos++;
        }

        public void votar(int candidato) {
            this.candidatos.get(candidato - 1).votar();
            this.totalVotos++;
        }

        public String nomeVencedor() {
            return candidatos.stream().max(Comparator.comparing(Candidato::getVotos)).orElseThrow().getNome();
        }

        public void encerrar() {
            this.vigente = false;
        }

        public double getPorcentagem(int candidato) {
            return 100.0 * candidatos.get(candidato - 1).getVotos() / totalVotos;
        }

        public double getPorcentagem() {
            return 100.0 * votosBranco / totalVotos;
        }

        public List<Candidato> getCandidatos() {
            return candidatos;
        }

        public int getVotosBranco() {
            return votosBranco;
        }

        public boolean isVigente() {
            return vigente;
        }
    }

    private static class Candidato {
        private String nome;
        private Integer votos;

        public Candidato(String nome) {
            this.nome = nome;
            this.votos = 0;
        }

        public void votar() {
            votos++;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getVotos() {
            return votos;
        }
    }
}
