package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Funcionario;
import br.edu.infnet.cryptoartsaleweb.service.FuncionarioService;
import javax.servlet.http.HttpSession;

@Controller
public class FuncionarioController {
	
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping(value = "/funcionario")
    public String telaCadastro(HttpSession session) {
        if(session.getAttribute("user") != null) {
            return "funcionario/form";
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/funcionario/list")
    public String telaLista(Model model, HttpSession session) {
        if(session.getAttribute("user") != null) {
            model.addAttribute("listaFuncionarios", funcionarioService.obterLista());

            return "funcionario/list";
        }

        return "redirect:/login";
    }

    @PostMapping(value = "/funcionario")
    public String incluir(Model model, Funcionario funcionario, HttpSession session) {
        if(session.getAttribute("user") != null) {
            try{
                funcionarioService.incluir(funcionario);

                model.addAttribute("nomeCriado", funcionario.getNome());

                return telaLista(model, session);
            } catch(Exception e){
                model.addAttribute("msg", e.getMessage());
                return "funcionario";
            }  
        }

        return "redirect:/login";
    }

    @GetMapping(value = "/funcionario/{id}/excluir")
    public String excluir(Model model, HttpSession session, @PathVariable Integer id) {
        if(session.getAttribute("user") != null) {
            Funcionario funcionario = funcionarioService.buscaPorId(id);
            model.addAttribute("nomeExcluido", funcionario.getNome());
            
            funcionarioService.excluir(id);

            return telaLista(model, session);
        }

        return "redirect:/login";
    }
    
}
