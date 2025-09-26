package com.test.api.banco_nacional.repositories;

import com.test.api.banco_nacional.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
