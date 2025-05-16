
import java.util.Scanner;


public class Musica {

    Scanner scanner = new Scanner(System.in);

    // Atributos
    // Atributos: titulo, artista, anoLancamento, avaliacao e numeroAvaliacoes
    String titulo;
    String artista;
    int anoLancamento;
    Double avaliacao;
    int numeroAvaliacoes;

    // Método construtor
    // O construtor exibe os atributos da música
    // Atributos: titulo, artista, anoLancamento, avaliacao e numeroAvaliacoes
    void exibirDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de Avaliações: " + numeroAvaliacoes);
    }

    // Método para avaliar a música
    // Solicita ao usuário uma nova avaliação e atualiza a média
    // A média é calculada somando a avaliação atual multiplicada pelo número de avaliações
    // e a nova avaliação, dividindo pelo número total de avaliações
    // A média é atualizada e o número de avaliações é incrementado
    void avaliarMusica() {
        System.out.print("Digite a avaliação (0 a 10): ");
        double novaAvaliacao = scanner.nextDouble();
        if (novaAvaliacao < 0 || novaAvaliacao > 10) {
            System.out.println("Avaliação inválida. Deve ser entre 0 e 10.");
            return;
        }

        // Se a avaliação for válida, atualiza a média
        // A média é calculada somando a avaliação atual multiplicada pelo número de avaliações
        // e a nova avaliação, dividindo pelo número total de avaliações
        avaliacao = ((avaliacao * numeroAvaliacoes) + novaAvaliacao) / (numeroAvaliacoes + 1);
        numeroAvaliacoes++;
    }
}

