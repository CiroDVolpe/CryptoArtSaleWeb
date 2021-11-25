package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;
import br.edu.infnet.cryptoartsaleweb.service.AudioService;
import javax.servlet.http.HttpSession;

@Controller
public class AudioController {
	
    @Autowired
    private AudioService audioService;

    @GetMapping(value = "/audio")
    public String telaCadastro(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "audio/form";
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/audio/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaAudios", audioService.obterLista());

            return "audio/list";
        }

        return "redirect:/login";
    }

    @PostMapping(value = "/audio")
    public String incluir(Model model, Audio audio, HttpSession session) {
        if(session.getAttribute("user") != null) {
            audioService.incluir(audio);

            model.addAttribute("nomeCriado", audio.getNome());

            return telaLista(model, session);
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/audio/{id}/excluir")
    public String excluir(Model model, HttpSession session, @PathVariable Integer id) {
        if(session.getAttribute("user") != null) {
            Audio audio = audioService.buscaPorId(id);
            model.addAttribute("nomeExcluido", audio.getNome());
            
            audioService.excluir(id);

            return telaLista(model, session);
        }

        return "redirect:/login";
    }
    
}
