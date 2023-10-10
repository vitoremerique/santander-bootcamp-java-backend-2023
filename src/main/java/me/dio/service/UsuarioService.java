package me.dio.service;

import me.dio.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario findbyId(Long id);

    Usuario create (Usuario usuarioParaCriar);

    List<Usuario> getAll();
}
