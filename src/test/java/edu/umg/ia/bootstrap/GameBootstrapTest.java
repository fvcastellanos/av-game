package edu.umg.ia.bootstrap;

import edu.umg.ia.command.CommandProcessor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GameBootstrapTest {

    private GameBootstrap gameBootstrap;

    @Before
    public void setup() {
        gameBootstrap = new GameBootstrap("astronauta");
    }

    @Test
    public void testGameBootstrapGetCommandProcessor() {
        CommandProcessor commandProcessor = gameBootstrap.buildCommandProcessor();

        assertNotNull(commandProcessor);
    }
}
