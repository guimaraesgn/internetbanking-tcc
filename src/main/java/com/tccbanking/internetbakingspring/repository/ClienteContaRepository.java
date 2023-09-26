package com.tccbanking.internetbakingspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tccbanking.internetbakingspring.entities.ClienteConta;


@Repository
public interface ClienteContaRepository extends JpaRepository<ClienteConta, Long>{
    
}
