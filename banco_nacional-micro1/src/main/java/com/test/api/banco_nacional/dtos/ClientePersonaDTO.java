package com.test.api.banco_nacional.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */

@Getter
@Setter
public class ClientePersonaDTO
{
    private Long id_persona;
    private String nombre;
    private String genero;
    private int edad;
    private String identificacion;
    private String direccion;
    private String telefono;
    private Long id_cliente;
    private String contrasena;
    private Date fecha_nac;
    private boolean estado;
}
