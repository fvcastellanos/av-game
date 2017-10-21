package edu.umg.ia.dao;

import edu.umg.ia.domain.History;
import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertTrue;

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
}
