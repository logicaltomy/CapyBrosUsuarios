package com.capybros_usuarios.capybros_usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import java.time.LocalDateTime;

// Cris estuvo aqui :D

// Este paquete contiene todas las clases que van a estar en la BD
@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    // La ID será auto-incrementable y la PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    // El nombre no podrá ser nulo en la BD
    @Column(nullable = false)
    private String nombreUsuario;

    @Column(nullable = false)
    private String contrasena;

    private Boolean estado = true;

    // El atributo fechaCreacion será autogenerado
    // Y cada vez que se crea un nuevo usuario
    // Se le asignará la fecha actual
    @Column(nullable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();


    //@OneToMany: indica que un usuario puede tener muchos permisos.
    //CascadeType.ALL Si yo guardo, edito o borro un usuario, hago lo mismo con sus permisos.
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    // Es una lista ya que un usuario puede tener muchos permisos
    private List<Permiso> permisosList;





    


}
