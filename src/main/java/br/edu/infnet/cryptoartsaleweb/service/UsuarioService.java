package br.edu.infnet.cryptoartsaleweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.cryptoartsaleweb.model.domain.Usuario;
import br.edu.infnet.cryptoartsaleweb.repository.UsuarioRepository;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario autenticacao(String email, String senha) {
        return usuarioRepository.autenticacao(email, senha);
    }

    public void incluir(Usuario usuario) throws Exception {
        if(
            usuario.getEmail().isEmpty() ||
            usuario.getNome().isEmpty() ||
            usuario.getSenha().isEmpty()
        ){
            throw new Exception();
        }
        usuarioRepository.save(usuario);
    }
    
    public Usuario alterarSenha(Usuario usuarioTeste) {
        Usuario usuario = usuarioRepository.identificacao(usuarioTeste.getEmail(), usuarioTeste.getNome());
        
        if(usuario != null){
            usuario.setSenha(usuarioTeste.getSenha());
            usuarioRepository.save(usuario);
        }
        
        return usuario;
    }
    
    public List<Usuario> obterLista(){
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
