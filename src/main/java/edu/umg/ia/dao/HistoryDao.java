package edu.umg.ia.dao;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;

import edu.umg.ia.domain.Chapter;
import edu.umg.ia.domain.History;
import edu.umg.ia.domain.Thing;
import io.vavr.control.Try;

public class HistoryDao {
	
    private Logger logger = LoggerFactory.getLogger(HistoryDao.class);

    public Optional<History> loadHistory(String sourceName) {
        Try<History> historyTry = Try.of(() -> {
            logger.info("Loading history file: {}", sourceName);
            ClassLoader classLoader = getClass().getClassLoader();
            String source = IOUtils.toString(classLoader.getResourceAsStream(sourceName));

            Gson gson = new Gson();
                        
            return gson.fromJson(source, History.class);
        }).recover(ex -> {
            logger.error("can't load history: {}", ex);
            return null;
        });

        return Optional.ofNullable(historyTry.get());
    }
    
    public Optional<Chapter> getHistoryChapter(History history, String chapterName) {
    	logger.info("Getting chapter: {} in history", chapterName);
    	
    	if (history == null) {
    		return Optional.empty();
    	}
    	
    	return history.getChapters().stream()
    			.filter(chapter -> chapter.getName().equals(chapterName))
    			.findFirst();
    }
    
    public List<Chapter> getHistoryChapters(History history) {
    	if ((history == null) || (history.getChapters() == null)) {
    		return Collections.emptyList();
    	}
    	
    	return history.getChapters();
    }
    
    public List<Thing> getThingsForChapter(History history, String chapterName) {
    	Optional<Chapter> chapterHolder = getHistoryChapters(history).stream()
    			.filter(chapter -> chapter.getName().equals(chapterName))
    			.findFirst();
    	
    	// Chapter not found
    	if (!chapterHolder.isPresent()) {
    		return Collections.emptyList();
    	}
    	
    	return chapterHolder.map(Chapter::getThings)
    			.orElse(Collections.emptyList());
    }

}
