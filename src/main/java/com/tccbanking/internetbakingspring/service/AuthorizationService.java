package com.tccbanking.internetbakingspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import com.tccbanking.internetbakingspring.repository.UserRepository;

@Service
public class AuthorizationService implements UserDetailsService {

    @Autowired
    UserRepository repository;
    
   

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { //metodo para consultar os usuarios feito pelo spring security
        return repository.findByLogin(username);
    }

    

}
