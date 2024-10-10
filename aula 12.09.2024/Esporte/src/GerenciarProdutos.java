import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarProdutos {
    private List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarProdutos gerenciarProdutos = new GerenciarProdutos();
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Consultar Todos os Produtos");
            System.out.println("3. Consultar Produto por Nome");
            System.out.println("4. Alterar Disponibilidade");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opc = scanner.nextInt();
            switch (opc){
                case 1:
                    gerenciarProdutos.execCadastrar();
                    break;
                case 2:
                    gerenciarProdutos.execConsultar();
                    break;
                case 3:
                    gerenciarProdutos.execConsultarPorNome();
                    break;
                case 4:
                    gerenciarProdutos.execAlterarDisponibilidade();
                    break;
                case 9:
                    gerenciarProdutos.execSair();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opc != 0);
    }

    private void execCadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        Double preco = scanner.nextDouble();

    }
}
