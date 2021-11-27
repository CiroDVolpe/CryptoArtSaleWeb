package br.edu.infnet.cryptoartsaleweb.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Leilao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "responsavel_id", referencedColumnName = "id")
    private Funcionario responsavel;
    @OneToOne
    @JoinColumn(name = "crypto_arte_id", referencedColumnName = "id")
    private CryptoArte cryptoArte;
    @OneToOne
    @JoinColumn(name = "ganhador_id", referencedColumnName = "id")
    private Cliente ganhador;
    // ManyToMany Participantes
    private float valorAtual;

    public Leilao(){}
    
    public Leilao(Funcionario responsavel, CryptoArte cryptoArte) {
        setId(id);
        setResponsavel(responsavel);
        setCryptoArte(cryptoArte);
        setValorAtual(0);
    }

    public Leilao(Funcionario responsavel, CryptoArte cryptoArte, Cliente ganhador, float valorAtual) {
        setId(id);
        setResponsavel(responsavel);
        setCryptoArte(cryptoArte);
        setGanhador(ganhador);
        setValorAtual(valorAtual);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private void setResponsavel(Funcionario responsavel) {
        this.responsavel = responsavel;
    }

    private void setCryptoArte(CryptoArte cryptoArte) {
        this.cryptoArte = cryptoArte;
    }

    public void setGanhador(Cliente ganhador) {
        this.ganhador = ganhador;
    }

    public void setValorAtual(float valorAtual) {
        this.valorAtual = valorAtual;
    }

    public Integer getId() {
        return this.id;
    }

    public Funcionario getResponsavel() {
        return this.responsavel;
    }

    public CryptoArte getCryptoArte() {
        return this.cryptoArte;
    }

    public Cliente getGanhador() {
        return this.ganhador;
    }

    public float getValorAtual() {
        return this.valorAtual;
    }

    public String formataCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append("L");
        sb.append(";");
        sb.append(getId());
        sb.append(";");
        sb.append(getResponsavel());
        sb.append(";");
        sb.append(getCryptoArte());
        sb.append(";");
        if (getGanhador() != null) {
            sb.append(getGanhador());
            sb.append(";");
        }
        sb.append(getValorAtual());
        sb.append(";");
        sb.append("\n");

        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getId());
        sb.append(" - ");

        sb.append("Responsável: ");
        sb.append(getResponsavel());
        sb.append(" - ");

        sb.append("Cripto Arte: ");
        sb.append(getCryptoArte());
        sb.append(" - ");

        if (getGanhador() != null) {
            sb.append("Ganhador: ");
            sb.append(getGanhador());
            sb.append(" - ");
        }

        sb.append("Valor atual: ");
        sb.append(getValorAtual());

        return sb.toString();
    }
}
