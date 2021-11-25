package br.edu.infnet.cryptoartsaleweb.model.testes;

import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;
import br.edu.infnet.cryptoartsaleweb.model.domain.Imagem;
import br.edu.infnet.cryptoartsaleweb.model.domain.Video;

public class TesteArte {
    public static void main(String[] args){
        System.out.println("\nTESTE DE ARTE");
        
        teste_criar_audio();
        teste_criar_imagem();
        teste_criar_video();
        teste_erro_nome();
        teste_erro_nome_artista();  
        teste_erro_formato_invalido();
    }
    
    private static void teste_criar_audio(){
        System.out.println("\nTeste de criação de áudio com sucesso");
        
        try{
            Audio audio = new Audio("mp3", 324, "vinheta", "Jacaré", "C#", "Meme");
            System.out.println(audio);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
    
    private static void teste_criar_imagem(){
        System.out.println("\nTeste de criação de imagem com sucesso");
        
        try{
            Imagem imagem = new Imagem("jpeg", 6545, "Paisagem", "Passarão", "Cinza", true);
            System.out.println(imagem);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }  
    }
    
    private static void teste_criar_video(){
        System.out.println("\nTeste de criação de vídeo com sucesso");
        
        try{
            Video video = new Video("mp4", 6545, "Paisagem", "Boberson", "04:54", "Canon v4", 21);
            System.out.println(video);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }  
    }
    
    private static void teste_erro_nome(){
        System.out.println("\nErro de nome");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Audio("mp3", 324, "aa", "Jacaré", "C#", "Meme");
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
    
    private static void teste_erro_nome_artista(){
        System.out.println("\nTeste de erro de nome de artista");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Audio("mp3", 324, "Valido", "aa", "C#", "Meme");
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
    
    private static void teste_erro_formato_invalido(){
        System.out.println("\nTeste de erro de formato invalido");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Audio("mp6", 324, "Valido", "Valido", "C#", "Meme");
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
}
