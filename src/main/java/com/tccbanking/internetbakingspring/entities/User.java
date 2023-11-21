package com.tccbanking.internetbakingspring.entities;

import java.util.Collection;
import java.util.List;

import org.hibernate.annotations.ManyToAny;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.tccbanking.internetbakingspring.enums.UserRole;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "users") // Anotação apra transformar esta classe no banco de dados
@Table(name = "users") // cria o a tabela no banco com nome específico.

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // anotação para criar id de forma sequancial - 1, 2, 3, etc.
    private Long id;
    private String name;
    private String login;
    private String password;
    private String cpf;
    private UserRole role;
    private String employee;// funcionario
    private String email;
    private String cep;
    private String bairro;
    private String cidade;
    private String pais;
    private String rua;
    private String numero;
    private String contato;

    public User(String login, String name, String password, UserRole role, String employee, String cpf, String email,
            String cep, String rua, String numero, String bairro, String cidade, String pais, String contato) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.employee = employee;
        this.cpf = cpf;
        this.role = role;
        this.email = email;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.contato = contato;

    }

    @Override // metodo para consultar quais as roles que o usuario tem, tem a função de
              // bloquear ou não o acesso
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if (this.role == UserRole.ADMIN)
            return List.of(new SimpleGrantedAuthority("ROLE_ADMIN"), new SimpleGrantedAuthority("ROLE_USER"));
        else
            return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}