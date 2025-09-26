package com.test.api.banco_nacional.service;

import com.test.api.banco_nacional.entities.Persona;
import com.test.api.banco_nacional.repositories.PersonaRepository;
import com.test.api.banco_nacional.services.PersonaService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */


public class PersonaServiceTest
{
    @Mock
    private PersonaRepository personaRepository;

    @InjectMocks
    private PersonaService personaService;

    public PersonaServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSaveCliente() {
        Persona persona = new Persona();
        persona.setNombre("Jose Lema");
        when(personaRepository.save(persona)).thenReturn(persona);
        Persona savedPersona = personaService.save(persona);
        assertEquals(persona.getNombre(), savedPersona.getNombre());
    }
}
