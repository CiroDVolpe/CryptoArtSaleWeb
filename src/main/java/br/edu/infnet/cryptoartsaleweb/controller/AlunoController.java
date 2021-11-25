package br.edu.infnet.cryptoartsaleweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.cryptoartsaleweb.model.domain.Aluno;

@Controller
public class AlunoController {
    @GetMapping(value = "/aluno")
    public String telaCadastro() {
        return "aluno/cadastro";
    }

    @PostMapping(value = "/aluno/incluir")
    public String incluir(Aluno aluno) {
        aluno.impressao();

        return "confirmacao";
    }
}
