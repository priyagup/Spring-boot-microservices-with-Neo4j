package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
public class ProductInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInfoServiceApplication.class, args);
	}

}
