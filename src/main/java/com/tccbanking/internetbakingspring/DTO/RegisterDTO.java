package com.tccbanking.internetbakingspring.DTO;

import com.tccbanking.internetbakingspring.entities.Adress;
import com.tccbanking.internetbakingspring.enums.UserRole;

public record RegisterDTO(String login, String name, String password, String employee, String cpf, UserRole role,
        String email, String cep, String rua,
        String numero, String cidade, String bairro, String pais, String contato) {

}
