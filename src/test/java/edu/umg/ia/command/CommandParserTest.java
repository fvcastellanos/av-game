package edu.umg.ia.command;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommandParserTest {
    private CommandParser parser;

    @Before
    public void setup() {
        parser = new CommandParser();
    }

    @Test
    public void testCommandParse() {
        String result = parser.parse("iniciar el juego");

        assertEquals("iniciar juego", result);

        result = parser.parse("comdenzar juego");

        assertEquals("lo siento, no entiendo...", result);
    }
}
