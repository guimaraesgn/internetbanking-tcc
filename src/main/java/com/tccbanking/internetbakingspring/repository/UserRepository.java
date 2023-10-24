package com.tccbanking.internetbakingspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.tccbanking.internetbakingspring.entities.User;


public interface UserRepository extends JpaRepository <User, String>{
    
    UserDetails findByLogin(String login);

}
