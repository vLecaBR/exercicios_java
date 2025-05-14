public class MainMusica {
    public static void main(String[] args) {
        Musica musica1 = new Musica();

        musica1.titulo = "Lean na fanta";
        musica1.artista = "Recayd Mob";
        musica1.anoLancamento = 2021;
        musica1.avaliacao = 0.0;
        musica1.numeroAvaliacoes = 0;

        musica1.avaliarMusica();
        musica1.exibirDetalhes();
    }
}

