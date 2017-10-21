package edu.umg.ia.dao;

import com.google.gson.Gson;
import edu.umg.ia.domain.History;
import io.vavr.control.Try;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

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

}
