package br.edu.infnet.cryptoartsaleweb.model.testes;

import br.edu.infnet.cryptoartsaleweb.model.domain.Leilao;
import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;
import br.edu.infnet.cryptoartsaleweb.model.domain.Cliente;
import br.edu.infnet.cryptoartsaleweb.model.domain.Funcionario;
import java.time.Instant;
import java.util.Date;

public class TesteLeilao {
    public static void main(String[] args){
        System.out.println("TESTE DE LEILÃO");
        
        teste_criar_leilao_novo();
        teste_criar_leilao_antigo();
    }
    
    private static void teste_criar_leilao_novo(){
        System.out.println("\nTeste de criação de leilão com sucesso");
        
        try{
            Funcionario funcionario = new Funcionario(1, "Funfun", "teste@falso.com", "13988504938", Date.from(Instant.parse("1996-12-04T00:00:00.000Z")), 123);
            Audio audio = new Audio("mp3", 324, "vinheta", "Jacaré", "C#", "Meme");
            
            Leilao leilao = new Leilao(1, funcionario, audio);
            System.out.println(leilao);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
    
    private static void teste_criar_leilao_antigo(){
        System.out.println("\nTeste de criação de leilão com sucesso");
        
        try{
            Funcionario funcionario = new Funcionario(1, "Funfun", "teste@falso.com", "13988504938", Date.from(Instant.parse("1996-12-04T00:00:00.000Z")), 123);
            Audio audio = new Audio("mp3", 324, "vinheta", "Jacaré", "C#", "Meme");
            Cliente cliente = new Cliente(2, "Clienter", "teste@falso.com", "13988504938", Date.from(Instant.parse("1996-12-04T00:00:00.000Z")));
            
            Leilao leilao = new Leilao(2, funcionario, audio, cliente, 123);
            System.out.println(leilao);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
}
