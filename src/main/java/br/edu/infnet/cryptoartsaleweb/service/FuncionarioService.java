package br.edu.infnet.cryptoartsaleweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cryptoartsaleweb.model.domain.Funcionario;
import br.edu.infnet.cryptoartsaleweb.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> obterLista(){
        return (List<Funcionario>)funcionarioRepository.findAll();
    }

    public void incluir(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }
    
    public Funcionario buscaPorId(Integer id){
        return funcionarioRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        funcionarioRepository.deleteById(id);
    }
}
