package edu.umg.ia.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import edu.umg.ia.command.CommandParser;

public class Application implements CommandLineRunner {

	@Autowired
	private CommandParser parser;
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hola mundo");
		
		parser.parse("iniciar juego");
		
	}

}
