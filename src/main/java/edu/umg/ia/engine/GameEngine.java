package edu.umg.ia.engine;

import com.google.common.collect.Maps;
import edu.umg.ia.dao.HistoryDao;
import edu.umg.ia.domain.Chapter;
import edu.umg.ia.domain.GameStatus;
import edu.umg.ia.domain.History;
import io.vavr.Tuple;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public class GameEngine {

	private Logger logger = LoggerFactory.getLogger(GameEngine.class);
	private String historyFile;
	private History history;
	private HistoryDao historyDao;
	private GameState gameState;
	
	public GameEngine(String historyName, HistoryDao historyDao) {
		this.historyFile = historyName + ".json";
		this.historyDao = historyDao;
	}
	
	public String startGame() {
		logger.info("Starting game: {}", historyFile);
		Optional<History> historyHolder = historyDao.loadHistory(historyFile);
		
		if (!historyHolder.isPresent()) {
			logger.error("Can't load game: {}", historyFile);
			return "Can't load game";
		}
	
		history = historyHolder.get();
		gameState = new GameState(loadFirstChapter(), Tuple.of(GameStatus.STARTED, "Game loaded"));
		logger.info("History: {} loaded", history.getTitle());
		return "Game loaded";
	}

	public GameState getGameState() {
	    return gameState;
    }

    public Map<String, String> getHistoryOverview() {
	    if (history == null) {
	        return Collections.emptyMap();
        }

        Map<String, String> overview = Maps.newHashMap();
	    overview.put("title", history.getTitle());
	    overview.put("intro", history.getIntro());
	    overview.put("epilogue", history.getEpilogue());

	    return overview;
    }

    public Map<String, String> getChapterOverview() {
        if (history == null) {
            return Collections.emptyMap();
        }

        Chapter chapter = loadFirstChapter();

        Map<String, String> overview = Maps.newHashMap();
        overview.put("name", chapter.getName());
        overview.put("intro", chapter.getIntro());
        overview.put("epilogue", chapter.getEpilogue());

        return overview;
    }

	private Chapter loadFirstChapter() {
		Optional<Chapter> chapter = historyDao.getFirstChapter(history);
		return chapter.orElse(new Chapter());
	}
	
}