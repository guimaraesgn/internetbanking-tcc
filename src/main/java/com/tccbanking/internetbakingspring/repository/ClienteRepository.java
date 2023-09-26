package com.tccbanking.internetbakingspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tccbanking.internetbakingspring.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{


    
}
