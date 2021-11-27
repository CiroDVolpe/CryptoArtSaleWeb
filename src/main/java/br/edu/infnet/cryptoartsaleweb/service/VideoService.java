package br.edu.infnet.cryptoartsaleweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cryptoartsaleweb.model.domain.Video;
import br.edu.infnet.cryptoartsaleweb.repository.VideoRepository;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> obterLista(){
        return (List<Video>)videoRepository.findAll();
    }

    public void incluir(Video video){
        videoRepository.save(video);
    }
    
    public Video buscaPorId(Integer id){
        return videoRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        videoRepository.deleteById(id);
    }
}
