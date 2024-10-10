package model;

public class Caixa {
    private double saldo;

    //Metodos para depositar e sacar
    public boolean depoistar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if(valor >= valor){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    // get e set
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
