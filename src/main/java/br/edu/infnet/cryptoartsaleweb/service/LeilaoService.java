package br.edu.infnet.cryptoartsaleweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cryptoartsaleweb.model.domain.Leilao;
import br.edu.infnet.cryptoartsaleweb.repository.LeilaoRepository;

@Service
public class LeilaoService {

    @Autowired
    private LeilaoRepository leilaoRepository;

    public List<Leilao> obterLista(){
        return (List<Leilao>)leilaoRepository.findAll();
    }

    public void incluir(Leilao leilao){
        leilaoRepository.save(leilao);
    }
    
    public Leilao buscaPorId(Integer id){
        return leilaoRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        leilaoRepository.deleteById(id);
    }
}
