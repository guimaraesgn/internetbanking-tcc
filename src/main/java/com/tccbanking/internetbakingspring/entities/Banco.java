package com.tccbanking.internetbakingspring.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Banco implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//anotação para geração do valor da chave-primária é de responsabilidade do banco de dados.
    private Long Id;

    public Long getTenantId(){
        return this.Id;
    }

    
    private String name;
   
    private String cliente;
  
    private String conta;

    private String funcionario;

    private String agencia;
    


    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
