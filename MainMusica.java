public class MainMusica {
    public static void main(String[] args) {

        // Cria um objeto da classe Musica
        Musica musica1 = new Musica();
        
        // Atribui valores aos atributos do objeto musica1
        // Atributos: titulo, artista, anoLancamento, avaliacao e numeroAvaliacoes
        musica1.titulo = "Lean na fanta";
        musica1.artista = "Recayd Mob";
        musica1.anoLancamento = 2021;
        musica1.avaliacao = 0.0;
        musica1.numeroAvaliacoes = 0;

        // Chama o método exibirDetalhes para exibir os detalhes da música
        // Chama o método avaliarMusica para avaliar a música
        musica1.avaliarMusica();
        musica1.exibirDetalhes();
    }
}

