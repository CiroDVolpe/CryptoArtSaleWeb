package br.edu.infnet.cryptoartsaleweb.model.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Audio extends CryptoArte {
    public static String[] formatosValidos =  {"mp3", "wav", "wma"};

    private String afinacao;
    private String genero;

    public Audio(){}
    
    public Audio(String formato, float tamanho, String nome, String nomeArtista, String afinacao, String genero) throws Exception{
        super(formatosValidos, formato, tamanho, nome, nomeArtista);

        setAfinacao(afinacao);
        setGenero(genero);
    }

//    public Audio(int id, String formato, float tamanho, String nome, String nomeArtista, Cliente vencedor, String afinacao, String genero) throws Exception{
//        super(id, formatosValidos, formato, tamanho, nome, nomeArtista, vencedor);
//
//        setAfinacao(afinacao);
//        setGenero(genero);
//    }

    public void setAfinacao(String afinacao) {
        this.afinacao = afinacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAfinacao() {
        return this.afinacao;
    }

    public String getGenero() {
        return this.genero;
    }

    @Override
    public String formataCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.formataCsv());
        sb.append(getAfinacao());
        sb.append(";");
        sb.append(getGenero());
        sb.append(";");

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" - ");

        sb.append("Afinacao: ");
        sb.append(getAfinacao());
        sb.append(" - ");

        sb.append("Genero: ");
        sb.append(getGenero());

        return sb.toString();
    }
}

