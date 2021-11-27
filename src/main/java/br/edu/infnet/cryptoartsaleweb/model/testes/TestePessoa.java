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
            Funcionario funcionario = new Funcionario("Funfun", "teste@falso.com", "13988504938", "2020-11-12", 123);
            System.out.println(funcionario);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
    
    private static void teste_criar_cliente(){
        System.out.println("\nTeste de criação da cliente com sucesso");
        
        try{
            Cliente cliente = new Cliente("Clienter", "teste@falso.com", "13988504938", "2020-11-12");
            System.out.println(cliente);
        } catch(Exception e) {
            System.out.println("FALHA! ERRO LANÇADO: " + e.getMessage());
        }
    }
    
    private static void teste_erro_nome(){
        System.out.println("\nTeste de erro de nome");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Cliente("aa", "teste@falso.com", "13988504938", "2020-11-12");
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
    
    private static void teste_erro_aniversario(){
        System.out.println("\nTeste de erro de aniversário");
        
        String mensagem = "FALHA! ERRO NÃO FOI LANÇADO";
        
        try{
            new Cliente("Clienter", "teste@falso.com", "13988504938","2020-11-12");
        } catch(Exception error) {
            mensagem = error.getMessage();
        }
        
        System.out.println(mensagem);
    }
}
