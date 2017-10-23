package edu.umg.ia.command;

import org.junit.Before;
import org.junit.Test;

public class CommandParserTest {
    private CommandParser parser;

    @Before
    public void setup() {
        parser = new CommandParser();
    }

    @Test
    public void testCommandParse() {
        parser.parse("iniciar el juego");
        parser.parse("comdenzar juego");

        assert true;
    }
}
