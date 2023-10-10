package me.dio.service.impl;

import me.dio.model.Usuario;
import me.dio.repository.UsuarioRepository;
import me.dio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private  UsuarioRepository Usuariorepository;


    @Override
    public Usuario findbyId(Long id) {
        return Usuariorepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario usuarioParaCriar) {
        if(Usuariorepository.existsById(usuarioParaCriar.getId())){
            throw new IllegalArgumentException("Este usuário já existe!");
        }
        return Usuariorepository.save(usuarioParaCriar);
    }

    @Override
    public List<Usuario> getAll() {
        List<Usuario> listaUsuario = new ArrayList<>();
        if(!Usuariorepository.findAll().isEmpty()){
            Usuariorepository.findAll().forEach(usuario -> {listaUsuario.add(usuario);});
        }
        return listaUsuario;
    }
}
