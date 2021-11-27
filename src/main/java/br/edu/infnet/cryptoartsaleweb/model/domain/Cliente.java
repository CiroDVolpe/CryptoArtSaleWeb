package br.edu.infnet.cryptoartsaleweb.model.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Cliente extends Pessoa {
	
    public Cliente() {}

    public Cliente(String nome, String email, String telefone, String aniversario) throws Exception {
        super(nome, email, telefone, aniversario);
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
