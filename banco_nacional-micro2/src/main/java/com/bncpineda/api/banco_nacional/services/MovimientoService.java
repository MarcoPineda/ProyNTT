package com.bncpineda.api.banco_nacional.services;

import com.bncpineda.api.banco_nacional.entities.Movimiento;
import com.bncpineda.api.banco_nacional.repositories.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Marco Pineda
 * @date 9/25/2025
 */

@Service
public class MovimientoService
{
    @Autowired
    private MovimientoRepository movimientoRepository;

    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    public Optional<Movimiento> findById(Long id) {
        return movimientoRepository.findById(id);
    }

    public Movimiento save(Movimiento movimiento) {
        return movimientoRepository.save(movimiento);
    }

    public void deleteById(Long id) {
        movimientoRepository.deleteById(id);
    }

    public List<Movimiento> findByCuentaIdAndFechaBetween(Long id, Date startDate, Date endDate) {
        return movimientoRepository.findByCuentaIdAndFechaBetween(id, startDate, endDate);
    }
}
