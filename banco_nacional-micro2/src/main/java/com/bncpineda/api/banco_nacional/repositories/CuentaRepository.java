package com.bncpineda.api.banco_nacional.repositories;

import com.bncpineda.api.banco_nacional.entities.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marco
 * @date 9/25/2025
 */
public interface CuentaRepository extends JpaRepository<Cuenta, Long>
{

}
