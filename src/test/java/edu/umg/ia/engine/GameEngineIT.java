package edu.umg.ia.engine;

import edu.umg.ia.engine.dao.HistoryDao;
import edu.umg.ia.engine.domain.History;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameEngineIT extends BaseITTest {

    @Autowired
    private GameEngine gameEngine;

    @Autowired
    private HistoryDao historyDao;

    @Test
    public void testStartGame() {
        String result = gameEngine.tell("iniciar juego");

        assertNotNull(result);
    }
}
