package br.edu.infnet.cryptoartsaleweb.model.domain;

import br.edu.infnet.cryptoartsaleweb.model.exceptions.TamanhoCurtoException;
import br.edu.infnet.cryptoartsaleweb.model.exceptions.DataInvalidaException;

import java.util.Date;
import java.time.Instant;

public abstract class Pessoa {
    private static final int MIN_CHAR_EM_NOME = 3; 

    private int id;
    protected String nome;
    protected String email;
    protected String telefone;
    protected Date aniversario;

    Pessoa(int id, String nome, String email, String telefone, Date aniversario) throws Exception {
        setId(id);
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setAniversario(aniversario);
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNome(String nome) throws TamanhoCurtoException {
        if(nome.length() < MIN_CHAR_EM_NOME){
            throw new TamanhoCurtoException("O nome deve ter "+ MIN_CHAR_EM_NOME +" caracteres no mínimo.");
        }

        this.nome = nome;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    private void setAniversario(Date aniversario) throws DataInvalidaException {
        if(aniversario.after(Date.from(Instant.now()))){
            throw new DataInvalidaException("A data deve ser antes de hoje.");
        }

        this.aniversario = aniversario;
    }

    public int getId() {
        return this.id;
    }

    private String getNome() {
        return this.nome;
    }

    protected String getContato() {
        return this.email +  " - " + this.telefone;
    }
    
    protected Date getAniversario() {
        return this.aniversario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId());
        sb.append(" - ");
        sb.append(getNome());
        sb.append(" - ");
        sb.append(getAniversario());

        return sb.toString();
    }
}

