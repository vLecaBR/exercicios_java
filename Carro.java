public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    void calcularIdade(){
        int anoAtual = 2025;
        int idade = anoAtual - ano;
        System.out.println("Idade do carro é de: " + idade + " anos");
    }
}
