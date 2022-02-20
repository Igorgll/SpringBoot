package com.helloworld.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController 
@RequestMapping
public class HelloWorldApplication {
	
	@GetMapping ("/rota1")
	public String ex1() {
		return "<h1> Peristência e Orientação aos Detalhes </h1>";
	}

	@GetMapping ("/rota2")
		public String ex2() {
			return "<h1> Dominar MySQL básico e dominar SpringBoot básico </h1>"; 
	} 
		
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
