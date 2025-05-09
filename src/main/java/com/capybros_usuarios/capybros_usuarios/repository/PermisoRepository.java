package com.capybros_usuarios.capybros_usuarios.repository;
import com.capybros_usuarios.capybros_usuarios.model.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// Esta interfaz se usa para acceder a la BD sin la necesidad de escribir consultas SQL

public interface PermisoRepository extends JpaRepository<Permiso, Long> {

    // Buscar por idUsuario
    // A partir de la Id del usuario, se listarán aquellos permisos que este posee
    List<Permiso> findByUsuarioIdUsuario(Long idUsuario);
}
