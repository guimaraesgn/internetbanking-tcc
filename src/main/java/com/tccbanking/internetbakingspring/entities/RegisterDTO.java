package com.tccbanking.internetbakingspring.entities;

public record RegisterDTO(String login, String password, UserRole role) {
    
}
