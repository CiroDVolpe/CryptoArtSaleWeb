package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Cliente;
import br.edu.infnet.cryptoartsaleweb.service.ClienteService;
import javax.servlet.http.HttpSession;

@Controller
public class ClienteController {
	
    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/cliente")
    public String telaCadastro(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "cliente/form";
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/cliente/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaClientes", clienteService.obterLista());

            return "cliente/list";
        }

        return "redirect:/login";
    }

    @PostMapping(value = "/cliente")
    public String incluir(Model model, Cliente cliente, HttpSession session) {
        if(session.getAttribute("user") != null) {
            try{
                clienteService.incluir(cliente);

                model.addAttribute("nomeCriado", cliente.getNome());

                return telaLista(model, session);
            } catch(Exception e){
                model.addAttribute("msg", e.getMessage());
                return "cliente";
            }  
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/cliente/{id}/excluir")
    public String excluir(Model model, HttpSession session, @PathVariable Integer id) {
        if(session.getAttribute("user") != null) {
            Cliente cliente = clienteService.buscaPorId(id);
            model.addAttribute("nomeExcluido", cliente.getNome());
            
            clienteService.excluir(id);

            return telaLista(model, session);
        }

        return "redirect:/login";
    }
    
}
