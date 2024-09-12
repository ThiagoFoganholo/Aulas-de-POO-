package model;

public class Carro {

    //Atributos privados
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    // Getters e Setters
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //metodos construtores
        public Carro(String modelo, String marca, String cor, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
    }
    public Carro(){
    }
    // ao inves do imprimir vamos usar o toString()

    @Override
    public String toString() {
        return "Dados do carro " +
                "marca: " + marca + "\n"+
                "modelo: " + modelo + "\n"+
                "cor: " + cor + "\n" +
                "placa: " + placa + "\n"
                ;
    }

}
