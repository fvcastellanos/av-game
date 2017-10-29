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

    @Test
    public void testGetInstructions() {
        Command result = parser.parse("repasar las instrucciones");
        assertEquals(CommandEnum.GET_INSTRUCTIONS, result.getCommand());

        result = parser.parse("leer instrucciones");
        assertEquals(CommandEnum.GET_INSTRUCTIONS, result.getCommand());
    }

    @Test
    public void testGetAClue() {
        Command result = parser.parse("ayuda");
        assertEquals(CommandEnum.CLUE, result.getCommand());

        result = parser.parse("no se que hacer");
        assertEquals(CommandEnum.CLUE, result.getCommand());
    }

    @Test
    public void testViewInventary() {
        Command result = parser.parse("consultar inventario");
        assertEquals(CommandEnum.VIEW_INVENTORY, result.getCommand());

        result = parser.parse("revisar el inventario");
        assertEquals(CommandEnum.VIEW_INVENTORY, result.getCommand());
    }

    @Test
    public void testTakeItem() {
        Command result = parser.parse("tomar el lapicero");
        assertEquals(CommandEnum.TAKE, result.getCommand());
        assertEquals("lapicero", result.getItem());

        result = parser.parse("recoger cuerda");
        assertEquals(CommandEnum.TAKE, result.getCommand());
        assertEquals("cuerda", result.getItem());
    }

    @Test
    public void testViewItem() {
        Command result = parser.parse("observar la ventana");
        assertEquals(CommandEnum.VIEW, result.getCommand());
        assertEquals("ventana", result.getItem());

        result = parser.parse("ver terminal");
        assertEquals(CommandEnum.VIEW, result.getCommand());
        assertEquals("terminal", result.getItem());
    }

    @Test
    public void testOpenItem() {
        Command result = parser.parse("abrir la ventana");
        assertEquals(CommandEnum.OPEN, result.getCommand());
        assertEquals("ventana", result.getItem());

        result = parser.parse("abrir la gaveta");
        assertEquals(CommandEnum.OPEN, result.getCommand());
        assertEquals("gaveta", result.getItem());
    }

    @Test
    public void testCloseItem() {
        Command result = parser.parse("cerrar ventana");
        assertEquals(CommandEnum.OPEN, result.getCommand());
        assertEquals("ventana", result.getItem());

        result = parser.parse("cerrar la gaveta");
        assertEquals(CommandEnum.OPEN, result.getCommand());
        assertEquals("gaveta", result.getItem());
    }

    @Test
    public void testWriteItem() {
        Command result = parser.parse("ingresar el codigo");
        assertEquals(CommandEnum.WRITE, result.getCommand());
        assertEquals("codigo", result.getItem());

        result = parser.parse("escribir la clave");
        assertEquals(CommandEnum.WRITE, result.getCommand());
        assertEquals("clave", result.getItem());
    }

}
