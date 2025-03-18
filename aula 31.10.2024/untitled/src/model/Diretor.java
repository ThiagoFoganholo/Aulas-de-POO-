package model;

import Utils.GerenciarAcesso;

public class Diretor extends Funcionario implements Logavel{

    @Override
    public boolean login() {
        System.out.println("Diretor logou: " + getNomeFunc());
        GerenciarAcesso.adicionarLogavel(this);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.println("Diretor saiu do sistema: " + getNomeFunc());
        GerenciarAcesso.removerLogavel(this);
        return false;
    }
}
