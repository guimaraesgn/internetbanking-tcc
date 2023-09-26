package com.tccbanking.internetbakingspring.service.implement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tccbanking.internetbakingspring.service.LoginService;

@Service
public class LoginServiceImplement implements LoginService {

 
    public ResponseEntity init() {

        return new ResponseEntity("Primeiro método ResFull", HttpStatus.OK);
    }



}
