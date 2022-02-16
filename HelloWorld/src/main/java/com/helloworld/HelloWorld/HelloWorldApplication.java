package com.helloworld.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloWorldApplication {
	
	@GetMapping ("/rota1")
	public String ex1() {
		return "Peristência e Orientação aos Detalhes";
	}

	@GetMapping ("/rota2")
		public String ex2() {
			return "Dominar MySQL básico e dominar SpringBoot básico"; 
	} 
		
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
