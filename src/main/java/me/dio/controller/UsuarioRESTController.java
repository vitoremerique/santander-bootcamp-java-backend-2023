package me.dio.controller;

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
    public ResponseEntity<Usuario> findbyid(@PathVariable Long id){
        var Usuario = userService.findbyId(id);
        return ResponseEntity.ok(Usuario);
    }
    @GetMapping
    public ResponseEntity<List<Usuario>> getAll(){
        var Usuarios = userService.getAll();
        return ResponseEntity.ok(Usuarios);
    }


}
