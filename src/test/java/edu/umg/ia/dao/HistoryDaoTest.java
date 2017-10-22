package edu.umg.ia.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import edu.umg.ia.domain.Chapter;
import edu.umg.ia.domain.History;
import edu.umg.ia.domain.Thing;

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
    public void testGettingSingleChapter() {
    	String chapterName = "el molesto sonido de las alarmas";
    	History history = loadHistory();
    	
    	Optional<Chapter> chapterHolder = historyDao.getHistoryChapter(history, chapterName);
    	
    	assertTrue(chapterHolder.isPresent());
    	
    	Chapter chapter = chapterHolder.get();
    	assertEquals(chapter.getName(), chapterName);
    }
    
    @Test
    public void testWhenGettingThingsForExistingChapterReturnList() {
    	String chapterName = "el molesto sonido de las alarmas";
    	History history = loadHistory();
    	
    	List<Thing> things = historyDao.getThingsForChapter(history, chapterName);

    	assertNotNull(things);
    	assertFalse(things.isEmpty());    	
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
