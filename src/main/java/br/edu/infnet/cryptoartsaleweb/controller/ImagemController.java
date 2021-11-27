package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Imagem;
import br.edu.infnet.cryptoartsaleweb.service.ImagemService;
import javax.servlet.http.HttpSession;

@Controller
public class ImagemController {
	
    @Autowired
    private ImagemService imagemService;

    @GetMapping(value = "/imagem")
    public String telaCadastro(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "imagem/form";
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/imagem/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaImagens", imagemService.obterLista());

            return "imagem/list";
        }

        return "redirect:/login";
    }

    @PostMapping(value = "/imagem")
    public String incluir(Model model, Imagem imagem, HttpSession session) {
        if(session.getAttribute("user") != null) {
            try{
                imagemService.incluir(imagem);

                model.addAttribute("nomeCriado", imagem.getNome());

                return telaLista(model, session);
            } catch(Exception e){
                model.addAttribute("msg", e.getMessage());
                return "imagem";
            } 
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/imagem/{id}/excluir")
    public String excluir(Model model, HttpSession session, @PathVariable Integer id) {
        if(session.getAttribute("user") != null) {
            Imagem imagem = imagemService.buscaPorId(id);
            model.addAttribute("nomeExcluido", imagem.getNome());
            
            imagemService.excluir(id);

            return telaLista(model, session);
        }

        return "redirect:/login";
    }
    
}
