package br.edu.infnet.cryptoartsaleweb.model.domain;

import br.edu.infnet.cryptoartsaleweb.model.exceptions.TamanhoCurtoException;
import br.edu.infnet.cryptoartsaleweb.model.exceptions.DataInvalidaException;

import java.util.Date;
import java.time.Instant;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
    private static final int MIN_CHAR_EM_NOME = 3; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String aniversario;

    Pessoa(){}
    
    Pessoa(String nome, String email, String telefone, String aniversario) throws Exception {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setAniversario(aniversario);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) throws TamanhoCurtoException {
        if(nome.length() < MIN_CHAR_EM_NOME){
            throw new TamanhoCurtoException("O nome deve ter "+ MIN_CHAR_EM_NOME +" caracteres no mínimo.");
        }

        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void setAniversario(String aniversario) {
//        if(aniversario.after(Date.from(Instant.now()))){
//            throw new DataInvalidaException("A data deve ser antes de hoje.");
//        }

        this.aniversario = aniversario;
    }

    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public String getTelefone() {
        return this.telefone;
    }

    protected String getContato() {
        return this.email +  " - " + this.telefone;
    }
    
    public String getAniversario() {
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

