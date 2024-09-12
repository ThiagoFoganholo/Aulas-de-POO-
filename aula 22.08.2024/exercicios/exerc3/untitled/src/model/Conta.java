package model;

import java.util.Scanner;

public class Conta {
    public String conta;
    public String agencia;
    public String nomeCliente;
    public double saldo;

    public int sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return 1;
        } else {
            return 0;
        }
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void imprimir(){
        System.out.println("Conta: " + conta + "\nAgencia: " + agencia + "\nNome Cliente: " + nomeCliente + "\nsaldo: " + saldo + "\n");
    }

    public void cadastrar() {
        if (nomeCliente == null && conta == null && agencia == null) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.println("Digite o número da conta: ");
            conta = scanner.nextLine();

            System.out.println("Digite o número da agência: ");
            agencia = scanner.nextLine();

            System.out.println("Digite o saldo: ");
            saldo = Double.parseDouble(scanner.nextLine());

            System.out.println("Conta criada com sucesso!");
        } else {
            System.out.println("Conta existente!\n");
        }
    }

    public void consultar() {
        imprimir();
    }

    public void sacarValor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser sacado: ");
        double valorASacar = Double.parseDouble(scanner.nextLine());

        int sucesso = sacar(valorASacar);

        if (sucesso == 1) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void depositarValor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do depósito: ");
        double valorDeposito = Double.parseDouble(scanner.nextLine());

        depositar(valorDeposito);
        System.out.println("Depósito realizado com sucesso!");
    }
}
