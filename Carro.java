public class Carro {
    // Atributos
    String modelo;
    int ano;
    String cor;

    // Método construtor
    // O construtor exibe os atributos do carro
    void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    // Método para calcular a idade do carro
    // A idade é calculada subtraindo o ano atual do ano do carro
    void calcularIdade(){
        int anoAtual = 2025;
        int idade = anoAtual - ano;
        System.out.println("Idade do carro é de: " + idade + " anos");
    }
}
