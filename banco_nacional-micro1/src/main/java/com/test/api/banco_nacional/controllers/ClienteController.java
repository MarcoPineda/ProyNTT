package com.test.api.banco_nacional.controllers;

import com.test.api.banco_nacional.dtos.ClientePersonaDTO;
import com.test.api.banco_nacional.entities.Cliente;
import com.test.api.banco_nacional.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Marco Pineda
 * Cr4eacion de controladores base de la consulta
 * @date 9/24/2025
 */
@RestController
@RequestMapping("/clientes")

public class ClienteController
{
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        return clienteService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cliente save(@RequestBody ClientePersonaDTO clientePersonaDTO) {
        return clienteService.save(clientePersonaDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody ClientePersonaDTO cliente) {
        return clienteService.findById(id)
                .map(existingCliente -> {
                    cliente.setId_cliente(existingCliente.getId_cliente());
                    return ResponseEntity.ok(clienteService.save(cliente));
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        return clienteService.findById(id)
                .map(cliente -> {
                    clienteService.deleteById(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
