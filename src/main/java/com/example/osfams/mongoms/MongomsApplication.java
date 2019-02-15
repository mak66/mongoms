package com.example.osfams.mongoms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class MongomsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongomsApplication.class, args);
	}

}

