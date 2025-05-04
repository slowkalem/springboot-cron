package com.example.democron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemocronApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemocronApplication.class, args);
	}

}
