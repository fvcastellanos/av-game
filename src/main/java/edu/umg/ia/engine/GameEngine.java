package edu.umg.ia.engine;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.umg.ia.dao.HistoryDao;
import edu.umg.ia.domain.History;

public class GameEngine {

	private Logger logger = LoggerFactory.getLogger(GameEngine.class);
	private String historyFile;
	private History history;
	private HistoryDao historyDao;
	
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
		logger.info("History: {} loaded", history.getTitle());
		return "Game loaded";
	}
	
}
