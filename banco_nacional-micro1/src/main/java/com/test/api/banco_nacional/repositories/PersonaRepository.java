package com.test.api.banco_nacional.repositories;

import com.test.api.banco_nacional.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */
public interface PersonaRepository extends JpaRepository<Persona, Long>
{

}
