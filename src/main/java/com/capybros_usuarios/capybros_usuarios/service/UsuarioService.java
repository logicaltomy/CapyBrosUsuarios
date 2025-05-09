package com.capybros_usuarios.capybros_usuarios.service;

import com.capybros_usuarios.capybros_usuarios.model.Usuario;
import com.capybros_usuarios.capybros_usuarios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Permite gestionar y acceder a los datos

// Esta clase implementa la lógica del negocio relacionada a "Usuario"
@Service
public class UsuarioService {

    // Inyecta el repositorio para poder acceder a los datos de la base de datos
    @Autowired
    private UsuarioRepository usuarioRepo;

    // Método que devuelve todos los usuarios registrados
    public List<Usuario> listarUsuarios(){
        return usuarioRepo.findAll();
    }

    // Metódo que guarda un nuevo usuario en la base de datos
    public Usuario crearUsuario(Usuario u){
        return usuarioRepo.save(u);
    }

    // Método que busca un usuario por su nombre de usuario como tal
    public Optional<Usuario> buscarPorNombre(String nombreUsuario){
        return usuarioRepo.findByNombreUsuario(nombreUsuario);
    }
}
