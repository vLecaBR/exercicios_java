

import java.util.Scanner;


public class Musica {
    Scanner scanner = new Scanner(System.in);

    String titulo;
    String artista;
    int anoLancamento;
    Double avaliacao;
    int numeroAvaliacoes;

    void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de Avaliações: " + numeroAvaliacoes);
    }

    void avaliarMusica() {
        System.out.print("Digite a avaliação (0 a 10): ");
        double novaAvaliacao = scanner.nextDouble();
        if (novaAvaliacao < 0 || novaAvaliacao > 10) {
            System.out.println("Avaliação inválida. Deve ser entre 0 e 10.");
            return;
        }
        avaliacao = ((avaliacao * numeroAvaliacoes) + novaAvaliacao) / (numeroAvaliacoes + 1);
        numeroAvaliacoes++;
    }
}

