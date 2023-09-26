package com.tccbanking.internetbakingspring.entities;

import java.io.Serializable; //interface para serializar o objeto hashcode para trafegar pela rede e ser recuperado pela web depois, para melhorar a injeção no bd

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //Anotação apra transformar esta classe no banco de dados
@Table(name ="tb_login") //cria o a tabela no banco com nome específico.
public class Login implements Serializable {
    private static final long serialVersionUID = 1L; //

    @Id
    @GeneratedValue // anotação para criar id de forma sequancial - 1, 2, 3, etc.

    public Long id;
    public String name;
    public String login;
    public String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Login other = (Login) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
