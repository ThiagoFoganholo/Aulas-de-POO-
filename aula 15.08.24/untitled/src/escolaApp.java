import model.Aluno;

public class escolaApp {
    public static void main(String[] args) {
        //definir uma variável inteira
        int x = 10;
        //definir uma variavel objeto
        Aluno alunojoao = new Aluno();
        alunojoao.RA = 123;
        alunojoao.nome = "joao";
        alunojoao.email = "joao@gmail.com";
        alunojoao.telefone = "1234456";

        //Definir aluno2
        Aluno aluno2 = new Aluno();
        aluno2.unidadeEscolar ="Etec";

        //apresentar o valor de x
        System.out.println("Valor de x:"+x);

        //matricular o aluno joao
        alunojoao.matricular();
        aluno2.matricular();
    }
}
