package model;


public class Vigilante extends Funcionario{
    private int id;
    private String nomeVigilante;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getNomeVigilante() {
        return nomeVigilante;
    }

    public void setNomeVigilante(String nomeVigilante) {
        this.nomeVigilante = nomeVigilante;
    }

}
