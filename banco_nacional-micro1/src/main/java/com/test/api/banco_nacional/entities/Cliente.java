package com.test.api.banco_nacional.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Marco
 * @date 9/24/2025
 */

@Entity
@Getter
@Setter
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String contrasena;
    private boolean estado;


    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

}
