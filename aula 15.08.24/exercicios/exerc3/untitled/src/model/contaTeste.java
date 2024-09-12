package model;
import java.util.Scanner;

public class contaTeste {
    public static void main(String[] args) {

        Conta conta1= new Conta();
        boolean bool = true;
        Scanner str1 = new Scanner(System.in);

        do{

            System.out.println  ("Digite 1 para sacar\n" +
                                 "Digite 2 para depositar\n" +
                                 "Digite 3 para consultar\n" +
                                 "Digite 4 para cadastrar\n"+
                                 "Digite 5 para sair");

            int op = Integer.parseInt(str1.nextLine());

            switch (op){
                case 1:
                    if(conta1.nomeCliente == (null)){
                        System.out.println("Cliente inexistente\n");
                        break;
                    }else{
                        execSacar(conta1);
                    }
                    break;
                case 2:
                    if(conta1.nomeCliente == (null)){
                        System.out.println("Cliente inexistente\n");
                    }else {
                        execDeposito(conta1);
                    }
                    break;
                case 3:
                    if(conta1.nomeCliente == (null)){
                        System.out.println("Cliente inexistente\n");
                    }else {
                        execConsulta(conta1);
                    }
                    break;
                case 4:
                    execCadastro(conta1);
                    break;
                case 5:
                    System.out.println("fim\n");
                    bool = false;
                    break;
                default:
                    System.out.println("Comando errado, digite novamente!\n");
                    break;
            }
        }while (bool);
        str1.close();

    }

    static void execCadastro(Conta conta1){

        if (conta1.nomeCliente == null && conta1.conta == null && conta1.agencia == null) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do cliente: ");
            conta1.nomeCliente = scanner.nextLine();

            System.out.println("Digite o número da conta: ");
            conta1.conta = scanner.nextLine();

            System.out.println("Digite o número da agência: ");
            conta1.agencia = scanner.nextLine();

            System.out.println("Digite o saldo: ");
            conta1.saldo = Double.parseDouble(scanner.nextLine());

            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Conta existente!\n");
        }
    }
    static public void execConsulta(Conta conta1){
        conta1.imprimir();
    }
    public static void execSacar(Conta conta1) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado: ");
        double valorASacar = Double.parseDouble(scanner.nextLine());

        int sucesso = conta1.sacar(valorASacar);

        if (sucesso == 1) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
    public static void execDeposito(Conta conta1) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do depósito: ");
        double valorDeposito = Double.parseDouble(scanner.nextLine());

        conta1.depositar(valorDeposito);
        System.out.println("Depósito realizado com sucesso!");
    }
}


