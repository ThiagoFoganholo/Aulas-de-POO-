package model;

public class ComputadorTeste {
    public static void main(String[] args) {

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();

        computador1.marca = "HP";
        computador1.cor = "preto";
        computador1.modelo ="X";
        computador1.preco = 1000;
        computador1.numeroSerie = 1234;

        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();

        computador2.marca = "IBM";
        computador2.cor = "azul";
        computador2.modelo ="Z";
        computador2.preco = 5000;
        computador2.numeroSerie = 4567;

        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        if(computador2.alterarValor(1000) == 1){
            System.out.println("Valor alterado!");
        }
        else{
            System.out.println("Valor não alterado!");
        }
    }
}
