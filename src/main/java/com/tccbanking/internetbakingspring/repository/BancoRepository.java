package com.tccbanking.internetbakingspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tccbanking.internetbakingspring.entities.Banco;

@Repository
public interface BancoRepository extends JpaRepository<Banco, Long> {
    
}
