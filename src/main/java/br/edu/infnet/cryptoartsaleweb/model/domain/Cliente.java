package br.edu.infnet.cryptoartsaleweb.model.domain;

import java.util.Date;

public class Cliente extends Pessoa {
	
    public Cliente(int id, String nome, String email, String telefone, Date aniversario) throws Exception {
        super(id, nome, email, telefone, aniversario);
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

        return sb.toString();
    }
}
