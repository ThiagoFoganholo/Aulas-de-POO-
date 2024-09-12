package model;

import java.util.Scanner;

public class AcampamentoTeste {
    public static void main(String[] args) {
        int idade;
        //Criando objeto membro
        Acampamento acampamento = new Acampamento();

        //criar um leitor de teclado
        Scanner leitor = new Scanner(System.in);

        //definir valores aos atributos
        System.out.println("Digite o nome: ");
        acampamento.nome = leitor.nextLine();

        System.out.println("Digite o idade: ");
        idade = leitor.nextInt();
        acampamento.idade = idade;

        acampamento.separarGrupo(acampamento.idade);
        acampamento.imprimir();
    }
}

