package com.test.api.banco_nacional.services;

import com.test.api.banco_nacional.dtos.ClientePersonaDTO;
import com.test.api.banco_nacional.entities.Cliente;
import com.test.api.banco_nacional.entities.Persona;
import com.test.api.banco_nacional.repositories.ClienteRepository;
import com.test.api.banco_nacional.repositories.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Marco Pineda
 * @date 9/24/2025
 */

@Service
public class ClienteService
{
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return clienteRepository.findById(id);
    }


    @Transactional
    public Cliente save(ClientePersonaDTO clientePersonaDTO) {
        Persona persona = new Persona();
        persona.setNombre(clientePersonaDTO.getNombre());
        persona.setGenero(clientePersonaDTO.getGenero());
        persona.setEdad(clientePersonaDTO.getEdad());
        persona.setIdentificacion(clientePersonaDTO.getIdentificacion());
        persona.setDireccion(clientePersonaDTO.getDireccion());
        persona.setTelefono(clientePersonaDTO.getTelefono());

        Persona savedPersona = personaRepository.save(persona);

        Cliente cliente = new Cliente();
        cliente.setId_cliente(clientePersonaDTO.getId_cliente());
        cliente.setContrasena(clientePersonaDTO.getContrasena());
        cliente.setEstado(clientePersonaDTO.isEstado());
        cliente.setPersona(savedPersona);

        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

}
