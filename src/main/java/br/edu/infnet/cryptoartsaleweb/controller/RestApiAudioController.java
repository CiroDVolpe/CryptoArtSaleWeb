package br.edu.infnet.cryptoartsaleweb.controller;

import br.edu.infnet.cryptoartsaleweb.model.domain.Audio;
import br.edu.infnet.cryptoartsaleweb.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/audio")
public class RestApiAudioController {
    
    @Autowired
    private AudioService audioService;
    
    @GetMapping()
    public Iterable<Audio> listar(){
        return audioService.obterLista();
    }
    
    @PostMapping()
    public Audio salvar(@RequestBody Audio audio){
        return audioService.incluirRetornando(audio);
    }
}
