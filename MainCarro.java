public class MainCarro {
        public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.modelo = "Civic";
        carro1.ano = 1998;
        carro1.cor = "Preto";
        
        carro1.exibirDetalhes();
        carro1.calcularIdade();
    }
}
