package edu.umg.ia.engine;

import edu.umg.ia.domain.Chapter;
import io.vavr.Tuple2;

public class GameState {
    private Tuple2 status;
    private Chapter currentChapter;

    public GameState(Chapter currentChapter, Tuple2 status) {
        this.status = status;
        this.currentChapter = currentChapter;
    }

    public Tuple2 getStatus() {
        return status;
    }

    public void setStatus(Tuple2 status) {
        this.status = status;
    }

    public Chapter getCurrentChapter() {
        return currentChapter;
    }

    public void setCurrentChapter(Chapter currentChapter) {
        this.currentChapter = currentChapter;
    }
}
