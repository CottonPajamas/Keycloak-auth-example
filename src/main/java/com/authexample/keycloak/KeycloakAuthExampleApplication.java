package com.authexample.keycloak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeycloakAuthExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeycloakAuthExampleApplication.class, args);
		System.out.println(">>> Starting...");
	}

}
