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
    public void testStartGameParse() {
        String result = parser.parse("iniciar el juego");
        assertEquals(CommandEnum.START_GAME.getText(), result);

        result = parser.parse("comenzar juego");
        assertEquals(CommandEnum.START_GAME.getText(), result);
    }

    @Test
    public void testUseItemParse() {
        String result = parser.parse("utilizar llave en la puerta");
//        assertEquals(CommandEnum.START_GAME.getText(), result);

    }
}
