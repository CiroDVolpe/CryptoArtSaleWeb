package br.edu.infnet.cryptoartsaleweb.model.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class Imagem extends CryptoArte {
    
    private static String[] formatosValidos = {"jpeg", "svg", "pdf"};
    private String corPredominante;
    private boolean somenteDigital;
    
    public Imagem() {}

    public Imagem(String formato, float tamanho, String nome, String nomeArtista, String corPredominante, boolean somenteDigital) throws Exception{
        super(formatosValidos, formato, tamanho, nome, nomeArtista);

        setCorPredominante(corPredominante);
        setSomenteDigital(somenteDigital);
    }

//    public Imagem(int id, String formato, float tamanho, String nome, String nomeArtista, Cliente vencedor, String corPredominante, boolean somenteDigital) throws Exception{
//        super(id, formatosValidos, formato, tamanho, nome, nomeArtista, vencedor);
//
//        setCorPredominante(corPredominante);
//        setSomenteDigital(somenteDigital);
//    }

    private void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    private void setSomenteDigital(boolean somenteDigital) {
        this.somenteDigital = somenteDigital;
    }

    public String getCorPredominante() {
        return this.corPredominante;
    }

    public boolean getSomenteDigital() {
        return this.somenteDigital;
    }

    @Override
    public String formataCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.formataCsv());
        sb.append(getCorPredominante());
        sb.append(";");
        sb.append(getSomenteDigital());
        sb.append(";");

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" - ");

        sb.append("Cor predominante: ");
        sb.append(getCorPredominante());
        sb.append(" - ");

        sb.append("Somente digital: ");
        sb.append(getSomenteDigital());

        return sb.toString();
    }
}

