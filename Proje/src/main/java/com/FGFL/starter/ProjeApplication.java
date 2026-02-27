package com.FGFL.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.FGFl")
@EntityScan(basePackages = "com.FGFl")
@EnableJpaRepositories(basePackages = "com.FGFL")
public class ProjeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjeApplication.class, args);
	}

}
