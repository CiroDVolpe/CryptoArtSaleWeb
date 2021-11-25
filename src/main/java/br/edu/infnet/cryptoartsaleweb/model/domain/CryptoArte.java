package br.edu.infnet.cryptoartsaleweb.model.domain;

import java.util.Arrays;
import br.edu.infnet.cryptoartsaleweb.model.exceptions.FormatoDesconhecidoException;
import br.edu.infnet.cryptoartsaleweb.model.exceptions.TamanhoCurtoException;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CryptoArte {
    private static final int MIN_CHAR_EM_NOME = 3; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
//    private Cliente vencedor;
    private String formato;
    private float tamanho;
    private String nome;
    private String nomeArtista;
    private String[] formatosValidos;
    
    public CryptoArte(){}

    protected CryptoArte(String[] formatosValidos, String formato, float tamanho, String nome, String nomeArtista) throws Exception{
        this();
        setFormato(formatosValidos, formato);
        setTamanho(tamanho);
        setNome(nome);
        setNomeArtista(nomeArtista);
    }

//    protected CryptoArte(int id, String[] formatosValidos, String formato, float tamanho, String nome, String nomeArtista, Cliente vencedor) throws Exception{
//        this(id, formatosValidos, formato, tamanho, nome, nomeArtista);
//
//        setCliente(vencedor);
//    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFormato(String[] formatosValidos, String formato) throws FormatoDesconhecidoException {
        this.formato = formato;
        if(!Arrays.asList(formatosValidos).contains(formato)){
            throw new FormatoDesconhecidoException("O formato deve ser válido.");
        }
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void setNome(String nome) throws TamanhoCurtoException {
        if(nome.length() < MIN_CHAR_EM_NOME){
            throw new TamanhoCurtoException("O nome deve ter "+ MIN_CHAR_EM_NOME +" caracteres no mínimo.");
        }
        
        this.nome = nome;
    }

    public void setNomeArtista(String nomeArtista) throws TamanhoCurtoException {
        if(nomeArtista.length() < MIN_CHAR_EM_NOME){
            throw new TamanhoCurtoException("O nome do artista deve ter "+ MIN_CHAR_EM_NOME +" caracteres no mínimo.");
        }
    
        this.nomeArtista = nomeArtista;
    }

//    public void setCliente(Cliente vencedor) {
//        this.vencedor = vencedor;
//    }

    public Integer getId() {
        return this.id;
    }

    public String getFormato() {
        return this.formato;
    }

    public float getTamanho() {
        return this.tamanho;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNomeArtista() {
        return this.nomeArtista;
    }

//    public Cliente getVencedor() {
//        return this.vencedor;
//    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    public String formataCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append(getTipo());
        sb.append(";");
        sb.append(getId());
        sb.append(";");
        sb.append(getFormato());
        sb.append(";");
        sb.append(getTamanho());
        sb.append(";");
        sb.append(getNome());
        sb.append(";");
        sb.append(getNomeArtista());
        sb.append(";");
//        if (getVencedor() != null) {
//            sb.append(getVencedor());
//            sb.append(";");
//        }

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getId());
        sb.append(" - ");

        sb.append("Formato: ");
        sb.append(getFormato());
        sb.append(" - ");

        sb.append("Tamanho(kB): ");
        sb.append(getTamanho());
        sb.append(" - ");

        sb.append("Nome: ");
        sb.append(getNome());
        sb.append(" - ");

        sb.append("Nome do artista: ");
        sb.append(getNomeArtista());

//        if (getVencedor() != null) {
//            sb.append(getVencedor());
//            sb.append(";");
//        }

        return sb.toString();
    }
}
