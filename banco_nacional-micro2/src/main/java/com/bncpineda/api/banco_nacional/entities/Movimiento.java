package com.bncpineda.api.banco_nacional.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Marco
 * @date 9/25/2025
 */

@Entity
@Getter
@Setter
public class Movimiento
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private String tipo_movimiento;
    private double valor;
    private double saldo;

//relacion de ingreso, registro enlace con la entidad cuenta
    @ManyToOne
    @JoinColumn(name = "id_cuenta", nullable = false)
    private Cuenta cuenta;
}
