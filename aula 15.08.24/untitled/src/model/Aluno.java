package model;

public class Aluno {
    public int RA;
    public String nome;
    public String telefone;
    public String email;
    // atributo estatico - compartilhado
    public static String unidadeEscolar = "Fatec moji mirim" ;

    //Métodos

    public void matricular(){
        System.out.println("Matricular aluno");
        System.out.println("RA: " + RA);
        System.out.println("Nome: " + nome);
        System.out.println("Unidade Escolar :" + unidadeEscolar);
    }
}
