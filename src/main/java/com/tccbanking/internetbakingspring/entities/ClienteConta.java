package com.tccbanking.internetbakingspring.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClienteConta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // anotação para geração do valor da chave-primária é de
                                                    // responsabilidade do banco de dados.
    private Long Id;

    private Integer SaldoConta;
    private Integer NumeroConta;
    private String StatusConta;
    private Date CreatedContaAt;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getSaldoConta() {
        return SaldoConta;
    }

    public void setSaldoConta(Integer saldoConta) {
        SaldoConta = saldoConta;
    }

    public Integer getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getStatusConta() {
        return StatusConta;
    }

    public void setStatusConta(String statusConta) {
        StatusConta = statusConta;
    }

    public Date getCreatedContaAt() {
        return CreatedContaAt;
    }

    public void setCreatedContaAt(Date createdContaAt) {
        CreatedContaAt = createdContaAt;
    }

}
