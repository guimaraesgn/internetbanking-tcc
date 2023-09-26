package com.tccbanking.internetbakingspring.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface LoginService{
    
    public ResponseEntity init();
}