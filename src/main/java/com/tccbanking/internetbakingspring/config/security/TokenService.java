package com.tccbanking.internetbakingspring.config.security;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.tccbanking.internetbakingspring.entities.User;

@Service
public class TokenService {
    
    @Value("${api.security.token.secret}")
    private String secret;


    //função para criação do token
    public String generateToke(User user){
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret); //funçao para criar tokenização unica
            String token = JWT.create()
            .withIssuer("auth-api")
            .withSubject(user.getLogin())
            .sign(algorithm);
            return token;
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Erro na criação do token", exception);

        }
    }

    //funçao para verificar o token, se esta expirado ou ativado, esta função avisa
        public String validateToken(String token){
            try {
                Algorithm algorithm = Algorithm.HMAC256(secret);
                return JWT.require(algorithm)   
                        .withIssuer("auth-api")
                        .build()
                        .verify(token)
                        .getSubject();
            } catch (JWTVerificationException exception) {
                return "";
            }
        }


    private Instant genExpirantionData(){
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
