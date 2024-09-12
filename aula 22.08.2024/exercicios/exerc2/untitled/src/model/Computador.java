package model;

public class Computador {
    //Atributos
    public String marca;
    public String cor;
    public String modelo;
    public long   numeroSerie;
    public double preco;

    //Metodos
    public void imprimir(){
        System.out.println("Marca: " + marca + ", \nCor: " + cor + ", \nModelo: "
                            + modelo + ",\nNumero Serie: " + numeroSerie +
                            ",\nPreco: " + preco + "\n"
                          );
    }
    public void calcularValor(){
        if(marca.equalsIgnoreCase("HP")){
            preco = preco + (preco * 0.3);
        }
        if (marca.equalsIgnoreCase("IBM")){
            preco = preco + (preco * 0.5);
        }
    }
    public int alterarValor(double valor){
        if(valor > 0){
            preco = valor;
            return 1;
        }else{
            return 0;
        }
    }
}
