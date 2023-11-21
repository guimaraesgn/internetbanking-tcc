package com.tccbanking.internetbakingspring.entities;

import java.io.Serializable;

import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Banco implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//anotação para geração do valor da chave-primária é de responsabilidade do banco de dados.
    private Long Id;

    public Long getTenantId(){
        return this.Id;
    }
 
  
    private String conta;
    private String agencia;
    
    public Banco(){

    }
    
    
    
}
