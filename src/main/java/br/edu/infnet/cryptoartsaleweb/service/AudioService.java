package br.edu.infnet.cryptoartsaleweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;
import br.edu.infnet.cryptoartsaleweb.repository.AudioRepository;

@Service
public class AudioService {

    @Autowired
    private AudioRepository audioRepository;

    public List<Audio> obterLista(){
        return (List<Audio>)audioRepository.findAll();
    }

    public void incluir(Audio audio){
        audioRepository.save(audio);
    }
    
    public Audio buscaPorId(Integer id){
        return audioRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        audioRepository.deleteById(id);
    }
}
