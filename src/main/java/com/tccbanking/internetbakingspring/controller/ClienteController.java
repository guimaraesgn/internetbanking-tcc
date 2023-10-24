package com.tccbanking.internetbakingspring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tccbanking.internetbakingspring.entities.Banco;
import com.tccbanking.internetbakingspring.entities.Cliente;
import com.tccbanking.internetbakingspring.repository.BancoRepository;
import com.tccbanking.internetbakingspring.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes") //função para dermarcar o diretorio http
public class ClienteController {

    private ClienteRepository clienteRepository; 

     public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> list() {
        return clienteRepository.findAll();
    }

    
}
