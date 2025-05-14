import java.util.Scanner;

public class Calculadora {

    // Método que recebe um número como parâmetro e retorna o dobro
    public static double dobro(double numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número a ser dobrado: ");
        double numero = scanner.nextDouble();

        double resultado = dobro(numero);

        System.out.println("O dobro de " + numero + " é: " + resultado);
        
        scanner.close();
    }
}
