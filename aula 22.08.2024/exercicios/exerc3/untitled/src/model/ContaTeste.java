package model;
import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        boolean bool = true;
        Scanner str1 = new Scanner(System.in);

        do {
            System.out.println  ("Digite 1 para sacar\n" +
                    "Digite 2 para depositar\n" +
                    "Digite 3 para consultar\n" +
                    "Digite 4 para cadastrar\n"+
                    "Digite 5 para sair");

            int op = Integer.parseInt(str1.nextLine());

            switch (op) {
                case 1:
                    if (conta1.nomeCliente == null) {
                        System.out.println("Cliente inexistente\n");
                    } else {
                        conta1.sacarValor();
                    }
                    break;
                case 2:
                    if (conta1.nomeCliente == null) {
                        System.out.println("Cliente inexistente\n");
                    } else {
                        conta1.depositarValor();
                    }
                    break;
                case 3:
                    if (conta1.nomeCliente == null) {
                        System.out.println("Cliente inexistente\n");
                    } else {
                        conta1.consultar();
                    }
                    break;
                case 4:
                    conta1.cadastrar();
                    break;
                case 5:
                    System.out.println("fim\n");
                    bool = false;
                    break;
                default:
                    System.out.println("Comando errado, digite novamente!\n");
                    break;
            }
        } while (bool);
        str1.close();
    }
}
