package br.edu.infnet.cryptoartsaleweb.model.testes;

import java.io.BufferedReader;
import java.io.FileReader;

import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;

public class TesteLeituraArquivo {
    public static final String caminhoArquivo = "./src/main/java/cryptoartsale/dados.csv";

    public static void main(String[] args){
        System.out.println("TESTE DE LEITURA DE ARQUIVO");
        
        teste_importar_arquivo();
    }
    
    private static void teste_importar_arquivo(){
        System.out.println("Teste de arquivo importado com sucesso");
        
        try{
            FileReader arquivo = new FileReader(caminhoArquivo);
            BufferedReader leitura = new BufferedReader(arquivo);
 
            String linha = leitura.readLine();
            
            while(linha != null) {
                String[] campos = linha.split(";");
                
                try{
                    String formato = campos[2];
                    float tamanho = Float.parseFloat(campos[3]);
                    String nome = campos[4];
                    String nomeArtista = campos[5];
                    String afinacao = campos[6];
                    String tipo = campos[7];
                    
                    Audio audio = new Audio(formato, tamanho, nome, nomeArtista, afinacao, tipo);
                    
                    System.out.println(audio);
                } catch(Exception e){
                    System.out.println("Falha no import, erro: " + e.getMessage());
                } finally{
                    linha = leitura.readLine();
                }
            }
   
            leitura.close();
            arquivo.close();
            
            System.out.println("Arquivo escrito com sucesso!");
        } catch(Exception e) {
            System.out.println("FALHA! ERRO: " + e.getMessage());
        }
    } 
}
