package com.tccbanking.internetbakingspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.tccbanking.internetbakingspring.entities.Banco;
import com.tccbanking.internetbakingspring.repository.BancoRepository;


@SpringBootApplication
@EntityScan(basePackages = {"com.tccbanking.internetbakingspring.entities"})  //anotação para AO INICAR percorrer todas as classes criadas e criar tabelas no banco (função para não criar a configuração em XML)
@ComponentScan(basePackages = {"com.*"}) //função para ler todos os arquivos e iniciar o spring automaticamente *
@EnableTransactionManagement // faz o controle de transações do db, evita que os usarios deletem do db e outros usuarios tentar acessar o dado apagado
@EnableWebMvc //habilita o projeto a tambem usar MVC
@EnableAutoConfiguration // faz a configuração de todas as anotações do projeto
@RestController


public class InternetbakingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetbakingSpringApplication.class, args);
		
	}

	
	

}
