package com.tccbanking.internetbakingspring.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//anotação para geração do valor da chave-primária é de responsabilidade do banco de dados.
    private Long Id;

    private String Cpf;
    private String Name;
    private String Sobrenome;
    private String Senha;
    private String Email;
    private String Cep;
    private String Bairro;
    private String Cidade;      
    private String Pais;
    private String Rua;
    private String Numero;
    private String Contato;
    private String Conta;
    private Date createdAt;
    private Date updatedAt;


    
    public void setSenha(String senha) {
        Senha = senha;
    }
    public String getCep() {
        return Cep;
    }
    public String getNumero() {
        return Numero;
    }
    public String getContato() {
        return Contato;
    }
    public void setNumero(String numero) {
        Numero = numero;
    }
    public void setContato(String contato) {
        Contato = contato;
    }
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getSobrenome() {
        return Sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    
    public String getBairro() {
        return Bairro;
    }
    public void setBairro(String bairro) {
        Bairro = bairro;
    }
    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String cidade) {
        Cidade = cidade;
    }
    public String getPais() {
        return Pais;
    }
    public void setPais(String pais) {
        Pais = pais;
    }
    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }
       
    public String getConta() {
        return Conta;
    }
    public void setConta(String conta) {
        Conta = conta;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String cpf) {
        Cpf = cpf;
    }
    public void setCep(String cep) {
        Cep = cep;
    }
    public String getSenha() {
        return Senha;
    }
    
    

}
