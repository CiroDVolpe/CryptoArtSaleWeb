package br.edu.infnet.cryptoartsaleweb.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.cryptoartsaleweb.model.domain.Usuario;
import br.edu.infnet.cryptoartsaleweb.service.UsuarioService;
import org.springframework.web.bind.annotation.SessionAttribute;

@SessionAttributes("user")
@Controller
public class AcessoController {
    
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/login")
    public String telaLogin(Model model) {
        return "login";
    }
    
    @GetMapping(value = "/password_recovery")
    public String telaSenha() {
        return "usuario/password_recovery";
    }
    
    @GetMapping(value = "/")
    public String telaIndex(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "index";
        }
        return "redirect:/login";
    }

    @PostMapping(value = "/login")
    public String telaIndex(Model model, HttpSession session, @RequestParam String email, @RequestParam String senha) {

        Usuario usuario = usuarioService.autenticacao(email, senha);

        if(usuario != null) {
            session.setAttribute("user", usuario);
            model.addAttribute("user", usuario);

            return "redirect:/";
        } else {
            model.addAttribute("msg", email + ", Autenticação falhou, tente novamente.");

            return "login";
        }
    }
    
    @PostMapping(value = "/password_recovery")
    public String telaSenha(Model model, HttpSession session, Usuario usuario) {
        Usuario novoUsuario = usuarioService.alterarSenha(usuario);
        
        if(novoUsuario != null) {
            model.addAttribute("msg", "Sua senha foi alterada, faça seu login.");

            return telaLogin(model);
        } else {
            model.addAttribute("msg", "Nome e email não condizentes.");

            return "usuario/password_recovery";
        }
    }
    
    @GetMapping(value = "/logout")
    public String telaLogout(HttpSession session, SessionStatus status) {
        status.setComplete();

        session.removeAttribute("user");

        return "redirect:/login";
    }
}
