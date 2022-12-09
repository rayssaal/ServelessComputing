package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Olá 912, esse é o nosso servidor na nuvem. Criado com o objetivo de demonstrar um pouco melhor o nosso tema.
		\n\nEquipe: Rayssa, Isabele, Vitoria, Julia e Jousi
		\n\nObrigada pela atenção!";
	}
}