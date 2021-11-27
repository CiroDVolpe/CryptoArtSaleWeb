package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Video;
import br.edu.infnet.cryptoartsaleweb.service.VideoService;
import javax.servlet.http.HttpSession;

@Controller
public class VideoController {
	
    @Autowired
    private VideoService videoService;

    @GetMapping(value = "/video")
    public String telaCadastro(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "video/form";
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/video/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaVideos", videoService.obterLista());

            return "video/list";
        }

        return "redirect:/login";
    }

    @PostMapping(value = "/video")
    public String incluir(Model model, Video video, HttpSession session) {
        if(session.getAttribute("user") != null) {
            try{
                videoService.incluir(video);

                model.addAttribute("nomeCriado", video.getNome());

                return telaLista(model, session);
            } catch(Exception e){
                model.addAttribute("msg", e.getMessage());
                return "video";
            } 
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/video/{id}/excluir")
    public String excluir(Model model, HttpSession session, @PathVariable Integer id) {
        if(session.getAttribute("user") != null) {
            Video video = videoService.buscaPorId(id);
            model.addAttribute("nomeExcluido", video.getNome());
            
            videoService.excluir(id);

            return telaLista(model, session);
        }

        return "redirect:/login";
    }
    
}
