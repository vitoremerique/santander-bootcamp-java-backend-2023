package me.dio.controller;

import io.swagger.v3.oas.annotations.Operation;
import me.dio.model.Usuario;
import me.dio.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRESTController {
    private final UsuarioService userService;

    public UsuarioRESTController(UsuarioService UserService){
        this.userService = UserService;
    }

    @Operation(summary = "Cria usuário no banco de dados com sua determinadas informações")
    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario user){
        var usuarioCriado = userService.create(user);
        URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarioCriado.getId())
                .toUri();
        return ResponseEntity.created(location).body(usuarioCriado);
    }

    @GetMapping("/usuarios/{id}")
    @Operation(summary = "Busca usuário por id")
    public ResponseEntity<Usuario> findbyid(@PathVariable Long id){
        var Usuario = userService.findbyId(id);
        return ResponseEntity.ok(Usuario);
    }

    @Operation(summary = "Retorna todos os usuários do banco")
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){
        var Usuarios = userService.getAll();
        return ResponseEntity.ok(Usuarios);
    }


}
