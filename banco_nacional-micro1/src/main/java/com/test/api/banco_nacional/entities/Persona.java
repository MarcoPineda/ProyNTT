package com.test.api.banco_nacional.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */

@Entity
@Getter
@Setter
public class Persona
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String genero;
    private int edad;
    private String identificacion;
    private String direccion;
    private Date fecha_nac;
    private String telefono;
}
