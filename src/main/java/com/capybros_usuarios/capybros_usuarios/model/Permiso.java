package com.capybros_usuarios.capybros_usuarios.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "permisos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permiso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPermiso;

    // Aquí tambien le pide que se cree la columna que irá conectada con usuario
    // Con esto se indica que muchos permisos pueden pertenecer a un solo usuario
    // Esto determinado bajo su id y no puede estar vacía
    @ManyToOne
    @JoinColumn(name = "idUsuario, nullable = false")
    private Usuario usuario;

    @Column(nullable = false)
    private String rolUsuario;

}
