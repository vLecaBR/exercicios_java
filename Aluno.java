// Nome do arquivo: Aluno.java
import java.util.Scanner;
// Classe Aluno
// Atributos: nome e idade
public class Aluno {
    Scanner scanner = new Scanner(System.in);
    // Atributos
    String nome;
    int idade;
    // Metodo construtor
    void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}

