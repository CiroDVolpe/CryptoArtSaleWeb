package br.edu.infnet.cryptoartsaleweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cryptoartsaleweb.model.domain.Imagem;
import br.edu.infnet.cryptoartsaleweb.repository.ImagemRepository;

@Service
public class ImagemService {

    @Autowired
    private ImagemRepository imagemRepository;

    public List<Imagem> obterLista(){
        return (List<Imagem>)imagemRepository.findAll();
    }

    public void incluir(Imagem imagem){
        imagemRepository.save(imagem);
    }
    
    public Imagem buscaPorId(Integer id){
        return imagemRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        imagemRepository.deleteById(id);
    }
}
