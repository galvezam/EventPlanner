package com.galvez.developer.eventplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.galvez.developer.eventplanner.repository")
public class EventplannerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EventplannerApplication.class, args);
	}

}
