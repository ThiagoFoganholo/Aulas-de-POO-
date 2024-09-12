package model;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private List<Carro> carros = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //metodos construtores
    public Pessoa(String nome, String cpf, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.carros = carros;
    }
    public Pessoa(){
    }

    //toString

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", carros=" + carros +
                '}';
    }

    //metodos
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }
    public void exibirCarros(){
        for (Carro carro : carros) {
            System.out.println(carro.toString());
        }
        System.out.println("----------------------");
    }
}