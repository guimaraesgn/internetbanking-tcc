package com.tccbanking.internetbakingspring.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_adress")
@Getter
@Setter
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String cep;
    private String bairro;
    private String cidade;
    private String pais;
    private String rua;
    private String numero;
    private String contato;


    public Adress (Long id, String cep, String bairro, String cidade, String pais, String rua, String numero, String contato){

        this.id = id;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.rua = rua;
        this.numero = numero;
        this.contato = contato;
        
        }
       
}
