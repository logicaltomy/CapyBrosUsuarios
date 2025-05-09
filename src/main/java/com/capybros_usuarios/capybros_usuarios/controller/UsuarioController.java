package com.capybros_usuarios.capybros_usuarios.controller;

import com.capybros_usuarios.capybros_usuarios.model.Usuario;
import com.capybros_usuarios.capybros_usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Esto recibe las solicitudes del cliente y envía lo que se solicite
@RestController
//Lo que enlaza cada método a la api
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    // Permite que Spring entregue la instancia ya creada para usarla en PostMan
    @Autowired
    private UsuarioService usuarioService;

    // Esto indica que debe traer a todos los usuarios.
    // Enlaza métodos de Java a rutas de una API REST
    @GetMapping
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return ResponseEntity.ok(usuarioService.listarUsuarios());
    }

    // Puedes crear un usuario
    //ResponseEntity devuelve una respuesta HTTP
    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario u){
        return ResponseEntity.ok(usuarioService.crearUsuario(u));
    }

    @GetMapping("/{nombreUsuario}")
    public ResponseEntity<Usuario> buscarPorNombre(@PathVariable String nombreUsuario){
        return usuarioService.buscarPorNombre(nombreUsuario)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
