package com.bncpineda.api.banco_nacional.service;

import com.bncpineda.api.banco_nacional.entities.Cuenta;
import com.bncpineda.api.banco_nacional.repositories.CuentaRepository;
import com.bncpineda.api.banco_nacional.services.CuentaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * @author Marco Pineda
 * @date 9/25/2025
 */


public class CuentaServiceTest
{

    @Mock
    private CuentaRepository cuentaRepository;

    @InjectMocks
    private CuentaService cuentaService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveCuenta() {
        Cuenta cuenta = new Cuenta();
        cuenta.setNumero_cuenta("1234567890");
        cuenta.setTipo_cuenta("Ahorros");
        cuenta.setSaldo_inicial(1000.0);
        cuenta.setEstado(true);

        when(cuentaRepository.save(any(Cuenta.class))).thenReturn(cuenta);

        Cuenta savedCuenta = cuentaService.save(cuenta);

        assertNotNull(savedCuenta);
        assertEquals("1234567890", savedCuenta.getNumero_cuenta());
        assertEquals("Ahorros", savedCuenta.getTipo_cuenta());
        assertEquals(1000.0, savedCuenta.getSaldo_inicial());
        assertTrue(savedCuenta.isEstado());

        verify(cuentaRepository, times(1)).save(any(Cuenta.class));
    }
}
