package com.tccbanking.internetbakingspring.controller;

import java.util.List;

import org.hibernate.annotations.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tccbanking.internetbakingspring.entities.Banco;
import com.tccbanking.internetbakingspring.repository.BancoRepository;

@RestController
@RequestMapping("/banco")
public class BancoController {

    private BancoRepository bancoRepository;

    public BancoController(BancoRepository bancoRepository) {
        this.bancoRepository = bancoRepository;
    }

    @GetMapping
    public List<Banco> list() {
        return bancoRepository.findAll();
    }

}
