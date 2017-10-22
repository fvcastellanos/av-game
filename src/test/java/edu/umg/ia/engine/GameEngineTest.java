package edu.umg.ia.engine;

import edu.umg.ia.dao.HistoryDao;
import edu.umg.ia.domain.GameStatus;
import edu.umg.ia.domain.History;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class GameEngineTest {
    private GameEngine gameEngine;
    private HistoryDao historyDao;

    @Before
    public void setup() {
        historyDao = new HistoryDao();
        gameEngine = new GameEngine("astronauta", historyDao);
    }

    @Test
    public void testGameEngineLoading() {
        String result = gameEngine.startGame();

        assertEquals(result, "Game loaded");

        GameState gameState = gameEngine.getGameState();

        assertEquals(GameStatus.STARTED, gameState.getStatus()._1);
        assertEquals("Game loaded", gameState.getStatus()._2);
    }

    @Test
    public void testHistoryOverview() {
        Optional<History> historyOptional = historyDao.loadHistory("astronauta.json");
        History history = historyOptional.get();

        gameEngine.startGame();
        Map<String, String> overview = gameEngine.getHistoryOverview();

        assertEquals(history.getTitle(), overview.get("title"));
        assertEquals(history.getIntro(), overview.get("intro"));
        assertEquals(history.getEpilogue(), overview.get("epilogue"));
    }
}
