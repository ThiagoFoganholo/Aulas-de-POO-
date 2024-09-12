package model;
import java.util.Scanner;

public class BibliotecaTeste {
    static Scanner texto = new Scanner(System.in);
    static Livro livro1 = new Livro();

    public static void main(String[] args) {
        boolean continuar = true;
            do {
                System.out.println("Digite 1 - para cadastrar um livro ");
                System.out.println("Digite 2 - para consultar um livro ");
                System.out.println("Digite 3 - para emprestar um livro ");
                System.out.println("Digite 4 - para devolver um livro ");
                System.out.println("Digite 5 - para sair da biblioteca ");

                int op = Integer.parseInt(texto.nextLine());
                switch (op) {
                    case 1:
                        // Lógica para cadastrar um livro
                        execCadastrar();
                        break;
                    case 2:
                        // Lógica para consultar um livro
                        execConsultar();
                        break;
                    case 3:
                        // Lógica para emprestar um livro
                        execEmprestar();
                        break;
                    case 4:
                        // Lógica para devolver um livro
                        execDevolver();
                        break;
                    case 5:
                        System.out.println("FIM!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção errada, escolha novamente!");
                        break;
                    }
            }while(continuar);
        }
    // metodos

    public static void	execCadastrar(){
        System.out.println("Digite o nome do titulo: ");
        livro1.titulo = texto.nextLine();

        System.out.println("Digite o nome do titulo: ");
        livro1.autor = texto.nextLine();

        livro1.emprestado = false;
    }
    public static void execConsultar(){
        if(livro1.titulo != null && livro1.autor != null){
            livro1.imprimir();
        }else{
            System.out.println("Livro inexistente!");
        }
    }
    public static void execEmprestar(){
        if(livro1.titulo != null && livro1.autor != null){
            livro1.emprestar(livro1);
        }else{
            System.out.println("Livro inexistente!");
        }
    }
    public static void execDevolver(){
        if(livro1.titulo != null && livro1.autor != null){
            livro1.devolver(livro1);
        }else{
            System.out.println("Livro inexistente!");
        }
    }
}
