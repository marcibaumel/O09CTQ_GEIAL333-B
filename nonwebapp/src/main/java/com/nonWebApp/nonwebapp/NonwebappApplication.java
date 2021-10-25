package com.nonWebApp.nonwebapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NonwebappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NonwebappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Teszt");
	}
}
