package com.capybros_usuarios.capybros_usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

// Este paquete contiene todas las clases que van a estar en la BD
@Entity
@Table(name = "usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    // La ID será auto-incrementable y la PK
    // Adding to this; the @Id indicates that it's the PK
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

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Permiso> permisos;





    


}
