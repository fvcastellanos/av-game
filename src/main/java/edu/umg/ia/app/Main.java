package edu.umg.ia.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class Main {

	public static void main(String [] args) {
		SpringApplication.run(AdventureGameApp.class, args);
	}

}
