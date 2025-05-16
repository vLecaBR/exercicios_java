import java.util.Scanner;

public class Calculadora {
    // Método que recebe um número como parâmetro e retorna o dobro
    public static double dobro(double numero) {
        return numero * 2;
    }
    // Método principal
    // Solicita ao usuário um número e exibe o dobro desse número
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um número
        System.out.print("Digite o número a ser dobrado: ");
        double numero = scanner.nextDouble();

        // Chama o método dobro e armazena o resultado
        double resultado = dobro(numero);

        // Exibe o resultado
        System.out.println("O dobro de " + numero + " é: " + resultado);
        
        scanner.close();
    }
}
