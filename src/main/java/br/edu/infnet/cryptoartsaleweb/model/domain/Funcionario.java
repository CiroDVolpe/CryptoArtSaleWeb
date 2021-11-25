package br.edu.infnet.cryptoartsaleweb.model.domain;

import java.util.Date;

public class Funcionario extends Pessoa {
    private int cod_trabalho;

    public Funcionario(int id, String nome, String email, String telefone, Date aniversario, int cod_trabalho) throws Exception {
        super(id, nome, email, telefone, aniversario);
        setCodTrabalho(cod_trabalho);
    }

    private void setCodTrabalho(int cod_trabalho) {
        this.cod_trabalho = cod_trabalho;
    }

    private int getCodTrabalho() {
        return this.cod_trabalho;
    }

    public void resumo() {
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" - ");
        sb.append(getContato());
        sb.append(" - ");
        sb.append(getCodTrabalho());

        return sb.toString();
    }
}

