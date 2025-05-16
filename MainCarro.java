public class MainCarro {
        public static void main(String[] args) {
        // Cria um objeto da classe Carro
        Carro carro1 = new Carro();

        // Atribui valores aos atributos do objeto carro1
        carro1.modelo = "Civic";
        carro1.ano = 1998;
        carro1.cor = "Preto";
        
        // Chama o método exibirDetalhes para exibir os detalhes do carro
        // Chama o método calcularIdade para calcular a idade do carro
        carro1.exibirDetalhes();
        carro1.calcularIdade();
    }
}
