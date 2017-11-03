package edu.umg.ia.config;

import edu.umg.ia.command.CommandParser;
import edu.umg.ia.engine.GameEngine;
import edu.umg.ia.engine.dao.HistoryDao;
import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;
import edu.umg.ia.engine.inventory.ThingInventory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.StateMachine;

@Configuration
public class EngineConfig {

    @Bean
    public ThingInventory thingInventory() {
        return new ThingInventory();
    }

    @Bean
    public HistoryDao historyDao() {
        return new HistoryDao();
    }

    @Bean
    public GameEngine gameEngine(HistoryDao historyDao,
                                 ThingInventory thingInventory,
                                 StateMachine<GameState, GameEvent> stateMachine,
                                 CommandParser commandParser) {
        return new GameEngine("astronauta", historyDao, thingInventory, stateMachine, commandParser);
    }
}
