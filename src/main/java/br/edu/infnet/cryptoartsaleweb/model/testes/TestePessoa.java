package br.edu.infnet.cryptoartsaleweb.model.testes;

import br.edu.infnet.cryptoartsaleweb.model.domain.Cliente;
import br.edu.infnet.cryptoartsaleweb.model.domain.Funcionario;
import java.util.Date;
import java.time.Instant;

public class TestePessoa {
    public static void main(String[] args){
        System.out.println("TESTE DE PESSOA");
        
        teste_criar_funcionario();
        teste_criar_cliente();
        teste_erro_nome();
        teste_erro_aniversario();  
    }
    
    private static void teste_criar_funcionario(){
        System.out.println("\nTeste de criação da funcionário com sucesso");
        
        try{
            Funcionario funcionario = new Funcionario(1, "Funfun", "teste@falso.com", "13988504938", Date.from(Instant.parse("1996-12-04T00:00:00.000Z")), 123);
            System.out.println(funcionario);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
    
    private static void teste_criar_cliente(){
        System.out.println("\nTeste de criação da cliente com sucesso");
        
        try{
            Cliente cliente = new Cliente(1, "Clienter", "teste@falso.com", "13988504938", Date.from(Instant.parse("1996-12-04T00:00:00.000Z")));
            System.out.println(cliente);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
    
    private static void teste_erro_nome(){
        System.out.println("\nTeste de erro de nome");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Cliente(1, "aa", "teste@falso.com", "13988504938", Date.from(Instant.parse("1996-12-04T00:00:00.000Z")));
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
    
    private static void teste_erro_aniversario(){
        System.out.println("\nTeste de erro de aniversário");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Cliente(1, "Clienter", "teste@falso.com", "13988504938", Date.from(Instant.parse("2025-12-04T00:00:00.000Z")));
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
}
