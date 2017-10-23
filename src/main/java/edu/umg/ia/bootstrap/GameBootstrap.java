package edu.umg.ia.bootstrap;

import edu.umg.ia.command.CommandProcessor;
import edu.umg.ia.dao.HistoryDao;
import edu.umg.ia.engine.GameEngine;
import edu.umg.ia.engine.ThingInventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.util.Objects.isNull;

public class GameBootstrap {
    private Logger logger = LoggerFactory.getLogger(GameBootstrap.class);

    private String gameFile;
    private HistoryDao historyDao;
    private ThingInventory thingInventory;
    private GameEngine gameEngine;
    private CommandProcessor commandProcessor;

    public GameBootstrap(String gameFile) {
        this.gameFile = gameFile;
    }

    public CommandProcessor buildCommandProcessor() {
        if (isNull(commandProcessor)) {
            commandProcessor = new CommandProcessor(buildGameEngine());
        }

        return commandProcessor;
    }

    private HistoryDao buildHistoryDao() {
        if (isNull(historyDao)) {
            this.historyDao = new HistoryDao();
        }

        return this.historyDao;
    }

    private ThingInventory buildThingInventory() {
        if (isNull(this.thingInventory)) {
            thingInventory = new ThingInventory();
        }

        return thingInventory;
    }

    private GameEngine buildGameEngine() {
        if (isNull(gameEngine)) {
            gameEngine = new GameEngine(gameFile, buildHistoryDao(), buildThingInventory());
        }

        return gameEngine;
    }
}
