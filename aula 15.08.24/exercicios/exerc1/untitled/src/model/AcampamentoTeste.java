package model;

public class AcampamentoTeste {
    public static void main(String[] args) {
        Acampamento acampamento = new Acampamento();
        acampamento.nome ="carlos";
        acampamento.idade = 21;
        acampamento.separarGrupo(acampamento.idade);
        acampamento.imprimir();
    }
}

