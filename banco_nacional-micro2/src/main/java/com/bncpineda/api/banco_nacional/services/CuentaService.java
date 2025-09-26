package com.bncpineda.api.banco_nacional.services;

import com.bncpineda.api.banco_nacional.entities.Cuenta;
import com.bncpineda.api.banco_nacional.repositories.CuentaRepository;
import com.bncpineda.api.banco_nacional.errors.ErrorMessages;
import com.bncpineda.api.banco_nacional.exception.InvalidCuentaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

/**
 * @author Marco Pineda
 * @date 9/25/2025
 */

@Service
public class CuentaService
{
    @Autowired
    private CuentaRepository cuentaRepository;

    public List<Cuenta> findAll() {
        return cuentaRepository.findAll();
    }

    public Optional<Cuenta> findById(Long id) {
        return cuentaRepository.findById(id);
    }

    public Cuenta save(Cuenta cuenta) {
        if (ObjectUtils.isEmpty(cuenta.getId_cliente())) {
            throw new InvalidCuentaException(ErrorMessages.CLIENTE_ID_NULL);
        }
        return cuentaRepository.save(cuenta);
    }

    public void deleteById(Long id) {
        cuentaRepository.deleteById(id);
    }
}
