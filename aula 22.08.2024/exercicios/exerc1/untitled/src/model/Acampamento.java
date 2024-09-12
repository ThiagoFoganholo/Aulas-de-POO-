package model;

public class Acampamento {
    public String nome;
    public int idade;
    public static String equipe;

    public void imprimir(){
        System.out.println("nome: " + nome);
        System.out.println("equipe: " + equipe);
        System.out.println("idade: " + idade);
    }
    public void separarGrupo(int idade){
        if(idade >= 0 && idade <= 5){
            Acampamento.equipe = "Não participa" ;
        }
        if(idade >= 6 && idade <= 11){
            Acampamento.equipe = "A" ;
        }
        if(idade >= 11 && idade <= 20){
            Acampamento.equipe = "B" ;
        }
        if(idade > 20){
            Acampamento.equipe = "C" ;
        }
    }
}

