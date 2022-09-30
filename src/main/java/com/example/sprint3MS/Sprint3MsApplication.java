package com.example.sprint3MS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.fiap.sprint3MS.controllers"})
@EnableJpaRepositories({"com.fiap.sprint3MS.repositories"})
public class Sprint3MsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sprint3MsApplication.class, args);
	}

}
