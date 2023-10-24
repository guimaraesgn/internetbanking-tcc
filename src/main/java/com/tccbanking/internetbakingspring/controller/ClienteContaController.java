package com.tccbanking.internetbakingspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tccbanking.internetbakingspring.entities.ClienteConta;
import com.tccbanking.internetbakingspring.repository.ClienteContaRepository;

@RestController
@RequestMapping("/clienteconta")
public class ClienteContaController {

    private ClienteContaRepository clienteContaRepository;

    public ClienteContaController(ClienteContaRepository clienteContaRepository) {
        this.clienteContaRepository = clienteContaRepository;
    }

    @GetMapping
    public List<ClienteConta> list() {
        return clienteContaRepository.findAll();
    }
    
}