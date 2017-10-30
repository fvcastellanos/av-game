package edu.umg.ia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.umg.ia.command.CommandParser;

@Configuration
public class CommandConfig {

	@Bean
	public CommandParser commandParser() {
		return new CommandParser();
	}
	
}
