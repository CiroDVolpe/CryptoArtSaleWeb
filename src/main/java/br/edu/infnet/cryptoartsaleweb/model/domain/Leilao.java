package br.edu.infnet.cryptoartsaleweb.model.domain;

public class Leilao {
    private int id;
    private Funcionario responsavel;
    private CryptoArte cryptoArte;
    private Cliente ganhador;
    private float valorAtual;

    public Leilao(int id, Funcionario responsavel, CryptoArte cryptoArte) {
        setId(id);
        setResponsavel(responsavel);
        setCryptoArte(cryptoArte);
        setValorAtual(0);
    }

    public Leilao(int id, Funcionario responsavel, CryptoArte cryptoArte, Cliente ganhador, float valorAtual) {
        setId(id);
        setResponsavel(responsavel);
        setCryptoArte(cryptoArte);
        setGanhador(ganhador);
        setValorAtual(valorAtual);
    }

    private void setId(int id) {
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

    public int getId() {
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
