package com.tccbanking.internetbakingspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tccbanking.internetbakingspring.config.security.TokenService;
import com.tccbanking.internetbakingspring.entities.AuthenticationDTO;
import com.tccbanking.internetbakingspring.entities.LoginResponseDTO;
import com.tccbanking.internetbakingspring.entities.RegisterDTO;
import com.tccbanking.internetbakingspring.entities.User;
import com.tccbanking.internetbakingspring.repository.UserRepository;

import jakarta.validation.Valid;


@RestController
@RequestMapping("auth")
@CrossOrigin(origins = "*")
public class AuthenticationController {

     @Autowired
     private TokenService tokenService;

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthenticationManager authenticationManager;

    
    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO data){
        var usernamePassword = new UsernamePasswordAuthenticationToken(data.login(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);
           
        var token = tokenService.generateToke((User)auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }


    //endpoint para criação do novo usuario
    
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO data){
        if(this.repository.findByLogin(data.login()) != null)return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(data.password());
            User newUser = new User(data.login(),data.name(),encryptedPassword,data.role(), data.employee(),data.cpf() );

            this.repository.save(newUser);

            return ResponseEntity.ok().build();
    }
    
}
