package edu.umg.ia.engine.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import edu.umg.ia.engine.domain.Chapter;
import edu.umg.ia.engine.domain.History;
import edu.umg.ia.engine.domain.Thing;

public class HistoryDaoTest {

    private HistoryDao historyDao;

    @Before
    public void setup() {
        historyDao = new HistoryDao();
    }

    @Test
    public void testFileLoading() throws Exception {
        Optional<History> historyHolder = historyDao.loadHistory("astronauta.json");

        assertTrue(historyHolder.isPresent());
    }
    
    @Test
    public void testChapterLoading() {
    	History history = loadHistory();
    	
    	List<Chapter> chapters = historyDao.getHistoryChapters(history);
    	
    	assertNotNull(chapters);
    	assertFalse(chapters.isEmpty());
    }
    
    @Test
    public void testWhenGettingThingsForUnexistingChapterReturnEmptyList() {
    	String chapterName = "test-chapter";
    	History history = loadHistory();
    	
    	List<Thing> things = historyDao.getThingsForChapter(history, chapterName);

    	assertNotNull(things);
    	assertTrue(things.isEmpty());    	
    }
    
    private History loadHistory() {
        Optional<History> historyHolder = historyDao.loadHistory("astronauta.json");
        return historyHolder.get();    	
    }
    
    
}
