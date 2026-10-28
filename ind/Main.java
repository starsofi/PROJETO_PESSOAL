import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usando ArrayList para guardar os candidatos (Muito usado no mercado)
        ArrayList<Candidato> listaCandidatos = new ArrayList<>();

        // Cadastrando alguns candidatos para o teste
        listaCandidatos.add(new Candidato("Ada Lovelace", 11));
        listaCandidatos.add(new Candidato("Alan Turing", 22));

        int opcao = -1;

        System.out.println("⚡ SISTEMA DE VOTAÇÃO ELETRÔNICA ⚡");

        // Loop principal do sistema usando while
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Votar");
            System.out.println("2. Ver Resultado Parcial");
            System.out.println("0. Encerrar Urna e Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- CANDIDATOS DISPONÍVEIS ---");
                    for (Candidato c : listaCandidatos) {
                        System.out.println(c.getNumero() + " - " + c.getNome());
                    }
                    System.out.print("Digite o número do seu candidato: ");
                    int votoNumero = scanner.nextInt();

                    boolean votoComputado = false;
                    for (Candidato c : listaCandidatos) {
                        if (c.getNumero() == votoNumero) {
                            c.receberVoto();
                            System.out.println("✅ Voto confirmado para " + c.getNome() + "!");
                            votoComputado = true;
                            break;
                        }
                    }

                    if (!votoComputado) {
                        System.out.println("❌ Número inválido! Voto não computado.");
                    }
                    break;

                case 2:
                    System.out.println("\n📊 --- RESULTADOS PARCIAIS ---");
                    for (Candidato c : listaCandidatos) {
                        System.out.println(c.getNome() + ": " + c.getVotos() + " votos");
                    }
                    break;

                case 0:
                    System.out.println("\n🔒 Urna encerrada com sucesso!");
                    break;

                default:
                    System.out.println("⚠ Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }
}
