package com.skaffolddemo.local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class LocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalApplication.class, args);
	}

}
