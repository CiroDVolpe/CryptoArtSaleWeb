package br.edu.infnet.cryptoartsaleweb.controller;

import br.edu.infnet.cryptoartsaleweb.model.domain.Leilao;
import br.edu.infnet.cryptoartsaleweb.service.LeilaoService;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LeilaoController {
    
    @Autowired
    LeilaoService leilaoService;
    
    @GetMapping(value = "/leilao")
    public String telaCadastro(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "leilao/form";
        }

        return "redirect:/login";
    }
    
    @GetMapping(value = "/leilao/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaLeiloes", leilaoService.obterLista());

            return "leilao/list";
        }

        return "redirect:/login";
    }
    
    @PostMapping(value = "/leilao")
    public String incluir(Model model, Leilao leilao, HttpSession session) {
        if(session.getAttribute("user") != null) {
            try{
                leilaoService.incluir(leilao);

                model.addAttribute("nomeCriado", leilao.getId());

                return telaLista(model, session);
            } catch(Exception e){
                model.addAttribute("msg", e.getMessage());
                return "leilao";
            }  
        }

        return "redirect:/login";
    }
    
    @GetMapping(value = "/leilao/{id}/excluir")
    public String excluir(Model model, HttpSession session, @PathVariable Integer id) {
        if(session.getAttribute("user") != null) {
            Leilao leilao = leilaoService.buscaPorId(id);
            model.addAttribute("nomeExcluido", leilao.getId());
            
            leilaoService.excluir(id);

            return telaLista(model, session);
        }

        return "redirect:/login";
    }
}
