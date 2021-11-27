package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Usuario;
import br.edu.infnet.cryptoartsaleweb.service.UsuarioService;
import javax.servlet.http.HttpSession;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/usuario")
    public String telaCadastro() {
        return "usuario/create";
    }
    
    @GetMapping(value = "/usuario/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaUsuarios", usuarioService.obterLista());

            return "usuario/list";
        }
        
        return "redirect:/login";
    }

    @PostMapping(value = "/usuario")
    public String incluir(Model model, Usuario usuario) {
        try{
            usuarioService.incluir(usuario);
            model.addAttribute("msg", "Cadastro realizado com sucesso. Faça seu login para entrar.");

            return "login";
        } catch(Exception e){
            model.addAttribute("msg", "Todos os campos são obrigatórios, preencha-os e tente novamente.");
            
            return "usuario/create";
        }  
    }
}
