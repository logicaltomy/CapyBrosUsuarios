package com.capybros_usuarios.capybros_usuarios.repository;
import com.capybros_usuarios.capybros_usuarios.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// Solo se encarga de acceder a los datos

// Esto me permitirá acceder a la BD sin la necesidad de escribir consultas SQL
// Esto hereda de JpaRepository todos los métodos CRUD para la clase Usuario
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Se usa optional para controlar los nulos. Si encuentra un objeto lo retorna, sino el valor es nulo
    //Buscar por Id
    Optional<Usuario> findByIdUsuario(Long idUsuario);

    //Buscar por nombre de usuario
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);


}
