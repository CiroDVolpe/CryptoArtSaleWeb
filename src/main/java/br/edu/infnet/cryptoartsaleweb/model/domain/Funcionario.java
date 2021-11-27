package br.edu.infnet.cryptoartsaleweb.model.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Funcionario extends Pessoa {
    private int codTrabalho;

    public Funcionario() {}
    
    public Funcionario(String nome, String email, String telefone, String aniversario, int codTrabalho) throws Exception {
        super(nome, email, telefone, aniversario);
        setCodTrabalho(codTrabalho);
    }

    public void setCodTrabalho(int codTrabalho) {
        this.codTrabalho = codTrabalho;
    }

    public int getCodTrabalho() {
        return this.codTrabalho;
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

