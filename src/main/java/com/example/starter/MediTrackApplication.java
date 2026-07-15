package com.example.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"com.example.starter", "com.example.entities"})
@EntityScan(basePackages = "com.example.entities")
@EnableJpaRepositories(basePackages = "com.example.starter") 
public class MediTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediTrackApplication.class, args);
	}

}
