package io.getarrays.contactapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Contact Management Application
 * 
 * A Spring Boot application for managing contacts with REST API endpoints.
 * Features include CRUD operations for contacts and photo upload functionality.
 * 
 * @author Sharvesh S
 * @version 1.0.0
 * @since 2024
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}