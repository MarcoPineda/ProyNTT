package com.bncpineda.api.banco_nacional.repositories;

import com.bncpineda.api.banco_nacional.entities.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;


/**
 * @author Marco
 * @date 9/25/2025
 */
public interface MovimientoRepository extends JpaRepository<Movimiento, Long>
{
    List<Movimiento> findByCuentaIdAndFechaBetween(Long id, Date startDate, Date endDate);
}
