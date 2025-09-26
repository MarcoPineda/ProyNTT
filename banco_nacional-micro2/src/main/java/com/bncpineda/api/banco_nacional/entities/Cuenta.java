package com.bncpineda.api.banco_nacional.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Marco Pineda
 * @date 9/25/2025
 */


@Entity
@Getter
@Setter
public class Cuenta
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numero_cuenta;
    private String tipo_cuenta;
    private double saldo_inicial;
    private boolean estado;
    private Long id_cliente;
}
