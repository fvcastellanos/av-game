package edu.umg.ia.engine;

import edu.umg.ia.command.CommandParser;
import edu.umg.ia.command.domain.Command;
import edu.umg.ia.command.domain.CommandEnum;
import edu.umg.ia.engine.dao.HistoryDao;
import edu.umg.ia.engine.domain.Chapter;
import edu.umg.ia.engine.domain.GameEvent;
import edu.umg.ia.engine.domain.GameState;
import edu.umg.ia.engine.domain.History;
import edu.umg.ia.engine.domain.Thing;
import edu.umg.ia.engine.inventory.ThingInventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.StateMachine;

import java.util.Optional;

import static edu.umg.ia.engine.domain.GameState.CHAPTER_ONE_GOAL_I;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_ONE_GOAL_II;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_ONE_GOAL_III;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_THREE_GOAL_I;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_THREE_GOAL_II;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_THREE_GOAL_III;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_TWO_GOAL_I;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_TWO_GOAL_II;
import static edu.umg.ia.engine.domain.GameState.CHAPTER_TWO_GOAL_III;
import static edu.umg.ia.engine.format.ResponseFormatter.error;

public class GameEngine {

	private Logger logger = LoggerFactory.getLogger(GameEngine.class);
	private String historyFile;
	private History history;
	private HistoryDao historyDao;
	private ThingInventory inventory;
	private StateMachine<GameState, GameEvent> stateMachine;
	private Chapter currentChapter;
	private CommandParser commandParser;
	private boolean gameStarted;
	
	public GameEngine(String historyName, HistoryDao historyDao,
                      ThingInventory inventory,
                      StateMachine<GameState, GameEvent> stateMachine,
                      CommandParser commandParser) {
		this.historyFile = historyName + ".json";
		this.historyDao = historyDao;
		this.inventory = inventory;
		this.stateMachine = stateMachine;
		this.commandParser = commandParser;
		gameStarted = false;
	}

	public String tell(String entry) {
	    Command command = commandParser.parse(entry);

	    if (command.getCommand().equals(CommandEnum.ERROR)) {
	        return error("Lo siento, no entiendo lo que dices...");
        }

        String response = commandProvider(command);

	    if (stateMachine.getState().getId().equals(GameState.END_GAME)) {
	        response+= "\n\n" + history.getEpilogue();
	        gameStarted = false;
	        stateMachine.stop();
        }

	    return response;
    }

    public void restart() {
	    if (!stateMachine.isComplete()) {
	        stateMachine.stop();
        }

        stateMachine.start();
	    gameStarted = false;
    }

    private String commandProvider(Command command) {
	    switch (command.getCommand()) {
            case START_GAME:
                return startGame();
            case WHERE_AM_I:
                return whereAmI();
            case GET_INSTRUCTIONS:
                return getInstructions();
            case VIEW_INVENTORY:
                return viewInventory();
            case OPEN:
                return actionProvider(command);
            case CLOSE:
                return actionProvider(command);
            case TAKE:
                return actionProvider(command);
            case VIEW:
                return actionProvider(command);
            case USE:
                return actionProvider(command);

        }

        return error("Lo siento, no puedo hacer lo que pides");
    }

	private String startGame() {
		logger.info("Starting game: {}", historyFile);
		Optional<History> historyHolder = historyDao.loadHistory(historyFile);
		stateMachine.sendEvent(GameEvent.GAME_STARTED);

		if (gameStarted || stateMachine.hasStateMachineError()) {
            return error("No puedo hacer lo que me pides, el juego ya ha comenzado...");
        }

		if (!historyHolder.isPresent()) {
			logger.error("Can't load game: {}", historyFile);
			return error("No puedo iniciar el juego, lo siento");
		}
	
		history = historyHolder.get();

		String message = history.getTitle() + "\n" + history.getIntro() + "\n"
                + startChapterI();

		logger.info("History: {} loaded", history.getTitle());
		gameStarted = true;
		return message;
	}

	private String startChapterI() {
	    stateMachine.sendEvent(GameEvent.INIT_CHAPTER_I);

        currentChapter = history.getChapters().stream()
                .filter(chapter -> chapter.isStart())
                .findFirst().get();

        // Move to the first goal
        stateMachine.sendEvent(GameEvent.INIT_CHAPTER_I);

        return currentChapter.getName() + "\n" + currentChapter.getIntro();
    }

    private String startChapterII() {
	    stateMachine.sendEvent(GameEvent.INIT_CHAPTER_II);
	    currentChapter = getChapter(currentChapter.getNext());

        // Move to the first goal
        stateMachine.sendEvent(GameEvent.INIT_CHAPTER_II);

        return currentChapter.getName() + "\n" + currentChapter.getIntro();
    }

    private String startChapterIII() {
        stateMachine.sendEvent(GameEvent.INIT_CHAPTER_III);
        currentChapter = getChapter(currentChapter.getNext());

        // Move to the first goal
        stateMachine.sendEvent(GameEvent.INIT_CHAPTER_III);

        return currentChapter.getName() + "\n" + currentChapter.getIntro();
    }

    private String whereAmI() {
        if (isInitialState()) {
            return errorGameNotStarted();
        }

        return currentChapter.getDescription();
    }

    private String getInstructions() {
        if (isInitialState()) {
            return errorGameNotStarted();
        }

        return currentChapter.getInstructions();
    }

    private String viewInventory() {
	    if (isInitialState()) {
	        return errorGameNotStarted();
        }

        return error("Cosas: " + inventory.getItems());
    }

    private String actionProvider(Command command) {
	    logger.info("item name: {}", command.getItem());
        if (!itemIsPresent(command.getItem())) {
            logger.error("can't act over an non existing item: {}", command.getItem());
            return error("No puedo actuar sobre un item que no existe, lo siento");
        }

        Thing thing = getItem(command.getItem());

        CommandEnum action = CommandEnum.valueOf(thing.getAction());
        if (!action.equals(command.getCommand())) {
            return error("No puedo hacer eso en este momento...");
        }

        if (CommandEnum.USE.equals(command.getCommand())) {
            if (!itemIsPresent(command.getToItem())) {
                logger.error("can't use item: {} over a non existing item: {}", command.getItem(), command.getToItem());
                return error("No puedo usar ese item");
            }

            if (inventory.get(thing.getName()) == null) {
                logger.error("the item: {} is not in the inventory", thing.getName());
                return error("El item que se quiere usar no se encuentra en el inventario");
            }
        }

        boolean accepted = stateMachine.sendEvent(getNextEvent(thing.getOrder()));

        if (!accepted) {
            logger.error("action not expected at this time: {}", command.getMessage());
            return error("No puedo hacer eso en este momento...");
        }

        if (CommandEnum.TAKE.equals(command.getCommand()) || thing.isPortable()) {
            logger.info("item {} is portable, it will be added to the inventory", thing.getName());
            inventory.add(thing.getName(), thing);
        }

        thing.setCompleted(true);
	    return thing.getDescription() + "\n" + startNextChapter();
    }

    private String startNextChapter() {
        GameState state = stateMachine.getState().getId();
        String epilogue = "\n" + currentChapter.getEpilogue();
        switch (state) {
            case CHAPTER_TWO:
                return epilogue + "\n" + startChapterII();

            case CHAPTER_THREE:
                return epilogue + "\n" + startChapterIII();
        }

        return "\n";
    }

    private boolean itemIsPresent(String name) {
	    return currentChapter.getThings().stream()
                .anyMatch(thing -> thing.getName().equals(name));
    }

    private Thing getItem(String name) {
	    return currentChapter.getThings().stream()
                .filter(thing -> (thing.getName().equals(name) && !thing.isCompleted()))
                .findFirst()
                .get();
    }

    private String errorGameNotStarted() {
	    return error("No se ha iniciado el juego");
    }

    private boolean isInitialState() {
        if (stateMachine.getState().equals(stateMachine.getInitialState())) {
            return true;
        }

        return false;
    }

    private GameEvent getNextEvent(int order) {
	    GameState state = stateMachine.getState().getId();

	    switch (order) {
            case 1:
                if (state.equals(CHAPTER_ONE_GOAL_I)) return GameEvent.CHAPTER_I_GOAL_I_COMPLETED;
                if (state.equals(CHAPTER_TWO_GOAL_I)) return GameEvent.CHAPTER_II_GOAL_I_COMPLETED;
                if (state.equals(CHAPTER_THREE_GOAL_I)) return GameEvent.CHAPTER_III_GOAL_I_COMPLETED;

            case 2:
                if (state.equals(CHAPTER_ONE_GOAL_II)) return GameEvent.CHAPTER_I_GOAL_II_COMPLETED;
                if (state.equals(CHAPTER_TWO_GOAL_II)) return GameEvent.CHAPTER_II_GOAL_II_COMPLETED;
                if (state.equals(CHAPTER_THREE_GOAL_II)) return GameEvent.CHAPTER_III_GOAL_II_COMPLETED;

            case 3:
                if (state.equals(CHAPTER_ONE_GOAL_III)) return GameEvent.CHAPTER_I_GOAL_III_COMPLETED;
                if (state.equals(CHAPTER_TWO_GOAL_III)) return GameEvent.CHAPTER_II_GOAL_III_COMPLETED;
                if (state.equals(CHAPTER_THREE_GOAL_III)) return GameEvent.CHAPTER_III_GOAL_III_COMPLETED;
        }

        return GameEvent.NONE;
    }

    private Chapter getChapter(int id) {
	    return history.getChapters().stream()
                .filter(chapter -> (chapter.getId() == id))
                .findFirst().get();
    }
}
