package edu.umg.ia.command;

import edu.umg.ia.command.domain.Command;
import edu.umg.ia.command.domain.CommandEnum;
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
    public void testStartGameParse() {
        Command result = parser.parse("iniciar el juego");
        assertEquals(CommandEnum.START_GAME, result.getCommand());

        result = parser.parse("comenzar juego");
        assertEquals(CommandEnum.START_GAME, result.getCommand());
    }

    @Test
    public void testUseItemParse() {
        Command result = parser.parse("utilizar llave en la puerta");
        assertEquals(CommandEnum.USE, result.getCommand());
        assertEquals(result.getItem(), "llave");
        assertEquals(result.getToItem(), "puerta");
    }
}
