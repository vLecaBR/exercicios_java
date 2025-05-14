

import java.util.Scanner;


public class Aluno {
    Scanner scanner = new Scanner(System.in);

    String nome;
    int idade;

    void exibirDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

}

