package com.tccbanking.internetbakingspring.entities;

public record RegisterDTO(String login,String name, String password,String employee, String cpf, UserRole role) {
    
}
