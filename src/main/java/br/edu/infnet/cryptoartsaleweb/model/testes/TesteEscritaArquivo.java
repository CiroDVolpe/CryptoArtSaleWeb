package br.edu.infnet.cryptoartsaleweb.model.testes;

import java.io.BufferedWriter;
import java.io.FileWriter;

import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;

public class TesteEscritaArquivo {
    public static final String caminhoArquivo = "./src/main/java/cryptoartsale/dados.csv";
    
    public static void main(String[] args){
        System.out.println("TESTE DE ESCRITA DE ARQUIVO");

        teste_escrita_arquivo();
    }
    
    public static void teste_escrita_arquivo() {
        System.out.println("Teste arquivo escrito com sucesso");
        try {
            FileWriter arquivo = new FileWriter(caminhoArquivo);
            BufferedWriter escrita = new BufferedWriter(arquivo);
 
            Audio audio = new Audio("mp3", 324, "vinheta", "Jacaré", "C#", "Meme");

            escrita.write(audio.formataCsv());
            
            escrita.close();
            arquivo.close();
            
            System.out.println("Arquivo escrito com sucesso!");
        } catch(Exception e) {
            System.out.println("FALHA! ERRO: " + e.getMessage());
        }
    }
}
