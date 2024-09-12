package model;

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
}
