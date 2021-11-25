package br.edu.infnet.cryptoartsaleweb.model.domain;

public class Video extends CryptoArte {

    private static String[] formatosValidos = {"avi", "mp4", "mov"};
    private String duracao;
    private String cameraUsada;
    private int fps;

    public Video(String formato, float tamanho, String nome, String nomeArtista, String duracao, String cameraUsada, int fps) throws Exception{
        super(formatosValidos, formato, tamanho, nome, nomeArtista);

        setDuracao(duracao);
        setCameraUsada(cameraUsada);
        setFps(fps);
    }

//    public Video(int id, String formato, float tamanho, String nome, String nomeArtista, Cliente vencedor, String duracao, String cameraUsada, int fps) throws Exception{
//        super(id, formatosValidos, formato, tamanho, nome, nomeArtista, vencedor);
//
//        setDuracao(duracao);
//        setCameraUsada(cameraUsada);
//        setFps(fps);
//    }

    private void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    private void setCameraUsada(String cameraUsada) {
        this.cameraUsada = cameraUsada;
    }

    private void setFps(int fps) {
        this.fps = fps;
    }

    private String getDuracao() {
        return this.duracao;
    }

    private String getCameraUsada() {
        return this.cameraUsada;
    }

    private int getFps() {
        return this.fps;
    }

    @Override
    public String formataCsv() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.formataCsv());
        sb.append(getDuracao());
        sb.append(";");
        sb.append(getCameraUsada());
        sb.append(";");
        sb.append(getFps());
        sb.append(";");

        return sb.toString();
    }
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" - ");

        sb.append("Duração: ");
        sb.append(getDuracao());
        sb.append(" - ");

        sb.append("Camera utilizada: ");
        sb.append(getCameraUsada());
        sb.append(" - ");

        sb.append("FPS: ");
        sb.append(getFps());

        return sb.toString();
    }
}

