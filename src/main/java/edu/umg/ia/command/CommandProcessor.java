package edu.umg.ia.command;

import edu.umg.ia.engine.GameEngine;

public class CommandProcessor {
    private GameEngine gameEngine;

    public CommandProcessor(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    public String say(String command) {
        return processor(command);
    }

    private String processor(String command) {
        return "";
    }
}
