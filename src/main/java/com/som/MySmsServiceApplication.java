package com.som;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication

public class MySmsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySmsServiceApplication.class, args);
	}
}
